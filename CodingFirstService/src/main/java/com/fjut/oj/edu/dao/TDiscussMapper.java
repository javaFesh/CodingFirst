package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TDiscuss;
import com.fjut.oj.edu.pojo.TDiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TDiscussMapper {
    int countByExample(TDiscussExample example);

    int deleteByExample(TDiscussExample example);

    int deleteByPrimaryKey(Long discussid);

    int insert(TDiscuss record);

    int insertSelective(TDiscuss record);

    List<TDiscuss> selectByExample(TDiscussExample example);

    TDiscuss selectByPrimaryKey(Long discussid);

    int updateByExampleSelective(@Param("record") TDiscuss record, @Param("example") TDiscussExample example);

    int updateByExample(@Param("record") TDiscuss record, @Param("example") TDiscussExample example);

    int updateByPrimaryKeySelective(TDiscuss record);

    int updateByPrimaryKey(TDiscuss record);
}