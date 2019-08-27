package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Problem;

import java.util.List;

public interface ProblemService {
    List<Problem> queryByPage(int currPage, int pageSize);
    List<Problem> queryByTagAndPage(String tag, int currPage, int pageSize);
    Problem queryById(int id);
    int ProblemNum();
    void add(Problem problem);
    List<Problem> queryByUser(int id,int currPage, int pageSize);
    Problem UpdateProblem(Problem problem);

}
