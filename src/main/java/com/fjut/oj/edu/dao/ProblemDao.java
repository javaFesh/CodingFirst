package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Problem;
import com.fjut.oj.edu.model.ProblemTag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProblemDao {

    List<Problem> queryAll();
    List<Problem> queryByTag(String tag);
    Problem queryById(int id);
    int ProblemNum();
    void Add(@Param("Problem") Problem problem);
    List<Problem> queryByUserId(Integer id);
    void UpdateProblem(@Param("Problem")Problem problem);//待完成
}