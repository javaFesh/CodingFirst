package com.fjut.oj.edu.model;

import java.util.Date;

public class Discuss {
    private Long discussid;

    private String discusstitle;

    private Date discusstime;

    private String discussauthor;

    private Long discussdacb;

    public Long getDiscussid() {
        return discussid;
    }

    public void setDiscussid(Long discussid) {
        this.discussid = discussid;
    }

    public String getDiscusstitle() {
        return discusstitle;
    }

    public void setDiscusstitle(String discusstitle) {
        this.discusstitle = discusstitle == null ? null : discusstitle.trim();
    }

    public Date getDiscusstime() {
        return discusstime;
    }

    public void setDiscusstime(Date discusstime) {
        this.discusstime = discusstime;
    }

    public String getDiscussauthor() {
        return discussauthor;
    }

    public void setDiscussauthor(String discussauthor) {
        this.discussauthor = discussauthor == null ? null : discussauthor.trim();
    }

    public Long getDiscussdacb() {
        return discussdacb;
    }

    public void setDiscussdacb(Long discussdacb) {
        this.discussdacb = discussdacb;
    }
}