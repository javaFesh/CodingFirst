package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Chapter;
import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.model.Order;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CourseSrevice {
    //进入单个课程
    Course findCourseById(Integer courseId);

    //按照课程和章节id查询章节
    Chapter findChapterByChapterId(Integer chapterId,Integer courseId);

    //创建课程,初始章节数为0
    Boolean addCourse(Course course);

    //创建课时（事务，同时使课程章节数加一）

    Boolean addChapter(Chapter chapter) throws Exception;

    //删除课时（事务，同时使课程章节数减一）

    Boolean deleteChapter( Chapter chapter) throws Exception;

    //删除课程（事务:同时删除所有课时）
    Boolean DeleteCourse(Integer courseId);

    //查询全部有效课程
    List<Course> findAllCourse(int pageNum);

    //查询某课程所有章节
    List<Chapter> findAllChapterByCourseId(int pageNum, Integer courseId);
    //查询某课程所有章节的页面总数
    Integer findChapterAccountByCourseId(Integer courseId);


    //查询所有有效购买时间课程总数
    Integer findAllAccountGood();

    //查询单个课程
    Course findCourse(Integer courseId);



    //查询单个教师的所有课程数量
    Integer findAllAccountTeacher(Integer teacherId);

    //修改课程
    Boolean updataCoures(Course course);


}
