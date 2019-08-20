package com.fjut.oj.edu.model;

import java.util.Date;

public class Replyreply  {
    private Long replyReplyId;//回复回复ID

    private Long replyId;//被回复的ID

    private Long discussId;//被讨论的讨论ID
    private String userId;//回复人Id

    private Date replyTime;//回复时间

    private String replyText;//回复内容

    public Long getReplyReplyId() {
        return replyReplyId;
    }

    public void setReplyReplyId(Long replyReplyId) {
        this.replyReplyId = replyReplyId;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Long discussId) {
        this.discussId = discussId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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