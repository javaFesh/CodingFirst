package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.model.Order;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.CourseSrevice;
import com.fjut.oj.edu.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 订单功能
 * 1：添加课程直接生成待付款订单
 * 2：查看所有订单
 * 3：查看所有未付款订单
 * 4：订单付款（状态改变）
 * 5：查看所有已购买的课程
 */
@Controller
public class OrderController {

    @Resource
    OrderService orderService;


    @Resource
    CourseSrevice courseSrevice;
//1添加课程直接生成订单
    @RequestMapping("addCourseToOrder")
    @ResponseBody
    public String addCourseToOrder(@SessionAttribute(value = "user") User user,Integer courseId){
        Course course= courseSrevice.findCourseById(courseId);
        Order order=new Order(user.getUserId(),courseId,course.getCourseCharge(),course.getCourseCharge(),new Date(),0);
        if (orderService.insertOrder(order))
        return "添加订单成功";
        else
            return "添加失败";
    }

    //获取个人订单页数
    @RequestMapping(value = "getOrderPageCount")
    @ResponseBody
    public Integer getChaptersPageCount(@SessionAttribute(value = "user") User user){
        return orderService.AllOrderByIdAccount(user.getUserId());
    }

    //查看所有个人订单
    @RequestMapping("findOrder/index{pageNum}")
    @ResponseBody
    public List<Order> findOrder(@SessionAttribute(value = "user") User user,@PathVariable(value="pageNum")Integer pageNum){
        List<Order> orders=orderService.findAllOrderByIdByPage(pageNum,user.getUserId());
        return orders;
    }

    //3:查看所有未付款订单
    //获取未付款订单页数
    @RequestMapping(value = "getOrderOnPayPageCount")
    @ResponseBody
    public Integer getOrderOnPayPageCount(@SessionAttribute(value = "user") User user){
        return orderService.AllOrderOnPayAccount(user.getUserId());
    }

    //查看所有个人未付款订单订单
    @RequestMapping("findOrderOnPay/index{pageNum}")
    @ResponseBody
    public List<Order> findOrderOnPay(@SessionAttribute(value = "user") User user,@PathVariable(value="pageNum")Integer pageNum){
        List<Order> orders=orderService.findAllOrderByIdByPage(pageNum,user.getUserId());
        return orders;
    }





    //付款
    @RequestMapping("pay")
    @ResponseBody
    public String pay(@SessionAttribute(value = "user") User user,Integer orderId){
        Order order=orderService.findOrderById(orderId);
        order.setIsCancel(1);
        if (orderService.updataOrder(order))
            return "付款成功";
        else
            return "付款失败";
    }

//    findAllOrderPayByPage:已付款
//            AllOrderPayAccount
    //4：查看已付款
//获取以付款订单页数
@RequestMapping(value = "AllOrderPayAccount")
@ResponseBody
public Integer AllOrderPayAccount(@SessionAttribute(value = "user") User user){
    return orderService.AllOrderPayAccount(user.getUserId());
}

    //查看所有个人已付款订单订单
    @RequestMapping("findOrderOnPay/index{pageNum}")
    @ResponseBody
    public List<Order> findAllOrderPayByPage(@SessionAttribute(value = "user") User user,@PathVariable(value="pageNum")Integer pageNum) {
        List<Order> orders = orderService.findAllOrderPayByPage(pageNum, user.getUserId());
        return orders;

    }



    //已购买的课程    findAllOrderPayCourse
    @RequestMapping(value = "AllOrderPayCourse")
    @ResponseBody
    public Integer AllOrderPayCourse(@SessionAttribute(value = "user") User user){
        return orderService.AllOrderPayAccount(user.getUserId());
    }

    //查看所有个人已付款课程
    @RequestMapping("findOrderOnPay/index{pageNum}")
    @ResponseBody
    public List<Course> findAllOrderPayCourse(@SessionAttribute(value = "user") User user,@PathVariable(value="pageNum")Integer pageNum) {
        List<Course> courses = orderService.findAllOrderPayCourse(pageNum, user.getUserId());
        return courses;
    }

    }
