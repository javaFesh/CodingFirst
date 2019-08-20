package com.fjut.oj.edu.model;

import java.util.Date;

public class Acborder {
    private Long orderid;

    private Long userid;

    private Long acbchange;

    private Long reason;

    private String mark;

    private Date time;

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getAcbchange() {
        return acbchange;
    }

    public void setAcbchange(Long acbchange) {
        this.acbchange = acbchange;
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
        this.mark = mark == null ? null : mark.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}