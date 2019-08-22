package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.model.Order;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OrderDao {
    //添加订单
    Boolean insertOrder();

    //根据用户Id查询订单
    List<Order> findAllOrderByIdByPage(RowBounds rowBounds,Integer userId);

    //修改订单
    Boolean updataOrder(Order order);





}
