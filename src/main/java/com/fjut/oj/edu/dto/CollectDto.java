package com.fjut.oj.edu.dto;

import java.util.List;

public class CollectDto {

    private Integer userId;//用户ID

    private List<Integer> problemIds; //问题ID

    private List<Integer> courseIds;//课程ID

    private List<Integer> discussIds;//讨论区ID


    public CollectDto() {
    }

    public CollectDto(Integer userId, List<Integer> problemIds, List<Integer> courseIds, List<Integer> discussIds) {
        this.userId = userId;
        this.problemIds = problemIds;
        this.courseIds = courseIds;
        this.discussIds = discussIds;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Integer> getProblemIds() {
        return problemIds;
    }

    public void setProblemIds(List<Integer> problemIds) {
        this.problemIds = problemIds;
    }

    public List<Integer> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(List<Integer> courseIds) {
        this.courseIds = courseIds;
    }

    public List<Integer> getDiscussIds() {
        return discussIds;
    }

    public void setDiscussIds(List<Integer> discussIds) {
        this.discussIds = discussIds;
    }
}
