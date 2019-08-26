package com.fjut.oj.edu.controller;


import com.fjut.oj.edu.model.Mall;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.MallService;
import org.apache.commons.io.FilenameUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes("user")//模拟登录已有的userSession
public class MallController {
    @Resource
    private MallService mallService;
//模拟登录过程//直接转发给mall.jsp页面
    @RequestMapping("login")
    public String login(Model model){
        User user=new User();
        user.setUserId(999);
        user.setNick("javaFish");
        user.setAcb(100);
        model.addAttribute("user",user);
        return "mall";
    }

    //Ajax获取总页数
    @RequestMapping(value = "getPageCount")
    @ResponseBody
    public Integer getPageCount(){
        Integer pageCount=mallService.mallCount();
        return pageCount;
    }



    //用来传送分页信息
    @RequestMapping(value = "index{pageNum}" )
    @ResponseBody
    public List<Mall> AllMallByPage(@PathVariable(value="pageNum")Integer pageNum){
        List<Mall> malls;
        if (pageNum>mallService.mallCount()){
       malls =mallService.findAllByPage(pageNum-1);}
        else if (pageNum<1){
         malls =mallService.findAllByPage(1);}

        else {
            malls =mallService.findAllByPage(pageNum);
        }
        return malls;

    }

    //用来添加商品
    @RequestMapping(value = "addMall", method = RequestMethod.POST)
    @ResponseBody
    public String add(HttpServletRequest request,@SessionAttribute User user,String mallTitle,String mallImg, Integer acb,Integer rmb,Date endTime,Integer buyLimit,Integer mallAccount,@RequestParam(value = "myfile", required = false) MultipartFile myfile){


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
                Mall mall=new Mall(mallTitle,myFilePath,acb,rmb,user.getUserId(),endTime,buyLimit,mallAccount);
                if (mallService.addMall(mall)){
                    return "succsess";
                }
                else {
                    return "faliure";
                }
            } else {
                request.setAttribute("uploadFileError", "*上传文件格式不正确!");
                return "error";
            }

        }



return "faliure";





    }


    //用来删除商品
    @RequestMapping("deleteMall")
    public String delect(Integer mallId){
        if (mallService.deleteMall(mallId)){
            return "succsess";
        }
        else {
            return "faliure";
        }
    }

//文件上传

    @RequestMapping("index.html")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String upload(@RequestParam("desc") String desc, HttpServletRequest request,
                         @RequestParam(value = "myfile", required = false) MultipartFile myfile) {

        String myFilePath = null;// 文件保存到数据库的路径

        System.out.println("文件描述:" + desc);

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
            int fileSize = 5000000;// 文件大小5M
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
            } else {
                request.setAttribute("uploadFileError", "*上传文件格式不正确!");
                return "error";
            }

        }

        return "success";
    }


}
