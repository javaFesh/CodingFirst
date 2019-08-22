package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Teacher;
import com.fjut.oj.edu.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao {
    List<Teacher> queryAll();//查询全部老师

    Teacher queryById(@Param("Teacher")Teacher teacher);//根据ID查询教师


    void insert(@Param("Teacher")Teacher teacher);//添加教师

    void updateTeacher(@Param("Teacher")Teacher teacher);//修改教师

    Teacher selectNick(String nick);//查询某个昵称是否重复
}