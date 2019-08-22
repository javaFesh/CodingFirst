package com.fjut.oj.edu.test.dao;

import com.fjut.oj.edu.dao.UsersDao;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.test.BaseJunit4Test;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DemoDaoTest extends BaseJunit4Test {

    @Resource
    private UsersDao usersDao;


    @Test
    public  void testUser(){
//        List<User> users=usersDao.queryAll();
//        for (User user: users) {
//            System.out.println(user.getName());
//
//        }
//        User stu=new User();
//        stu.setNick("145");
//        stu.setUserPwd("123");
//        User user=usersDao.queryById(stu);
//             System.out.println(user.getNick());
          User stu=new User();
          stu.setNick("啾咪");
          stu.setUserPwd("123456");
          stu.setRegistertime(new Date());


          User user=usersDao.selectNick("145");
          System.out.println(user.getNick());



    }
}
