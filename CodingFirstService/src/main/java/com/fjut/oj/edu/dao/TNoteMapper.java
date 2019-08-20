package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TNote;
import com.fjut.oj.edu.pojo.TNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TNoteMapper {
    int countByExample(TNoteExample example);

    int deleteByExample(TNoteExample example);

    int deleteByPrimaryKey(Long noteid);

    int insert(TNote record);

    int insertSelective(TNote record);

    List<TNote> selectByExample(TNoteExample example);

    TNote selectByPrimaryKey(Long noteid);

    int updateByExampleSelective(@Param("record") TNote record, @Param("example") TNoteExample example);

    int updateByExample(@Param("record") TNote record, @Param("example") TNoteExample example);

    int updateByPrimaryKeySelective(TNote record);

    int updateByPrimaryKey(TNote record);
}