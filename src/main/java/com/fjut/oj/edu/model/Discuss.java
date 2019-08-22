package com.fjut.oj.edu.model;

import java.util.Date;

/**
 * 讨论表
 */
public class Discuss {
    private Integer discussId;//ID

    private String discussTitle;//讨论标题

    private Date discussTime;//讨论发起时间

    private Integer discussAuthor;//讨论发起人

    private Integer discussdAcb;//悬赏的ACB

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
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

    public Integer getDiscussAuthor() {
        return discussAuthor;
    }

    public void setDiscussAuthor(Integer discussAuthor) {
        this.discussAuthor = discussAuthor;
    }

    public Integer getDiscussdAcb() {
        return discussdAcb;
    }

    public void setDiscussdAcb(Integer discussdAcb) {
        this.discussdAcb = discussdAcb;
    }
}