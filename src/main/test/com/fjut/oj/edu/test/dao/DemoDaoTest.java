package com.fjut.oj.edu.test.dao;

import com.fjut.oj.edu.dao.DemoDao;
import com.fjut.oj.edu.dao.UsersDao;
import com.fjut.oj.edu.model.Demo;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.test.BaseJunit4Test;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DemoDaoTest extends BaseJunit4Test {


    @Resource
    private DemoDao demoDao;


    @Resource
    private UsersDao usersDao;
    Date t = new Date();

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public  void testUser(){
        List<User> users=usersDao.queryAll();
        for (User user: users
        ) {
            System.out.println(user.getName());

        }
    }
    @Test
    public void testFindAll(){
        List<Demo> demos=demoDao.queryAll();
        for (Demo demo: demos
             ) {
            System.out.println(demo.getName());

        }
     }




}
