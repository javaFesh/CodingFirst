package com.fjut.oj.edu.model;

public class Route {
    private Long routeouteid;

    private Long courseid;

    private Long problemid;

    private String lname;

    private String lbigintroductions;

    public Long getRouteouteid() {
        return routeouteid;
    }

    public void setRouteouteid(Long routeouteid) {
        this.routeouteid = routeouteid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Long getProblemid() {
        return problemid;
    }

    public void setProblemid(Long problemid) {
        this.problemid = problemid;
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