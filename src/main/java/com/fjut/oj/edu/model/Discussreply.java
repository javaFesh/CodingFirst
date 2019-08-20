package com.fjut.oj.edu.model;

import java.util.Date;

/**
 * 讨论回复表
 */
public class Discussreply  {
    private Date replyTime;//回复时间

    private String userId;//回复人


    private String replyText;//回复内容


    private Long replyId;//回复ID

    private Discuss discussId;//被回复讨论ID

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Discuss getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Discuss discussId) {
        this.discussId = discussId;
    }
}