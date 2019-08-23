package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Discussreply;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscussreplyDao {
    List<Discussreply> queryById(int id);
    void AddReply(@Param("Discussreply")Discussreply discussreply);
    int ReplyNum(int id);
}