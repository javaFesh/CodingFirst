package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;

public interface InfoUpdateService {
    public User UserUpdate(User user);
    public Teacher TeacherUpdate(Teacher teacher);
}
