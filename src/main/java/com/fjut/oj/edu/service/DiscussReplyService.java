package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Discuss;
import com.fjut.oj.edu.model.Discussreply;

import java.util.List;

public interface DiscussReplyService {
    List<Discussreply> Show(int id,int currPage, int pageSize);
    void Add(Discussreply discussreply);
    int ReplyNum(int id);

}
