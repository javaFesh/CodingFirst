package com.fjut.oj.edu.model;

import java.util.Date;

/**
 * 讨论表
 */
public class Discuss {
    private Long discussId;//ID

    private String discussTitle;//讨论标题

    private Date discussTime;//讨论发起时间

    private String discussAuthor;//讨论发起人

    private Long discussdAcb;//悬赏的ACB

    public Long getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Long discussId) {
        this.discussId = discussId;
    }

    public String getDiscussTitle() {
        return discussTitle;
    }

    public void setDiscussTitle(String discussTitle) {
        this.discussTitle = discussTitle;
    }

    public Date getDiscussTime() {
        return discussTime;
    }

    public void setDiscussTime(Date discussTime) {
        this.discussTime = discussTime;
    }

    public String getDiscussAuthor() {
        return discussAuthor;
    }

    public void setDiscussAuthor(String discussAuthor) {
        this.discussAuthor = discussAuthor;
    }

    public Long getDiscussdAcb() {
        return discussdAcb;
    }

    public void setDiscussdAcb(Long discussdAcb) {
        this.discussdAcb = discussdAcb;
    }
}