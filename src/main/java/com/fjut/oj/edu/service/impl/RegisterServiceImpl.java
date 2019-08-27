package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.TeacherDao;
import com.fjut.oj.edu.dao.UsersDao;
import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    UsersDao usersDao;

    @Resource
    TeacherDao teacherDao;
    @Override
    public boolean Register(Teacher teacher) {
        Teacher teacher1=null;
        teacher1=teacherDao.selectNick(teacher.getNick());
        if(teacher1!=null)
        return false;
        else{
            teacherDao.insert(teacher);
            return true;
        }
    }

    @Override
    public boolean Register(User user) {
        User user1=null;
        user1=usersDao.selectNick(user.getNick());
        if(user1!=null)
            return false;
        else{
            usersDao.insert(user);
            return true;
        }
    }
}
