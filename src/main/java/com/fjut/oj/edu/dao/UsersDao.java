package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao {

    List<User> queryAll();//查询全部学生

    void insert(@Param("User")User user);//插入学生(用于注册)

    User queryById(@Param("User") User user);//查询某个id的学生信息，用于判断账户是否重复

    void UpdateById(@Param("User")User user);//更新个人信息

    User selectNick(String nick);//查询某个昵称是否重复


}