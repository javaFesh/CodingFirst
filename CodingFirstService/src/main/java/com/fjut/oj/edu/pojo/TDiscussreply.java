package com.fjut.oj.edu.pojo;

import java.util.Date;

public class TDiscussreply extends TDiscussreplyKey {
    private Date replytime;

    private String replyauthor;

    private String replytext;

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public String getReplyauthor() {
        return replyauthor;
    }

    public void setReplyauthor(String replyauthor) {
        this.replyauthor = replyauthor == null ? null : replyauthor.trim();
    }

    public String getReplytext() {
        return replytext;
    }

    public void setReplytext(String replytext) {
        this.replytext = replytext == null ? null : replytext.trim();
    }
}