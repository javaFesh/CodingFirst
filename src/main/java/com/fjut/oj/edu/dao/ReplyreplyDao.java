package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Replyreply;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyreplyDao {
    List<Replyreply> queryAll(int discussId,int replyId);
    void insert(@Param("Replyreply")Replyreply replyreply);
    int ReplyReplyNum(int discussid,int replyid);

}