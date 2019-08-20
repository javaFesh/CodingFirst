package com.fjut.oj.edu.model;

public class Chapter {
    private Long chapterid;

    private Long courseid;

    private String chaptername;

    private String chapterintroductions;

    private String chapterresource;

    public Long getChapterid() {
        return chapterid;
    }

    public void setChapterid(Long chapterid) {
        this.chapterid = chapterid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public String getChaptername() {
        return chaptername;
    }

    public void setChaptername(String chaptername) {
        this.chaptername = chaptername == null ? null : chaptername.trim();
    }

    public String getChapterintroductions() {
        return chapterintroductions;
    }

    public void setChapterintroductions(String chapterintroductions) {
        this.chapterintroductions = chapterintroductions == null ? null : chapterintroductions.trim();
    }

    public String getChapterresource() {
        return chapterresource;
    }

    public void setChapterresource(String chapterresource) {
        this.chapterresource = chapterresource == null ? null : chapterresource.trim();
    }
}