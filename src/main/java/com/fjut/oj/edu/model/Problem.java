package com.fjut.oj.edu.model;

public class Problem {
    private Long problemId;//题目ID

    private Long problemType;//题目类型

    private String problemTitle;//题目标题

    private Long problemAward;//题目完成积分

    private String problemAuthor;//题目作者

    private String problemOwner;//题目所有者

    private Long discussId;//讨论区Id（创建题目的同时建立讨论区两者绑定）

    private String problemAns;//题目答案

    private String problemAnalysis;//题目解析

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public Long getProblemType() {
        return problemType;
    }

    public void setProblemType(Long problemType) {
        this.problemType = problemType;
    }

    public String getProblemTitle() {
        return problemTitle;
    }

    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }

    public Long getProblemAward() {
        return problemAward;
    }

    public void setProblemAward(Long problemAward) {
        this.problemAward = problemAward;
    }

    public String getProblemAuthor() {
        return problemAuthor;
    }

    public void setProblemAuthor(String problemAuthor) {
        this.problemAuthor = problemAuthor;
    }

    public String getProblemOwner() {
        return problemOwner;
    }

    public void setProblemOwner(String problemOwner) {
        this.problemOwner = problemOwner;
    }

    public Long getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Long discussId) {
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