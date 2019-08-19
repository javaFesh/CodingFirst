package com.fjut.oj.edu.controller;



import com.fjut.oj.edu.model.Demo;
import com.fjut.oj.edu.service.DemoService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Controller
public class DemoController {

    @Resource
    DemoService demoService;

//    查找全部样例
    @RequestMapping(value = "findAll")
    public String findAll(Model model){
        List<Demo> demos=demoService.queryAll();
        model.addAttribute("demos",demos);
        return "demo";
    }


//    样例ajax
    @RequestMapping(value = "demoajax")
    @ResponseBody
    public Demo demoAjax(){
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("样例");
        return demo;

    }


    @RequestMapping(value = "load")
    public String lode(){
        return "fileupload";
    }



//样例文件上传
    @RequestMapping(value = "fileupload", method = RequestMethod.POST)
    public @ResponseBody  String upload(@RequestParam(value = "file", required = false)MultipartFile file, HttpServletRequest request) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");


        if (!file.isEmpty()) {
            String res = sdf.format(new Date());
            // uploads文件夹位置
            String rootPath = request.getSession().getServletContext().getRealPath("statics" + File.separator + "uploads");
            // 原始名称
            String originalFileName = file.getOriginalFilename();
            System.out.println("原文件名:" + originalFileName);
            // 读取文件扩展名
            String extName = FilenameUtils.getExtension(originalFileName);
            System.out.println("扩展名:" + extName);
            //代码区设定文件大小
            int fileSize = 5000000;// 文件大小5M
            // 读取文件大小
            System.out.println("文件大小:" + file.getSize());


            if (file.getSize() > fileSize)
            {// 文件超过限定
                request.setAttribute("uploadFileError", "*上传文件超过5M!");
                return "error";
            }
            else if (extName.equalsIgnoreCase("jpg") || extName.equalsIgnoreCase("png")
                    || extName.equalsIgnoreCase("pdf") || extName.equalsIgnoreCase("pneg"))
            {// 扩展名是否合法
                // 新文件名
                String newFileName = "sliver" + res + originalFileName.substring(originalFileName.lastIndexOf("."));
                // 创建年月文件夹
                Calendar date = Calendar.getInstance();
                File dateDirs = new File(date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH) + 1));

                // 新文件
                File newFile = new File(rootPath + File.separator + dateDirs + File.separator + newFileName);
                // 判断目标文件所在目录是否存在
                if (!newFile.getParentFile().exists()) {
                    // 如果目标文件所在的目录不存在，则创建父目录
                    newFile.getParentFile().mkdirs();
                }
                System.out.println(newFile);
                // 将内存中的数据写入磁盘
                file.transferTo(newFile);
                // 完整的url
                String fileUrl = date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH) + 1) + File.separator + newFileName;
                return fileUrl;
            }

            else{return "error";}
        }


        return null;
    }



    }
