package com.fjut.oj.edu.pojo;

import java.util.Date;

public class TReplyreply extends TReplyreplyKey {
    private String userid;

    private Date replytime;

    private String replytext;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public String getReplytext() {
        return replytext;
    }

    public void setReplytext(String replytext) {
        this.replytext = replytext == null ? null : replytext.trim();
    }
}