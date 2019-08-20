package com.fjut.oj.edu.pojo;

public class TProblemTag {
    private Long pTagid;

    private String pTagname;

    public Long getpTagid() {
        return pTagid;
    }

    public void setpTagid(Long pTagid) {
        this.pTagid = pTagid;
    }

    public String getpTagname() {
        return pTagname;
    }

    public void setpTagname(String pTagname) {
        this.pTagname = pTagname == null ? null : pTagname.trim();
    }
}