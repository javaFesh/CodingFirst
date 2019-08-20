package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TDiscussreply;
import com.fjut.oj.edu.pojo.TDiscussreplyExample;
import com.fjut.oj.edu.pojo.TDiscussreplyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDiscussreplyMapper {
    int countByExample(TDiscussreplyExample example);

    int deleteByExample(TDiscussreplyExample example);

    int deleteByPrimaryKey(TDiscussreplyKey key);

    int insert(TDiscussreply record);

    int insertSelective(TDiscussreply record);

    List<TDiscussreply> selectByExampleWithBLOBs(TDiscussreplyExample example);

    List<TDiscussreply> selectByExample(TDiscussreplyExample example);

    TDiscussreply selectByPrimaryKey(TDiscussreplyKey key);

    int updateByExampleSelective(@Param("record") TDiscussreply record, @Param("example") TDiscussreplyExample example);

    int updateByExampleWithBLOBs(@Param("record") TDiscussreply record, @Param("example") TDiscussreplyExample example);

    int updateByExample(@Param("record") TDiscussreply record, @Param("example") TDiscussreplyExample example);

    int updateByPrimaryKeySelective(TDiscussreply record);

    int updateByPrimaryKeyWithBLOBs(TDiscussreply record);

    int updateByPrimaryKey(TDiscussreply record);
}