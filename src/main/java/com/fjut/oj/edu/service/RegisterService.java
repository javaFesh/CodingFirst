package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;

public interface RegisterService {
    boolean Register(Teacher teacher);
    boolean Register(User user);

}
