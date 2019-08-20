package com.fjut.oj.edu.controller;


import com.fjut.oj.edu.model.Demo;
import com.fjut.oj.edu.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DemoController {

    @Resource
    DemoService demoService;



    @RequestMapping(value = "findAll")
    public String findAll(Model model){
        List<Demo> demos=demoService.queryAll();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(demos.size());
        model.addAttribute("demos",demos);
        return "demo";
    }

    @RequestMapping(value = "demoajax")
    @ResponseBody
    public Demo demoAjax(){
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("样例");
        return demo;

    }



}
