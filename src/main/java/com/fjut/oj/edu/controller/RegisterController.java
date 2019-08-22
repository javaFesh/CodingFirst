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

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/Register")
public class RegisterController {

    private static Logger logger=Logger.getLogger(String.valueOf(RegisterController.class));
    private RegisterService registerService;
    private TeacherDao teacherdao;


    @RequestMapping(value = "/stuRegister",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> RegisterUser(HttpSession session){
        Map<String,Object> result=new HashMap<>();
        User user=new User();
        user.setNick((String)session.getAttribute("nick"));
        user.setUserPwd((String) session.getAttribute("Pwd"));
        user.setRegistertime(new Date());
        logger.info("用户注册：用户昵称:"+session.getAttribute("nick")+",密码:"+session.getAttribute("Pwd"));
            try{
                registerService.Register(user);
                result.put("RegisterInfo","注册成功！");
            }catch (Exception e){
                result.put("RegisterInfo","注册失败！");
            }
        return result;
    }


}
