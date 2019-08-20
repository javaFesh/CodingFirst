package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TMall;
import com.fjut.oj.edu.pojo.TMallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMallMapper {
    int countByExample(TMallExample example);

    int deleteByExample(TMallExample example);

    int deleteByPrimaryKey(Long mallid);

    int insert(TMall record);

    int insertSelective(TMall record);

    List<TMall> selectByExample(TMallExample example);

    TMall selectByPrimaryKey(Long mallid);

    int updateByExampleSelective(@Param("record") TMall record, @Param("example") TMallExample example);

    int updateByExample(@Param("record") TMall record, @Param("example") TMallExample example);

    int updateByPrimaryKeySelective(TMall record);

    int updateByPrimaryKey(TMall record);
}