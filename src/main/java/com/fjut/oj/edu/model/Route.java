package com.fjut.oj.edu.model;

public class Route {
    private Long routeouteId;//学习路线ID

    private Long courseId;//课程ID

    private Long problemId;//题目ID

    private String lname;//学习路线名称

    private String lbigintroductions;//学习路线描述

    public Long getRouteouteId() {
        return routeouteId;
    }

    public void setRouteouteId(Long routeouteId) {
        this.routeouteId = routeouteId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getLbigintroductions() {
        return lbigintroductions;
    }

    public void setLbigintroductions(String lbigintroductions) {
        this.lbigintroductions = lbigintroductions == null ? null : lbigintroductions.trim();
    }
}