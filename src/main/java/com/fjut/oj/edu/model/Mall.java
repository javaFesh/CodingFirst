package com.fjut.oj.edu.model;

import java.util.Date;

public class Mall {
    private Long mallId;

    private String mallTitle;

    private Long acb;

    private Long rmb;

    private String userId;

    private Date endTime;

    private Long buyLimit;

    public Long getMallId() {
        return mallId;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public String getMallTitle() {
        return mallTitle;
    }

    public void setMallTitle(String mallTitle) {
        this.mallTitle = mallTitle;
    }

    public Long getAcb() {
        return acb;
    }

    public void setAcb(Long acb) {
        this.acb = acb;
    }

    public Long getRmb() {
        return rmb;
    }

    public void setRmb(Long rmb) {
        this.rmb = rmb;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getBuyLimit() {
        return buyLimit;
    }

    public void setBuyLimit(Long buyLimit) {
        this.buyLimit = buyLimit;
    }
}