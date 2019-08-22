package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;

public interface LoginService {
    User Login(User stu);
    Teacher Login(Teacher tec);

}
