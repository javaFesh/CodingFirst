package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TCollect;
import com.fjut.oj.edu.pojo.TCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCollectMapper {
    int countByExample(TCollectExample example);

    int deleteByExample(TCollectExample example);

    int deleteByPrimaryKey(Long collectid);

    int insert(TCollect record);

    int insertSelective(TCollect record);

    List<TCollect> selectByExample(TCollectExample example);

    TCollect selectByPrimaryKey(Long collectid);

    int updateByExampleSelective(@Param("record") TCollect record, @Param("example") TCollectExample example);

    int updateByExample(@Param("record") TCollect record, @Param("example") TCollectExample example);

    int updateByPrimaryKeySelective(TCollect record);

    int updateByPrimaryKey(TCollect record);
}