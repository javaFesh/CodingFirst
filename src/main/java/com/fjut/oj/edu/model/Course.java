package com.fjut.oj.edu.model;

import java.util.Date;

public class Course {
    private Integer courseId;//课程ID

    private String courseName;//课程名称

    private String courseIntroduction;//课程介绍

    private String courseImg;//课程图片

    private Integer courseLength;//课程节数

    private Date courseStartTime;//课程开始时间

    private Date courseEndTime;//课程结束时间

    private Integer teacherId;

    private Double courseCharge;//课程价格

    private Integer courseNumAccount;//课程人数

    private Integer coursePush;//课程推送与否0为默认，-1为推送

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public Integer getCourseLength() {
        return courseLength;
    }

    public void setCourseLength(Integer courseLength) {
        this.courseLength = courseLength;
    }

    public Date getCourseStartTime() {
        return courseStartTime;
    }

    public void setCourseStartTime(Date courseStartTime) {
        this.courseStartTime = courseStartTime;
    }

    public Date getCourseEndTime() {
        return courseEndTime;
    }

    public void setCourseEndTime(Date courseEndTime) {
        this.courseEndTime = courseEndTime;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Double getCourseCharge() {
        return courseCharge;
    }

    public void setCourseCharge(Double courseCharge) {
        this.courseCharge = courseCharge;
    }

    public Integer getCourseNumAccount() {
        return courseNumAccount;
    }

    public void setCourseNumAccount(Integer courseNumAccount) {
        this.courseNumAccount = courseNumAccount;
    }

    public Integer getCoursePush() {
        return coursePush;
    }

    public void setCoursePush(Integer coursePush) {
        this.coursePush = coursePush;
    }
}