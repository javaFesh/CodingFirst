package com.fjut.oj.edu.model;

import java.util.Date;

public class Mall {
    private Integer mallId;//商品ID

    private String mallTitle;//商品标题

    private String mallImg;//商品图片

    private Integer acb;//所需ACB

    private Integer rmb;//人民币

    private Integer userId;//发布者ID

    private Date endTime;//截止时间

    private Integer buyLimit;//购买限制

    private Integer mallAccount;//商品数量

    public Mall() {
    }


    public Integer getMallAccount() {
        return mallAccount;
    }

    public void setMallAccount(Integer mallAccount) {
        this.mallAccount = mallAccount;
    }

    public Mall( String mallTitle, String mallImg, Integer acb, Integer rmb, Integer userId, Date endTime, Integer buyLimit, Integer mallAccount) {
        this.mallTitle = mallTitle;
        this.mallImg = mallImg;
        this.acb = acb;
        this.rmb = rmb;
        this.userId = userId;
        this.endTime = endTime;
        this.buyLimit = buyLimit;
        this.mallAccount = mallAccount;
    }
    public Mall(Integer mallId, String mallTitle, String mallImg, Integer acb, Integer rmb, Integer userId, Date endTime, Integer buyLimit, Integer mallAccount) {
        this.mallId = mallId;
        this.mallTitle = mallTitle;
        this.mallImg = mallImg;
        this.acb = acb;
        this.rmb = rmb;
        this.userId = userId;
        this.endTime = endTime;
        this.buyLimit = buyLimit;
        this.mallAccount = mallAccount;
    }

    public String getMallImg() {
        return mallImg;
    }

    public void setMallImg(String mallImg) {
        this.mallImg = mallImg;
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public String getMallTitle() {
        return mallTitle;
    }

    public void setMallTitle(String mallTitle) {
        this.mallTitle = mallTitle;
    }

    public Integer getAcb() {
        return acb;
    }

    public void setAcb(Integer acb) {
        this.acb = acb;
    }

    public Integer getRmb() {
        return rmb;
    }

    public void setRmb(Integer rmb) {
        this.rmb = rmb;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getBuyLimit() {
        return buyLimit;
    }

    public void setBuyLimit(Integer buyLimit) {
        this.buyLimit = buyLimit;
    }
}