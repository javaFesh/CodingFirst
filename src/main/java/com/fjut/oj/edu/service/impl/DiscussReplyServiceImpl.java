package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.DiscussreplyDao;
import com.fjut.oj.edu.model.Discussreply;
import com.fjut.oj.edu.service.DiscussReplyService;

import javax.annotation.Resource;
import java.util.List;

public class DiscussReplyServiceImpl implements DiscussReplyService {
    @Resource
    DiscussreplyDao discussreplyDao;
    @Override
    public List<Discussreply> Show(int id,int currPage, int pageSize) {
        List<Discussreply> discusses =discussreplyDao.queryById(id);
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        return discusses.subList(firstIndex,lastIndex);

    }

    @Override
    public void Add(Discussreply discussreply) {
        discussreplyDao.AddReply(discussreply);
    }

    @Override
    public int ReplyNum(int id) {
        return discussreplyDao.ReplyNum(id);
    }
}
