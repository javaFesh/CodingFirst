package com.fjut.oj.edu.model;

import java.util.Date;

public class Course {
    private Long courseid;

    private String coursename;

    private String courseintroduction;

    private String courseimg;

    private Long courselength;

    private Date coursestarttime;

    private Date courseendtime;

    private Long teacherid;

    private Double coursecharge;

    private Long coursenumaccount;

    private Long coursepush;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCourseintroduction() {
        return courseintroduction;
    }

    public void setCourseintroduction(String courseintroduction) {
        this.courseintroduction = courseintroduction == null ? null : courseintroduction.trim();
    }

    public String getCourseimg() {
        return courseimg;
    }

    public void setCourseimg(String courseimg) {
        this.courseimg = courseimg == null ? null : courseimg.trim();
    }

    public Long getCourselength() {
        return courselength;
    }

    public void setCourselength(Long courselength) {
        this.courselength = courselength;
    }

    public Date getCoursestarttime() {
        return coursestarttime;
    }

    public void setCoursestarttime(Date coursestarttime) {
        this.coursestarttime = coursestarttime;
    }

    public Date getCourseendtime() {
        return courseendtime;
    }

    public void setCourseendtime(Date courseendtime) {
        this.courseendtime = courseendtime;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    public Double getCoursecharge() {
        return coursecharge;
    }

    public void setCoursecharge(Double coursecharge) {
        this.coursecharge = coursecharge;
    }

    public Long getCoursenumaccount() {
        return coursenumaccount;
    }

    public void setCoursenumaccount(Long coursenumaccount) {
        this.coursenumaccount = coursenumaccount;
    }

    public Long getCoursepush() {
        return coursepush;
    }

    public void setCoursepush(Long coursepush) {
        this.coursepush = coursepush;
    }
}