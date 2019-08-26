package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.ProblemDao;
import com.fjut.oj.edu.model.Problem;
import com.fjut.oj.edu.service.ProblemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProblemServiceImpl implements ProblemService {
    @Resource
    ProblemDao problemDao;
    @Override
    public List<Problem> queryByPage(int currPage, int pageSize) {
        List<Problem> ans=problemDao.queryAll();
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        return ans.subList(firstIndex,lastIndex);
    }

    @Override
    public List<Problem> queryByTagAndPage(String tag, int currPage, int pageSize) {
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        return problemDao.queryByTag(tag).subList(firstIndex,lastIndex);
    }

    @Override
    public Problem queryById(int id) {
        return problemDao.queryById(id);
    }

    @Override
    public int ProblemNum() {
        return problemDao.ProblemNum();
    }

    @Override
    public void add(Problem problem) {
        problemDao.Add(problem);
    }
}
