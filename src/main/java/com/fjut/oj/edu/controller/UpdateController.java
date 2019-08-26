package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.InfoUpdateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/Update")
public class UpdateController {
    @Resource
    private InfoUpdateService infoUpdateService;


    @RequestMapping(value = "/UserUpdate", method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> UserUpdate(String userImg,String userPwd,String nick,String gender,String school,String email,String motto,String name,String userId,String phone){
        User user=new User();
        user.setUserId(Integer.parseInt(userId));
        user.setUserPwd(userPwd);
        user.setGender(gender);
        user.setNick(nick);
        user.setEmail(email);
        user.setMotto(motto);
        user.setName(name);
        user.setPhone(phone);
        user.setSchool(school);
        user.setUserimg(userImg);
        Map<String ,Object> result=new HashMap<>();
        try{
            User user1=infoUpdateService.UserUpdate(user);
            result.put("reslut0",user1);
        }catch (Exception e){
            result.put("result1","修改失败");
        }
        return result;

    }

    @RequestMapping(value = "/TeacherUpdate", method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> TeacherUpdate(String teacherPwd,String nick,String gender,String school,String email,String motto,String name,String phone,String teacherId ){
        Teacher teacher=new Teacher();
        teacher.setTeacherPwd(teacherPwd);
        teacher.setNick(nick);
        teacher.setEmail(email);
        teacher.setGender(gender);
        teacher.setMotto(motto);
        teacher.setName(name);
        teacher.setPhone(phone);
        teacher.setSchool(school);
        teacher.setTeacherId(Integer.parseInt(teacherId));
        Map<String ,Object> result=new HashMap<>();
        try{
            Teacher teacher1=infoUpdateService.TeacherUpdate(teacher);
            result.put("reslut0",teacher1);
        }catch (Exception e){
            result.put("result1","修改失败");
        }
        return result;
    }

}
