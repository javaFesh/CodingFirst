package com.fjut.oj.edu.controller;


import com.fjut.oj.edu.model.Mall;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.MallService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import java.util.List;

@Controller
@SessionAttributes//模拟登录已有的userSession
public class MallController {
    @Resource
    private MallService mallService;
//模拟登录过程//直接转发给mall.jsp页面
    @RequestMapping("login")
    public String login(){
        User user=new User();
        user.setUserId(999);
        user.setNick("javaFish");
        user.setAcb(100);
        return "redirect:mall";
    }


    //Ajax获取总页数
    @RequestMapping(value = "getPageCount")
    @ResponseBody
    public Integer getPageCount(){
        Integer pageCount=mallService.mallCount();
        return pageCount;

    }



    //用来传送分页信息
    @RequestMapping(value = "index{pageNum}")
    @ResponseBody
    public List<Mall> AllMallByPage(@PathVariable(value="pageNum")Integer pageNum){
        List<Mall> malls;
        if (pageNum>mallService.mallCount()){
       malls =mallService.findAllByPage(pageNum-1);}
        else if (pageNum<1){
         malls =mallService.findAllByPage(1);}

        else {
            malls =mallService.findAllByPage(pageNum);
        }
        return malls;

    }

    //用来添加商品
    @RequestMapping(value = "addMall")
    public String add(){
        return "";
    }

}
