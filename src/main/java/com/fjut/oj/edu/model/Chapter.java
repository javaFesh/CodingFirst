package com.fjut.oj.edu.model;

public class Chapter {
    private Long chapterId;//课时ID

    private Long courseId;//对相应的课程ID

    private String chapterName;//章节名称

    private String chapterIntroductions;//章节描述

    private String chapterResource;//章节资源


    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
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