package com.fjut.oj.edu.test.dao;

import com.fjut.oj.edu.dao.CourseDao;
import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.model.Demo;
import com.fjut.oj.edu.test.BaseJunit4Test;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class CourseDaoTest extends BaseJunit4Test {
    @Resource
    private CourseDao courseDao;

    @Test
    public void Test(){

        List<Course> courseList=courseDao.findAllCourse(new RowBounds(0,5));
        for (Course course: courseList
        ) {
            System.out.println(course.getCourseName());

        }

       System.out.println(courseDao.findAllAccountGood());
    }




}
