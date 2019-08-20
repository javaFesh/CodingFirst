package com.fjut.oj.edu.model;

public class Problem {
    private Long problemid;

    private Long problemtype;

    private String problemtitle;

    private Long problemaward;

    private String problemauthor;

    private String problemowner;

    private Long discussid;

    private String problemans;

    private String problemanalysis;

    public Long getProblemid() {
        return problemid;
    }

    public void setProblemid(Long problemid) {
        this.problemid = problemid;
    }

    public Long getProblemtype() {
        return problemtype;
    }

    public void setProblemtype(Long problemtype) {
        this.problemtype = problemtype;
    }

    public String getProblemtitle() {
        return problemtitle;
    }

    public void setProblemtitle(String problemtitle) {
        this.problemtitle = problemtitle == null ? null : problemtitle.trim();
    }

    public Long getProblemaward() {
        return problemaward;
    }

    public void setProblemaward(Long problemaward) {
        this.problemaward = problemaward;
    }

    public String getProblemauthor() {
        return problemauthor;
    }

    public void setProblemauthor(String problemauthor) {
        this.problemauthor = problemauthor == null ? null : problemauthor.trim();
    }

    public String getProblemowner() {
        return problemowner;
    }

    public void setProblemowner(String problemowner) {
        this.problemowner = problemowner == null ? null : problemowner.trim();
    }

    public Long getDiscussid() {
        return discussid;
    }

    public void setDiscussid(Long discussid) {
        this.discussid = discussid;
    }

    public String getProblemans() {
        return problemans;
    }

    public void setProblemans(String problemans) {
        this.problemans = problemans == null ? null : problemans.trim();
    }

    public String getProblemanalysis() {
        return problemanalysis;
    }

    public void setProblemanalysis(String problemanalysis) {
        this.problemanalysis = problemanalysis == null ? null : problemanalysis.trim();
    }
}