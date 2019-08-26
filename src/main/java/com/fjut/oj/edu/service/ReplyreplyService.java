package com.fjut.oj.edu.service;


import com.fjut.oj.edu.model.Replyreply;

import java.util.List;

public interface ReplyreplyService {
    List<Replyreply> Show(int discussid, int replyId, int currPage, int pageSize);
    void Add(Replyreply Replyreply);
    int ReplyreplyNum(int discussid, int replyid);
}
