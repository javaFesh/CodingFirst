package com.fjut.oj.edu.model;

import java.util.Date;

public class Discussreply  {
    private Date replytime;

    private String replyauthor;

    private String replytext;
    private Long replyid;

    private Long discussid;

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

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public String getReplyauthor() {
        return replyauthor;
    }

    public void setReplyauthor(String replyauthor) {
        this.replyauthor = replyauthor == null ? null : replyauthor.trim();
    }

    public String getReplytext() {
        return replytext;
    }

    public void setReplytext(String replytext) {
        this.replytext = replytext == null ? null : replytext.trim();
    }
}