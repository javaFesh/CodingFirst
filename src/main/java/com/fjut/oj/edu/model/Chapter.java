package com.fjut.oj.edu.model;

public class Chapter {
    private Integer chapterId;//课时ID

    private Integer courseId;//对相应的课程ID

    private String chapterName;//章节名称

    private String chapterIntroductions;//章节描述

    private String chapterResource;//章节资源


    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterIntroductions() {
        return chapterIntroductions;
    }

    public void setChapterIntroductions(String chapterIntroductions) {
        this.chapterIntroductions = chapterIntroductions;
    }

    public String getChapterResource() {
        return chapterResource;
    }

    public void setChapterResource(String chapterResource) {
        this.chapterResource = chapterResource;
    }
}