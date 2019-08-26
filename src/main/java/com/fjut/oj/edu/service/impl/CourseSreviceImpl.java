package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.ChapterDao;
import com.fjut.oj.edu.dao.CourseDao;
import com.fjut.oj.edu.model.Chapter;
import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.model.Order;
import com.fjut.oj.edu.service.CourseSrevice;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CourseSreviceImpl implements CourseSrevice {

    @Resource
    private CourseDao courseDao;
    @Resource
    private ChapterDao chapterDao;

    @Override
    public Course findCourseById(Integer courseId) {
        return courseDao.findCourseById(courseId);
    }

    @Override
    public Boolean addCourse(Course course) {
        return courseDao.insertCourse(course);
    }

    @Transactional(rollbackFor=Exception.class,isolation= Isolation.READ_COMMITTED)
    @Override
    public Boolean addChapter(Chapter chapter){
        //获取父课程Id
        try{
        Course course=courseDao.findCourseById(chapter.getCourseId());
        if(chapterDao.insertChapter(chapter)){
            //进行父课程加一操作
            course.setCourseLength(course.getCourseLength()+1);
            if (courseDao.updataCourse(course))
                return true;//成功返回
            throw new  Exception();//失败回滚
        }
        throw new  Exception();//失败回滚

    } catch (Exception e) {
        return false;
    }
    }


    @Transactional(rollbackFor=Exception.class,isolation= Isolation.READ_COMMITTED)
    @Override
    public Boolean deleteChapter(Chapter chapter) {
        //获取父课程Id
        try {
        Course course=courseDao.findCourseById(chapter.getCourseId());
        if(chapterDao.deleteChapterByChapterId(chapter.getChapterId(),chapter.getCourseId())){
            //进行父课程减一一操作
            course.setCourseLength(course.getCourseLength()-1);
            if (course.getCourseLength()<0)
                throw new  Exception();//为负数，不能减少，回滚
            if (courseDao.updataCourse(course))
                return true;//成功返回
            throw new  Exception();//失败回滚
        }
        throw new  Exception();//失败回滚
        }
        catch (Exception e

        ){
            return false;
        }
    }
    @Transactional(rollbackFor=Exception.class,isolation= Isolation.READ_COMMITTED)
    @Override
    public Boolean DeleteCourse(Integer courseId) {
        //先删除所有章节
        try {
        if (chapterDao.deleteChaptersByCourseId(courseId)){
            if (courseDao.deleteCourse(courseId))
                return true;

                throw new Exception();

        }
            throw new Exception();
        } catch (Exception e) {
           return false;
        }

    }

    @Override
    public List<Course> findAllCourse(int pageNum) {
        //每页十条，可调整
        int pageSize=10;
        return courseDao.findAllCourse(new RowBounds( (pageNum-1)*pageSize,pageSize));
    }

    @Override
    public List<Chapter> findAllChapterByCourseId(int pageNum, Integer courseId) {
        //每页十条，可调整
        int pageSize=10;
        return chapterDao.findAllChapterByCourseId(new RowBounds( (pageNum-1)*pageSize,pageSize),courseId);
    }

    @Override
    public Integer findChapterAccountByCourseId(Integer courseId) {

        return (chapterDao.findChapterAccountByCourseId(courseId)+10-1)/10;
    }

    @Override
    public Integer findAllAccountGood() {
        return (courseDao.findAllAccountGood()+10-1)/10;
    }

    @Override
    public Integer findAllAccountTeacher(Integer teacherId) {
        return (courseDao.findAllAccountTeacher(teacherId)+10-1)/10;
    }

    @Override
    public Boolean updataCoures(Course course) {
        return courseDao.updataCourse(course);
    }

    @Override
    public Course findCourse(Integer courseId) {
        return courseDao.findCourseById(courseId);
    }

    @Override
    public Chapter findChapterByChapterId(Integer chapterId, Integer courseId) {
        return chapterDao.findChapterByChapterId(chapterId,courseId);
    }
}
