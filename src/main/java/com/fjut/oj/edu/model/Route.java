package com.fjut.oj.edu.model;

public class Route {
    private Integer routeouteId;//学习路线ID

    private Integer courseId;//课程ID

    private Integer problemId;//题目ID

    private String lname;//学习路线名称

    private String lbigintroductions;//学习路线描述

    public Integer getRouteouteId() {
        return routeouteId;
    }

    public void setRouteouteId(Integer routeouteId) {
        this.routeouteId = routeouteId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
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