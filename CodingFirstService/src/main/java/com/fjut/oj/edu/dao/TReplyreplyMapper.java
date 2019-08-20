package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TReplyreply;
import com.fjut.oj.edu.pojo.TReplyreplyExample;
import com.fjut.oj.edu.pojo.TReplyreplyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TReplyreplyMapper {
    int countByExample(TReplyreplyExample example);

    int deleteByExample(TReplyreplyExample example);

    int deleteByPrimaryKey(TReplyreplyKey key);

    int insert(TReplyreply record);

    int insertSelective(TReplyreply record);

    List<TReplyreply> selectByExampleWithBLOBs(TReplyreplyExample example);

    List<TReplyreply> selectByExample(TReplyreplyExample example);

    TReplyreply selectByPrimaryKey(TReplyreplyKey key);

    int updateByExampleSelective(@Param("record") TReplyreply record, @Param("example") TReplyreplyExample example);

    int updateByExampleWithBLOBs(@Param("record") TReplyreply record, @Param("example") TReplyreplyExample example);

    int updateByExample(@Param("record") TReplyreply record, @Param("example") TReplyreplyExample example);

    int updateByPrimaryKeySelective(TReplyreply record);

    int updateByPrimaryKeyWithBLOBs(TReplyreply record);

    int updateByPrimaryKey(TReplyreply record);
}