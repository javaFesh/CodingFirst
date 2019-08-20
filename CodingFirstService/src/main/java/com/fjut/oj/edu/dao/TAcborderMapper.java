package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TAcborder;
import com.fjut.oj.edu.pojo.TAcborderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAcborderMapper {
    int countByExample(TAcborderExample example);

    int deleteByExample(TAcborderExample example);

    int deleteByPrimaryKey(Long orderid);

    int insert(TAcborder record);

    int insertSelective(TAcborder record);

    List<TAcborder> selectByExample(TAcborderExample example);

    TAcborder selectByPrimaryKey(Long orderid);

    int updateByExampleSelective(@Param("record") TAcborder record, @Param("example") TAcborderExample example);

    int updateByExample(@Param("record") TAcborder record, @Param("example") TAcborderExample example);

    int updateByPrimaryKeySelective(TAcborder record);

    int updateByPrimaryKey(TAcborder record);
}