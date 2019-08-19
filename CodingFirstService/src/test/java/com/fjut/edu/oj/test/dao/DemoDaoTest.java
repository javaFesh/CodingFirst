package com.fjut.edu.oj.test.dao;

import com.fjut.edu.oj.test.BaseJunit4Test;

import com.fjut.oj.edu.dao.DemoDao;
import com.fjut.oj.edu.model.Demo;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class DemoDaoTest extends BaseJunit4Test {


    @Resource
    private DemoDao demoDao;



    @Test
    public void testFindAll(){
        List<Demo> demos=demoDao.queryAll();
        for (Demo demo: demos
             ) {
            System.out.println(demo.getName());

        }
     }
}
