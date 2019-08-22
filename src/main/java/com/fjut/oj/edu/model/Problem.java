package com.fjut.oj.edu.model;

public class Problem {
    private Integer problemId;//题目ID

    private Integer problemType;//题目类型

    private String problemTitle;//题目标题

    private Integer problemAward;//题目完成积分

    private Integer problemAuthor;//题目作者

    private Integer problemOwner;//题目所有者

    private Integer discussId;//讨论区Id（创建题目的同时建立讨论区两者绑定）

    private String problemAns;//题目答案

    private String problemAnalysis;//题目解析

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Integer getProblemType() {
        return problemType;
    }

    public void setProblemType(Integer problemType) {
        this.problemType = problemType;
    }

    public String getProblemTitle() {
        return problemTitle;
    }

    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }

    public Integer getProblemAward() {
        return problemAward;
    }

    public void setProblemAward(Integer problemAward) {
        this.problemAward = problemAward;
    }

    public Integer getProblemAuthor() {
        return problemAuthor;
    }

    public void setProblemAuthor(Integer problemAuthor) {
        this.problemAuthor = problemAuthor;
    }

    public Integer getProblemOwner() {
        return problemOwner;
    }

    public void setProblemOwner(Integer problemOwner) {
        this.problemOwner = problemOwner;
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }

    public String getProblemAns() {
        return problemAns;
    }

    public void setProblemAns(String problemAns) {
        this.problemAns = problemAns;
    }

    public String getProblemAnalysis() {
        return problemAnalysis;
    }

    public void setProblemAnalysis(String problemAnalysis) {
        this.problemAnalysis = problemAnalysis;
    }
}