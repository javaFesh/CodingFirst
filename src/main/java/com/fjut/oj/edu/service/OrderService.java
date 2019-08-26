package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.model.Order;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OrderService {



    /**
     * 添加订单
     * @param order
     * @return
     */
    Boolean insertOrder(Order order);

    /**
     * 根据用户Id查询订单
     * @param pageNum
     * @param userId
     * @return
     */
    List<Order>findAllOrderByIdByPage(int pageNum, Integer userId);

    //用户订单总数
    Integer AllOrderByIdAccount(Integer userId);



    /**
     * 修改订单（可以是取消订单）
     * @param order
     * @return
     */
    Boolean updataOrder(Order order);

    /**
     * 支付订单(事务：所在课程人数+1，订单状态改变)
     * @param courseId
     * @param orderId
     * @return
     */
    Boolean payOrder(Integer courseId,Integer orderId);


    /**
     * 删除订单（）
     * @param orderId
     * @return
     */
    Boolean deleteOrder(Integer orderId);

    /**
     * 根据ID查询订单
     * @return
     */
    Order findOrderById(Integer orderId);

    /**
     * 用户已支付订单
     * @param pageNum
     * @param userId
     * @return
     */
    List<Order> findAllOrderPayByPage(int pageNum, Integer userId);
    //用户已支付订单总数
    Integer AllOrderPayAccount(Integer userId);

    /**
     * 查询用户未支付订单
     * @param pageNum
     * @param userId
     * @return
     */
    List<Order> findAllOrderOnPayByPage(int pageNum, Integer userId);
    //用户未支付订单总数
    Integer AllOrderOnPayAccount(Integer userId);



    /**
     * 查询用户已支付底单的所有课程
     * @param pageNum
     * @param userId
     * @return
     */
    List<Course> findAllOrderPayCourse(int pageNum, Integer userId);

}
