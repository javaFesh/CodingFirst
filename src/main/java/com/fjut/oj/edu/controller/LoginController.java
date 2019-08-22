package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.dao.UsersDao;
import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


@Controller
@RequestMapping(value = "/Login")
public class LoginController {

    private static Logger logger = Logger.getLogger(String.valueOf(LoginController.class));
    private LoginService loginService;
    private UsersDao usersDao;
    @RequestMapping(value = "/stuLogin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> checkUser(HttpSession session){
        Map<String,Object> result=new HashMap<>();
        User user=new User();
        user.setNick((String)session.getAttribute("nick"));
        user.setUserPwd((String) session.getAttribute("Pwd"));
        logger.info("用户登录：用户昵称:"+session.getAttribute("nick")+",密码:"+session.getAttribute("Pwd"));
        User tuser=loginService.Login(user);
        if(tuser!=null){
            result.put("loginStu",tuser);
        }else{
            result.put("loginInfo","该用户不存在，请检查密码或者用户名");
        }
        return result;
    }

    @RequestMapping(value = "/tecLogin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> checkTeacher(HttpSession session){
        Map<String,Object> result=new HashMap<>();
        Teacher teacher=new Teacher();

        teacher.setNick((String)session.getAttribute("nick"));
        teacher.setTeacherPwd((String) session.getAttribute("Pwd"));
        logger.info("用户登录：用户昵称:"+session.getAttribute("id")+",密码:"+session.getAttribute("Pwd"));
        Teacher teacher1=loginService.Login(teacher);
        if(teacher1!=null){
            result.put("logintec",teacher1);
        }else{
            result.put("loginInfo","该用户不存在，请检查密码或者用户名");
        }
        return result;
    }


}
