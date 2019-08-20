package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.model.Demo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DemoDao {
    List<Demo> queryAll();
}
