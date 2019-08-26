package com.fjut.oj.edu.test.dao;

import com.fjut.oj.edu.dao.OrderDao;
import com.fjut.oj.edu.model.Order;
import com.fjut.oj.edu.test.BaseJunit4Test;
import org.junit.Test;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

public class OrderDaotest extends BaseJunit4Test {


    @Resource
    OrderDao orderDao;



    @Test
    public void testDao(){
        Order order=new Order(1,2,123,123,new Date(),0);


        orderDao.insertOrder(order);

    }
}
