package com.fjut.oj.edu.controller;


import com.fjut.oj.edu.model.Replyreply;
import com.fjut.oj.edu.service.ReplyreplyService;
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
@RequestMapping(value = "/ReplyReplyController")
public class ReplyReplyController {
    private static Logger logger = Logger.getLogger(String.valueOf(LoginController.class));
    @Resource
    ReplyreplyService replyreplyService;

    @ResponseBody
    @RequestMapping(value = "/ReplyReplyShowByPage")
    public Map<String,Object> ReplyReplyShowByPage(String discussid,String replyId,String page){
        List<Replyreply> replyreplies=replyreplyService.Show(Integer.parseInt(discussid),Integer.parseInt(replyId),5,Integer.parseInt(page));
        Map<String,Object> result=new HashMap<>();
        result.put("ReplyReplyShow",replyreplies);
        return result;
    }

    @RequestMapping(value = "/addReplyReply",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> AddDiscuss(String discussid,String ReplyId,String ReplyReplyText,String userid){//添加回复
        Replyreply replyreply=new Replyreply();
        replyreply.setDiscussId(Integer.parseInt(discussid));
        replyreply.setReplyId(Integer.parseInt(ReplyId));
        replyreply.setReplyText(ReplyReplyText);
        replyreply.setUserId(Integer.parseInt(userid));
        replyreply.setReplyTime(new Date());

        Map<String ,Object> result=new HashMap<>();
        try{
            replyreplyService.Add(replyreply);
            result.put("AddInfo","发布成功!");
        }catch (Exception e){
            result.put("AddInfo","发布失败");
        }

        return result;
    }

    @RequestMapping(value = "/ReplyReplyNum",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> ReplyNum(String discussid,String ReplyId){//回复回复贴的页数（5条一页）
        Map<String,Object> result=new HashMap<>();
        result.put("ReplyNum",replyreplyService.ReplyreplyNum(Integer.parseInt(discussid),Integer.parseInt(ReplyId))/5);
        return result;
    }


}
