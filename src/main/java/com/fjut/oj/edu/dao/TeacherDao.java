package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao {
    List<Teacher> queryAllTeacher();//查询全部老师

    Teacher queryTeacherById();//根据ID查询教师


    Boolean insertTeacher(Teacher teacher);//添加教师

    Boolean updataTeacher(Teacher teacher);//修改教师
}