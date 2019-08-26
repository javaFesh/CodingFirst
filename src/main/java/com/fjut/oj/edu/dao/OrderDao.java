package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.model.Order;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OrderDao {
    //添加订单
    Boolean insertOrder(Order order);

    //根据用户Id查询订单
    List<Order> findAllOrderByIdByPage(RowBounds rowBounds,Integer userId);



    //用户订单总数
    Integer AllOrderByIdAccount(Integer userId);

    //修改订单
    Boolean updataOrder(Order order);


    //删除订单（）
    Boolean deleteOrder(Integer orderId);

    //根据ID查询订单
    Order findOrderById(Integer orderId);


    /**
     * 用户已支付订单
     * @param rowBounds
     * @param userId
     * @return
     */
    List<Order> findAllOrderPayByPage(RowBounds rowBounds, Integer userId);

    //用户已支付订单总数
    Integer AllOrderPayAccount(Integer userId);

    /**
     * 查询用户未支付订单
     * @param rowBounds
     * @param userId
     * @return
     */
    List<Order> findAllOrderOnPayByPage(RowBounds rowBounds, Integer userId);



    //用户未支付订单总数
    Integer AllOrderOnPayAccount(Integer userId);



}
