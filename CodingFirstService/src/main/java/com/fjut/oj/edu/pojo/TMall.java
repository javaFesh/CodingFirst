package com.fjut.oj.edu.pojo;

import java.util.Date;

public class TMall {
    private Long mallid;

    private String malltitle;

    private Long acb;

    private Long rmb;

    private String userid;

    private Date endtime;

    private Long buylimit;

    public Long getMallid() {
        return mallid;
    }

    public void setMallid(Long mallid) {
        this.mallid = mallid;
    }

    public String getMalltitle() {
        return malltitle;
    }

    public void setMalltitle(String malltitle) {
        this.malltitle = malltitle == null ? null : malltitle.trim();
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Long getBuylimit() {
        return buylimit;
    }

    public void setBuylimit(Long buylimit) {
        this.buylimit = buylimit;
    }
}