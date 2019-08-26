package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.OrderDao;
import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.model.Order;
import com.fjut.oj.edu.service.CourseSrevice;
import com.fjut.oj.edu.service.OrderService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {


    @Resource
    OrderDao orderDao;

    int pageSize=10;
    @Resource
    CourseSrevice courseSrevice;
    /**
     * 添加订单
     *
     * @param order
     * @return
     */
    @Override
    public Boolean insertOrder(Order order) {
        return orderDao.insertOrder(order);
    }

    /**
     * 根据用户Id查询订单
     *
     * @param pageNum
     * @param userId
     * @return
     */
    @Override
    public List<Order> findAllOrderByIdByPage(int pageNum, Integer userId) {

        return orderDao.findAllOrderByIdByPage(new RowBounds( (pageNum-1)*pageSize,pageSize),userId);
    }
//获取总页数
    @Override
    public Integer AllOrderByIdAccount(Integer userId) {
        return (orderDao.AllOrderByIdAccount(userId)+10-1)/10;
    }

    /**
     * 修改订单（可以是取消订单）
     *
     * @param order
     * @return
     */
    @Override
    public Boolean updataOrder(Order order) {
        return updataOrder(order);
    }

    /**
     * 支付订单(事务：所在课程人数+1，订单状态改变)
     *
     * @param courseId
     * @param orderId
     * @return
     */
    @Override
    @Transactional(rollbackFor=Exception.class,isolation= Isolation.READ_COMMITTED)
    public Boolean payOrder(Integer courseId, Integer orderId) {
        Course course= courseSrevice.findCourseById(courseId);
        //课程人数增加
        course.setCourseNumAccount(course.getCourseNumAccount()+1);
        Order order=orderDao.findOrderById(orderId);
        //修改订单状态为已购买
        order.setIsCancel(1);
        try{
            if (orderDao.updataOrder(order)) {
                if (courseSrevice.updataCoures(course))
                    return true;
                throw new Exception();
            }
            throw new Exception();
        }
        catch (Exception e) {
            return false;
        }
    }

    /**
     * 删除订单（）
     *
     * @param orderId
     * @return
     */
    @Override
    public Boolean deleteOrder(Integer orderId) {
        return orderDao.deleteOrder(orderId);
    }

    /**
     * 根据ID查询订单
     *
     * @return
     */
    @Override
    public Order findOrderById(Integer orderId) {
        return orderDao.findOrderById(orderId);
    }

    /**
     * 用户已支付订单
     *
     * @param pageNum
     * @param userId
     * @return
     */
    @Override
    public List<Order> findAllOrderPayByPage(int pageNum, Integer userId) {

        return orderDao.findAllOrderPayByPage(new RowBounds( (pageNum-1)*pageSize,pageSize),userId);
    }

    @Override
    public Integer AllOrderPayAccount(Integer userId) {
        return (orderDao.AllOrderPayAccount(userId)+10-1)/10;
    }

    /**
     * 查询用户未支付订单
     *
     * @param pageNum
     * @param userId
     * @return
     */
    @Override
    public List<Order> findAllOrderOnPayByPage(int pageNum, Integer userId) {
        return orderDao.findAllOrderOnPayByPage(new RowBounds( (pageNum-1)*pageSize,pageSize),userId);
    }

    @Override
    public Integer AllOrderOnPayAccount(Integer userId) {
        return (orderDao.AllOrderOnPayAccount(userId)+10-1)/10;
    }

    /**
     * 查询用户已支付底单的所有课程
     *
     * @param pageNum
     * @param userId
     * @return
     */
    @Override
    public List<Course> findAllOrderPayCourse(int pageNum, Integer userId) {
        List<Course> courseList = null;
        List<Order> orders= orderDao.findAllOrderPayByPage(new RowBounds( (pageNum-1)*pageSize,pageSize),userId);
        for (int i=0;i<orders.size();i++){
            courseList.add(courseSrevice.findCourse(orders.get(i).getGoodsId()));
        }
        return courseList;
    }
}
