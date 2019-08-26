package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.model.Discuss;
import com.fjut.oj.edu.service.DiscussService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/DiscussController")
public class DiscussController {
    private static Logger logger = Logger.getLogger(String.valueOf(LoginController.class));
    @Resource
    private DiscussService discussService;
    @RequestMapping(value = "/DiscussShowByPage",method = RequestMethod.POST)//按照页数显示讨论贴
    @ResponseBody
    public Map<String,Object> ShowByPage(String page){
        Map<String,Object> result=new HashMap<>();
        try{
            List<Discuss> ans=discussService.Show(5,Integer.parseInt(page));
            result.put("DiscussShow",ans);
        }catch (Exception e){
            result.put("DiscussInfo","查找失败");
        }
        return result;
    }

    @RequestMapping(value = "/addDiscuss",method = RequestMethod.POST)//添加讨论
    @ResponseBody
    public Map<String,Object> AddDiscuss(String discussTitle,String discussAuthor,String discussText){
        Discuss discuss=new Discuss();
        discuss.setDiscussTitle(discussTitle);
        discuss.setDiscussAuthor(Integer.parseInt(discussAuthor));
        discuss.setDiscussText(discussText);
        discuss.setDiscussTime(new Date());
        discuss.setType(0);
        discussService.Add(discuss);
        Map<String ,Object> result=new HashMap<>();
        result.put("AddInfo","发布成功!");
        return result;
    }

    @RequestMapping(value = "/DiscussNum",method = RequestMethod.POST)//查询当前讨论表的总页数，返回按照5条一页后的页数量
    @ResponseBody
    public Map<String,Object> DiscussNum(){
        Map<String ,Object> result=new HashMap<>();
        result.put("discussNum",discussService.Num()/5);
        return result;
    }

}
