package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Discuss;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface DiscussService {
    List<Discuss> Show(int currPage, int pageSize);
    void Add(Discuss discuss);
    int Num();

}
