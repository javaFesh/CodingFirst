package com.fjut.oj.edu.model;

import java.util.Date;

public class Acborder {
    private Integer orderId;//账单Id

    private Integer userId;//用户ID

    private Integer acbChange;//ACB改变数量

    private Integer reason;//改变原因

    private String mark;//备注

    private Date time;//改变时间

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

    public Integer getAcbChange() {
        return acbChange;
    }

    public void setAcbChange(Integer acbChange) {
        this.acbChange = acbChange;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}