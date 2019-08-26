package com.fjut.oj.edu.test.service;

import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.service.CourseSrevice;
import com.fjut.oj.edu.test.BaseJunit4Test;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class courseServiceTest extends BaseJunit4Test {
    @Resource
    private CourseSrevice courseSrevice;

    @Test
    public void test(){


        List<Course> courseList=courseSrevice.findAllCourse(2);

        System.out.println(courseList.size());
    }

}
