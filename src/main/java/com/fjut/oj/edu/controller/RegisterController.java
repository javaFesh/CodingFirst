package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.dao.TeacherDao;
import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.LoginService;
import com.fjut.oj.edu.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/Register")
public class RegisterController {

    private static Logger logger=Logger.getLogger(String.valueOf(RegisterController.class));
    @Resource
    private RegisterService registerService;

    @RequestMapping(value = "/stuRegister",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> RegisterUser(String nick,String Pwd){
        Map<String,Object> result=new HashMap<>();
        User user=new User();
        user.setNick(nick);
        user.setUserPwd(Pwd);
        user.setRegistertime(new Date());
            try{
                registerService.Register(user);
                result.put("RegisterInfo","注册成功！");
            }catch (Exception e){
                result.put("RegisterInfo","注册失败！");
            }
        return result;
    }

    @RequestMapping(value = "/TeaRegister",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> RegisterTeacher(String nick,String Pwd){
        Map<String,Object> result=new HashMap<>();
        Teacher teacher=new Teacher();
        teacher.setNick(nick);
        teacher.setTeacherPwd(Pwd);
        teacher.setRegistertime(new Date());
        try{
            registerService.Register(teacher);
            result.put("RegisterInfo","注册成功！");
        }catch (Exception e){
            result.put("RegisterInfo","注册失败！");
        }
        return result;
    }

}
