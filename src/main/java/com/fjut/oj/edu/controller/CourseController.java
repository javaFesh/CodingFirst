package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.model.*;
import com.fjut.oj.edu.service.CourseSrevice;
import org.apache.commons.io.FilenameUtils;
import org.springframework.http.codec.json.AbstractJackson2Decoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes(value = {"teacher","user"})//模拟登录已有的userSession
public class CourseController {

    @Resource
    private CourseSrevice courseSrevice;
    //模拟两个角色登录过程
    @RequestMapping("teacherLogin")
    public String login(Model model){
        Teacher teacher=new Teacher();
        teacher.setTeacherId(999);
        teacher.setSchool("福建工程学院");
        model.addAttribute("teacher",teacher);
        User user=new User();
        user.setUserId(999);
        user.setNick("javaFish");
        user.setAcb(100);
        model.addAttribute("user",user);
        return "课程页面";
    }

    //Ajax获取所有可用课程页数
    @RequestMapping(value = "getCoursePageCount")
    @ResponseBody
    public Integer getCoursePageCount(){
        return courseSrevice.findAllAccountGood();
    }

    //获取全部可用课程分页
    @RequestMapping(value = "Course/index{pageNum}" )
    @ResponseBody
    public List<Course> AllMallByPage(@PathVariable(value="pageNum")Integer pageNum){
        List<Course> malls;
        if (pageNum>courseSrevice.findAllAccountGood()){
            malls =courseSrevice.findAllCourse(pageNum-1);}
        else if (pageNum<1){
            malls =courseSrevice.findAllCourse(1);}

        else {
            malls =courseSrevice.findAllCourse(pageNum);
        }
        return malls;

    }

