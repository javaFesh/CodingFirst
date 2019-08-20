package com.fjut.oj.edu.model;

import java.util.Date;

public class Course {
    private Long courseId;//课程ID

    private String courseName;//课程名称

    private String courseIntroduction;//课程介绍

    private String courseImg;//课程图片

    private Long courseLength;//课程节数

    private Date courseStartTime;//课程开始时间

    private Date courseEndTime;//课程结束时间

    private Long teacherId;

    private Double courseCharge;//课程价格

    private Long courseNumAccount;//课程人数

    private Long coursePush;//课程推送与否0为默认，-1为推送

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
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

    public Long getCourseLength() {
        return courseLength;
    }

    public void setCourseLength(Long courseLength) {
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

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Double getCourseCharge() {
        return courseCharge;
    }

    public void setCourseCharge(Double courseCharge) {
        this.courseCharge = courseCharge;
    }

    public Long getCourseNumAccount() {
        return courseNumAccount;
    }

    public void setCourseNumAccount(Long courseNumAccount) {
        this.courseNumAccount = courseNumAccount;
    }

    public Long getCoursePush() {
        return coursePush;
    }

    public void setCoursePush(Long coursePush) {
        this.coursePush = coursePush;
    }
}