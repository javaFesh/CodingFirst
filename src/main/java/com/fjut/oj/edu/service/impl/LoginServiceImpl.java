package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.TeacherDao;
import com.fjut.oj.edu.dao.UsersDao;
import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    UsersDao usersDao;

    @Resource
    TeacherDao teacherDao;

    public User Login(User stu) {
        User user=usersDao.queryById(stu);
            return user;

    }

    @Override
    public Teacher Login(Teacher tec) {
        Teacher user=teacherDao.queryById(tec);
            return user;
    }
}
