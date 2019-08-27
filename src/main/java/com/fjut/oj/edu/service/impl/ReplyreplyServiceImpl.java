package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.ReplyreplyDao;
import com.fjut.oj.edu.model.Replyreply;
import com.fjut.oj.edu.service.ReplyreplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ReplyreplyServiceImpl implements ReplyreplyService {
    @Resource
    ReplyreplyDao replyreplyDao;
    @Override
    public List<Replyreply> Show(int discussid, int replyId, int currPage, int pageSize) {
        List<Replyreply> Replyreply =replyreplyDao.queryAll(discussid,replyId);
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        return Replyreply.subList(firstIndex,lastIndex);
    }

    @Override
    public void Add(Replyreply Replyreply) {
        replyreplyDao.insert(Replyreply);

    }

    @Override
    public int  ReplyreplyNum(int discussid,int replyid)
    {
        return replyreplyDao.ReplyReplyNum(discussid,replyid);
    }
}
