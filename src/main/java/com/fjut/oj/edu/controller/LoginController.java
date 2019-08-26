package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


@Controller
@RequestMapping(value = "/Login")
public class LoginController {

    private static Logger logger = Logger.getLogger(String.valueOf(LoginController.class));
    @Resource
    private LoginService loginService;
    @RequestMapping(value = "/stuLogin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> checkUser(String nick,String pwd){
        Map<String,Object> result=new HashMap<>();
        User user=new User();
        user.setNick(nick);
        user.setUserPwd(pwd);
        if(null!=loginService.Login(user)){
            User user1 =loginService.Login(user);
            result.put("loginStu",user1);
        }else{
            result.put("loginInfo","该用户不存在，请检查密码或者用户名");
        }
        return result;
    }



    @RequestMapping(value = "/tecLogin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> checkTeacher(String nick,String pwd){
        Map<String,Object> result=new HashMap<>();
        Teacher teacher=new Teacher();

        teacher.setNick(nick);
        teacher.setTeacherPwd(pwd);
        if(null!=loginService.Login(teacher)){
            Teacher teacher1=loginService.Login(teacher);
            result.put("logintec",teacher1);
        }else{
            result.put("loginInfo","该用户不存在，请检查密码或者用户名");
        }
        return result;
    }




}
