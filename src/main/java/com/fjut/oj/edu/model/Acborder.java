package com.fjut.oj.edu.model;

import java.util.Date;

public class Acborder {
    private Long orderId;//账单Id

    private Long userId;//用户ID

    private Long acbChange;//ACB改变数量

    private Long reason;//改变原因

    private String mark;//备注

    private Date time;//改变时间

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAcbChange() {
        return acbChange;
    }

    public void setAcbChange(Long acbChange) {
        this.acbChange = acbChange;
    }

    public Long getReason() {
        return reason;
    }

    public void setReason(Long reason) {
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