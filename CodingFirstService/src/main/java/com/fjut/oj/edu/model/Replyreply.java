package com.fjut.oj.edu.model;

import java.util.Date;

public class Replyreply  {
    private String userid;

    private Date replytime;

    private String replytext;


    private Long replyreplyid;

    private Long replyid;

    private Long discussid;

    public Long getReplyreplyid() {
        return replyreplyid;
    }

    public void setReplyreplyid(Long replyreplyid) {
        this.replyreplyid = replyreplyid;
    }

    public Long getReplyid() {
        return replyid;
    }

    public void setReplyid(Long replyid) {
        this.replyid = replyid;
    }

    public Long getDiscussid() {
        return discussid;
    }

    public void setDiscussid(Long discussid) {
        this.discussid = discussid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public String getReplytext() {
        return replytext;
    }

    public void setReplytext(String replytext) {
        this.replytext = replytext == null ? null : replytext.trim();
    }
}