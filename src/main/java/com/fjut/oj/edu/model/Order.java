package com.fjut.oj.edu.model;

import java.util.Date;

public class Order {
    private Integer orderId;//账单ID递增
    private Integer userId;//用户名
    private Integer goodsId;//商品ID
    private Integer acb;//acv
    private Integer rmb;//
    private Date time;//账单时间
    private Integer isCancel;//订单状态（1：已付款，2：取消 ，0：待付款）


    public Order(Integer orderId, Integer userId, Integer goodsId, Integer acb, Integer rmb, Date time, Integer isCancel) {
        this.orderId = orderId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.acb = acb;
        this.rmb = rmb;
        this.time = time;
        this.isCancel = isCancel;
    }

    public Order() {
    }

    public Order(Integer userId, Integer goodsId, Integer acb, Integer rmb, Date time, Integer isCancel) {
        this.userId = userId;
        this.goodsId = goodsId;
        this.acb = acb;
        this.rmb = rmb;
        this.time = time;
        this.isCancel = isCancel;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(Integer isCancel) {
        this.isCancel = isCancel;
    }
}
