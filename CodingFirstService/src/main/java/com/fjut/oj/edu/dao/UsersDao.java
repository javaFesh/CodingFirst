package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao {

    List<User> queryAll();

    Boolean insert(User user);

}