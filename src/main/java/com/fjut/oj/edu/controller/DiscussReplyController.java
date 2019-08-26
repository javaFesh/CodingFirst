package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.model.Discussreply;
import com.fjut.oj.edu.service.DiscussReplyService;
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
@RequestMapping(value = "/DiscussReplyController")
public class DiscussReplyController {
    private static Logger logger = Logger.getLogger(String.valueOf(LoginController.class));
    @Resource
    private DiscussReplyService discussReplyService;

    @RequestMapping(value = "/DiscussReplyShowByPage",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> ShowByPage(String id,String page){//显示当前页的回复信息
        List<Discussreply> ans=discussReplyService.Show(Integer.parseInt(id),5,Integer.parseInt(page));
        Map<String,Object> result=new HashMap<>();
        result.put("DiscussShow",ans);
        return result;
    }

    @RequestMapping(value = "/addDiscussReply",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> AddDiscuss(String discussid,String ReplyText,String userid){//添加回复
        Discussreply discussreply=new Discussreply();
        discussreply.setDiscussId(Integer.parseInt(discussid));
        discussreply.setReplyText(ReplyText);
        discussreply.setUserId(Integer.parseInt(userid));
        discussreply.setReplyTime(new Date());
        Map<String ,Object> result=new HashMap<>();
        try{
            discussReplyService.Add(discussreply);
            result.put("AddInfo","发布成功!");
        }catch (Exception e){
            result.put("AddInfo","发布失败");
        }

        return result;
    }

    @RequestMapping(value = "/ReplyNum",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> ReplyNum(String id){//回复贴的页数（5条一页）
        Map<String,Object> result=new HashMap<>();
        result.put("ReplyNum",discussReplyService.ReplyNum(Integer.parseInt(id))/5);
        return result;
    }
}
