package com.fjut.oj.edu.controller;


import com.fjut.oj.edu.dto.CollectDto;
import com.fjut.oj.edu.model.Collect;
import com.fjut.oj.edu.model.User;
import com.fjut.oj.edu.service.CollectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.annotation.Resource;

@Controller
public class CollectController {


    @Resource
    CollectService collectService;

/**
 * 收藏功能
 */


@RequestMapping("addController")
@ResponseBody
public String addController(@SessionAttribute(value = "user")User user,Integer couresId,Integer discussId,Integer problemId){
    Collect collect = null;
    collect.setUserId(user.getUserId());
    if (couresId!=null){
        collect.setCourseId(couresId);
    }
    if (problemId!=null){
        collect.setProblemId(problemId);
    }
    if (discussId!=null){
        collect.setDiscussId(discussId);
    }
    if (collectService.insertCollect(collect))
        return "添加成功";
    return "添加失败";
    }





    /**
     * 查看用户收藏
     */
    @RequestMapping(" findMyCollect")
    @ResponseBody
    public CollectDto findMyCollect(@SessionAttribute(value = "user")User user){
        return collectService.findMyCollectDto(user.getUserId());
    }

    //删除收藏





}
