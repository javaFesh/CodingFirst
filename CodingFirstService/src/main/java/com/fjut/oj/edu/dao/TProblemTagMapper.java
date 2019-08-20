package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TProblemTag;
import com.fjut.oj.edu.pojo.TProblemTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProblemTagMapper {
    int countByExample(TProblemTagExample example);

    int deleteByExample(TProblemTagExample example);

    int deleteByPrimaryKey(Long pTagid);

    int insert(TProblemTag record);

    int insertSelective(TProblemTag record);

    List<TProblemTag> selectByExample(TProblemTagExample example);

    TProblemTag selectByPrimaryKey(Long pTagid);

    int updateByExampleSelective(@Param("record") TProblemTag record, @Param("example") TProblemTagExample example);

    int updateByExample(@Param("record") TProblemTag record, @Param("example") TProblemTagExample example);

    int updateByPrimaryKeySelective(TProblemTag record);

    int updateByPrimaryKey(TProblemTag record);
}