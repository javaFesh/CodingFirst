package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TClockIn;
import com.fjut.oj.edu.pojo.TClockInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TClockInMapper {
    int countByExample(TClockInExample example);

    int deleteByExample(TClockInExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TClockIn record);

    int insertSelective(TClockIn record);

    List<TClockIn> selectByExample(TClockInExample example);

    TClockIn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TClockIn record, @Param("example") TClockInExample example);

    int updateByExample(@Param("record") TClockIn record, @Param("example") TClockInExample example);

    int updateByPrimaryKeySelective(TClockIn record);

    int updateByPrimaryKey(TClockIn record);
}