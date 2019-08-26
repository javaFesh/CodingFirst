package com.fjut.oj.edu.controller;

import com.fjut.oj.edu.model.Problem;
import com.fjut.oj.edu.service.ProblemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/ProblemController")
public class ProblemController {
    @Resource
    private ProblemService problemService;
    @RequestMapping(value = "/ProblemShowAllByPage",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> ProblemShowAllByPage(String page){
        Map<String,Object> result=new HashMap<>();
        result.put("result",problemService.queryByPage(5,Integer.parseInt(page)));
        return result;
    }
    @RequestMapping(value = "/ProblemShowByTagAndPage",method = RequestMethod.POST)
    @ResponseBody
    public Map<String ,Object> ProblemShowByTagAndPage(String Tag,String page){
        Map<String,Object> result=new HashMap<>();
        result.put("result",problemService.queryByTagAndPage(Tag,5,Integer.parseInt(page)));
        return result;
    }

    @RequestMapping(value = "/ProblemqueryById",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> ProblemqueryById(String id){
        Map<String,Object> result=new HashMap<>();
        result.put("result",problemService.queryById(Integer.parseInt(id)));
        return result;
    }
    @RequestMapping(value = "/ProblemqueryNum",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> ProblemNum(){
        Map<String,Object> result=new HashMap<>();
        result.put("result",problemService.ProblemNum());
        return result;
    }

    @RequestMapping(value = "/ProblemAdd",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> ProblemAdd(String problemType,String problemTitle,String problemAward,String problemAuthor,String problemAns,String problemAnalysis){
        Problem problem=new Problem();
        problem.setProblemAnalysis(problemAnalysis);
        problem.setProblemAns(problemAns);
        problem.setProblemAuthor(problemAuthor);
        problem.setProblemAward(Integer.parseInt(problemAward));
        problem.setProblemType(problemType);
        problem.setProblemTitle(problemTitle);
        Map<String,Object> result=new HashMap<>();
        try{
            problemService.add(problem);
            result.put("result","添加成功!");
        }catch (Exception e){
            result.put("result","添加失败!");
        }
        return result;
    }

}
