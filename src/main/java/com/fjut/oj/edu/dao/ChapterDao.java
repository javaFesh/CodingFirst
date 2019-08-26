package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Chapter;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

//章节操作
@Repository
public interface ChapterDao {
    //查询某课程所有章节
    List<Chapter> findAllChapterByCourseId(RowBounds rowBounds, Integer courseId);
    //查询某课程所有章节的页面总数
    Integer findChapterAccountByCourseId(Integer courseId);
    //添加课程章节信息
    Boolean insertChapter(Chapter chapter);
    //修改现有章节信息
    Boolean updataChapter(Chapter chapter);

    //删除单章节信息
    Boolean deleteChapterByChapterId(Integer chapterId,Integer courseId);


    //删除某一课程的全部章节信息

    Boolean deleteChaptersByCourseId(Integer courseId);


    //按照课程和章节id查询章节
    Chapter findChapterByChapterId(Integer chapterId,Integer courseId);


}