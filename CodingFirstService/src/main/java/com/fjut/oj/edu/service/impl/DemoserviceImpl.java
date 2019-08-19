package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.DemoDao;
import com.fjut.oj.edu.model.Demo;
import com.fjut.oj.edu.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoserviceImpl implements DemoService {
    @Resource
    DemoDao demoDao;
    @Override
    public List<Demo> queryAll() {
        return demoDao.queryAll();
    }
}
