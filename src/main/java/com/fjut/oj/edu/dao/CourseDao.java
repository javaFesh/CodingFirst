package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Course;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {

    //添加课程信息
    Boolean insertCourse(Course course);

    //查询所有有效购买时间课程信息
    List<Course> findAllCourse(RowBounds rowBounds);
    //按照ID查询课程信息
    Course findCourseById(Integer courseId);

    //查询所有过期课程信息
    List<Course> findAllCourseBad(RowBounds rowBounds);

    //删除课程信息
    Boolean deleteCourse(Integer courserId);

    //按照教师查询

    List<Course> findAllCourseByTer(RowBounds rowBounds,Integer teacherId);


}