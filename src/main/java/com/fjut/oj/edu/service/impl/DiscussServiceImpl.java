package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.DiscussDao;
import com.fjut.oj.edu.model.Discuss;
import com.fjut.oj.edu.service.DiscussService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DiscussServiceImpl implements DiscussService {
    @Resource
    DiscussDao discussDao;
    @Override
    public List<Discuss> Show(int currPage, int pageSize) {
        List<Discuss> discusses=discussDao.queryByAll();
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        return discusses.subList(firstIndex,lastIndex);
    }

    @Override
    public void Add(Discuss discuss) {
        discussDao.insert(discuss);
    }

    @Override
    public int Num() {
        return discussDao.TotalRecord();
    }

    @Override
    public List<Discuss> ShowByUserId(int id,int currPage, int pageSize) {
        List<Discuss> discusses=discussDao.queryByUserId(id);
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        return discusses.subList(firstIndex,lastIndex);
    }
}
