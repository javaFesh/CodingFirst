package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TCourse;
import com.fjut.oj.edu.pojo.TCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCourseMapper {
    int countByExample(TCourseExample example);

    int deleteByExample(TCourseExample example);

    int deleteByPrimaryKey(Long courseid);

    int insert(TCourse record);

    int insertSelective(TCourse record);

    List<TCourse> selectByExample(TCourseExample example);

    TCourse selectByPrimaryKey(Long courseid);

    int updateByExampleSelective(@Param("record") TCourse record, @Param("example") TCourseExample example);

    int updateByExample(@Param("record") TCourse record, @Param("example") TCourseExample example);

    int updateByPrimaryKeySelective(TCourse record);

    int updateByPrimaryKey(TCourse record);
}