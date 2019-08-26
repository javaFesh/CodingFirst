package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.TeacherDao;
import com.fjut.oj.edu.dao.UsersDao;
import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.InfoUpdateService;

import javax.annotation.Resource;

public class InfoUpdateImpl implements InfoUpdateService {
    @Resource
    UsersDao usersDao;
    @Resource
    TeacherDao teacherDao;
    @Override
    public User UserUpdate(User user) {
        usersDao.UpdateById(user);
        return usersDao.queryById(user);
    }

    @Override
    public Teacher TeacherUpdate(Teacher teacher) {
        teacherDao.updateTeacher(teacher);
        return teacherDao.queryById(teacher);
    }
}
