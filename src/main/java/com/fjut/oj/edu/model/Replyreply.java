package com.fjut.oj.edu.model;

import java.util.Date;

public class Replyreply  {
    private Integer replyReplyId;//回复回复ID

    private Integer replyId;//被回复的ID

    private Integer discussId;//被讨论的讨论ID
    private Integer userId;//回复人Id

    private Date replyTime;//回复时间

    private String replyText;//回复内容

    public Integer getReplyReplyId() {
        return replyReplyId;
    }

    public void setReplyReplyId(Integer replyReplyId) {
        this.replyReplyId = replyReplyId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }
}