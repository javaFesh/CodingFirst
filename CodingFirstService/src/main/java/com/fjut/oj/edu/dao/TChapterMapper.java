package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TChapter;
import com.fjut.oj.edu.pojo.TChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TChapterMapper {
    int countByExample(TChapterExample example);

    int deleteByExample(TChapterExample example);

    int deleteByPrimaryKey(Long chapterid);

    int insert(TChapter record);

    int insertSelective(TChapter record);

    List<TChapter> selectByExample(TChapterExample example);

    TChapter selectByPrimaryKey(Long chapterid);

    int updateByExampleSelective(@Param("record") TChapter record, @Param("example") TChapterExample example);

    int updateByExample(@Param("record") TChapter record, @Param("example") TChapterExample example);

    int updateByPrimaryKeySelective(TChapter record);

    int updateByPrimaryKey(TChapter record);
}