    //AJAx添加课程
    @RequestMapping(value = "addCourse", method = RequestMethod.POST)
    @ResponseBody
    public String add(@SessionAttribute Teacher teacher,HttpServletRequest request,@RequestParam(value = "myfile", required = false) MultipartFile myfile) throws ParseException {
        String courseName=request.getParameter("courseName");//课程名称
        String courseIntroduction=request.getParameter("courseIntroduction");;//课程介绍
        String courseImg=request.getParameter("courseImg");;//课程图片
        Date courseStartTime=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(request.getParameter("courseStartTime"));//课程开始时间
        Date courseEndTime= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(request.getParameter("courseEndTime"));//课程结束时间
        Integer teacherId=teacher.getTeacherId();//教师ID
        Integer courseCharge= Integer.valueOf(request.getParameter("courseCharge"));;//课程价格
        Course course=new Course(courseName,courseIntroduction,courseImg,0,courseStartTime,courseEndTime,teacherId,courseCharge,0,0);
        String myFilePath = null;// 文件保存到数据库的路径
        if (!myfile.isEmpty()) {// 图片有上传
            // 读取uploads的真实路径
            String path = request.getSession().getServletContext().getRealPath("statics" + File.separator + "uploads");
            System.out.println("path:" + path);
            // 读取原文件名
            String oldFileName = myfile.getOriginalFilename();
            System.out.println("原文件名:" + oldFileName);
            // 读取文件扩展名
            String extName = FilenameUtils.getExtension(oldFileName);
            System.out.println("扩展名:" + extName);
            long fileSize = 5*1024*1024;// 文件大小500M
            // 读取文件大小
            System.out.println("文件大小:" + myfile.getSize());

            if (myfile.getSize() > fileSize) {// 文件超过限定
                request.setAttribute("uploadFileError", "*上传文件超过5M!");
                return "error";
            } else if (extName.equalsIgnoreCase("jpg") || extName.equalsIgnoreCase("png")
                    || extName.equalsIgnoreCase("jpeg") || extName.equalsIgnoreCase("pneg")) {// 扩展名是否合法
                // 重命名文件
                String fileName = System.currentTimeMillis() + "_user." + extName;
                System.out.println("新文件名:" + fileName);
                // 创建文件对象,接收从客户端已经传到服务器的文件流
                File targetFile = new File(path, fileName);

                try {
                    myfile.transferTo(targetFile); // 保存文件
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //文件路径
                myFilePath="statics" + File.separator + "uploads"+File.separator+fileName;
                System.out.println("保存到数据库的文件路径:"+myFilePath);
                course.setCourseImg(myFilePath);
                if (courseSrevice.addCourse(course)){
                    return "succsess";
                }
                else {
                    return "error";
                }
            } else {
                request.setAttribute("uploadFileError", "*上传文件格式不正确!");
                return "error";
            }

        }


        return "error";
    }

    //AjAX删除课程
    @RequestMapping(value = "deleteCourse", method = RequestMethod.POST)
    @ResponseBody
    public String deleteCourse(@SessionAttribute Teacher teacher,Integer courseId){
        if (courseSrevice.DeleteCourse(courseId))
            return "删除成功";
        return "失败";
    }
    //AjAX添加章节
    @RequestMapping(value = "addChapter", method = RequestMethod.POST)
    @ResponseBody
    public String addChapter(HttpServletRequest request,@RequestParam(value = "myfile", required = false) MultipartFile myfile){
        Integer chapterId= Integer.valueOf(request.getParameter("chapterId"));//课时ID
        Integer courseId=Integer.valueOf(request.getParameter("chapterId"));//对相应的课程ID
        String chapterName=request.getParameter("chapterName");//章节名
        String chapterIntroductions=request.getParameter("chapterIntroductions");//章节描述
        String chapterResource=request.getParameter("chapterResource");//章节资源

        Chapter chapter=new Chapter();
        String myFilePath = null;// 文件保存到数据库的路径
        if (!myfile.isEmpty()) {// 图片有上传
            // 读取uploads的真实路径
            String path = request.getSession().getServletContext().getRealPath("statics" + File.separator + "uploads");
            System.out.println("path:" + path);
            // 读取原文件名
            String oldFileName = myfile.getOriginalFilename();
            System.out.println("原文件名:" + oldFileName);
            // 读取文件扩展名
            String extName = FilenameUtils.getExtension(oldFileName);
            System.out.println("扩展名:" + extName);
            long fileSize = 500*1024*1024;// 文件大小500M
            // 读取文件大小
            System.out.println("文件大小:" + myfile.getSize());

            if (myfile.getSize() > fileSize) {// 文件超过限定
                request.setAttribute("uploadFileError", "*上传文件超过500M!");
                return "error";
            } else if (extName.equalsIgnoreCase("mp4") || extName.equalsIgnoreCase("avi")
                    ) {// 扩展名是否合法
                // 重命名文件
                String fileName = System.currentTimeMillis() + "_user." + extName;
                System.out.println("新文件名:" + fileName);
                // 创建文件对象,接收从客户端已经传到服务器的文件流
                File targetFile = new File(path, fileName);

                try {
                    myfile.transferTo(targetFile); // 保存文件
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //文件路径
                myFilePath="statics" + File.separator + "uploads"+File.separator+fileName;
                System.out.println("保存到数据库的文件路径:"+myFilePath);
                chapter.setChapterResource(myFilePath);
                try {
                    if (courseSrevice.addChapter(chapter)){
                        return "succsess";
                    }
                    else {
                        return "error";
                    }
                } catch (Exception e) {
                    return "error";
                }
            } else {
                request.setAttribute("uploadFileError", "*上传文件格式不正确!");
                return "error";
            }

        }


        return "error";
    }

    //AjAX删除章节
    @RequestMapping(value = "deleteChapter")
    @ResponseBody
    public String deleteCourse(@SessionAttribute Teacher teacher,Integer courseId,Integer chapterId) throws Exception {
        if (courseSrevice.deleteChapter(courseSrevice.findChapterByChapterId(chapterId,courseId)))
            return "删除成功";
        return "失败";
    }


    //获取单个课程所有章节页数

    @RequestMapping(value = "getChaptersPageCount")
    @ResponseBody
    public Integer getChaptersPageCount(Integer courseId){
        return courseSrevice.findChapterAccountByCourseId(courseId);
    }


    //获取课程章节信息
    @RequestMapping(value = "Chapters/index{pageNum}")
    @ResponseBody
    public List<Chapter> getChapters(@PathVariable(value="pageNum")Integer pageNum,@SessionAttribute Teacher teacher,Integer courseId){
        List<Chapter> chapters=null;
        if (pageNum>courseSrevice.findChapterAccountByCourseId(courseId)){
            chapters =courseSrevice.findAllChapterByCourseId(pageNum-1,courseId);}
        else if (pageNum<1){
            chapters =courseSrevice.findAllChapterByCourseId(1,courseId);}
        else {
            chapters =courseSrevice.findAllChapterByCourseId(pageNum,courseId);
        }
        return chapters;
    }


    //获取单章节信息

    @RequestMapping(value = "findCourse{courseId}")
    public String findAll(Model model,@PathVariable(value="courseId")Integer courseId){
        Course course=courseSrevice.findCourse(courseId);
        model.addAttribute("Course",course);
        return "Course";
    }


}
