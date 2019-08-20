package com.fjut.oj.edu.model;

import java.util.Date;

public class User {
    private String userId;///用户名

    private String userPwd;//用户密码

    private String nick;//用户昵称


    private String userimg;//用户头像
    private String gender;//用户性别

    private String school;//学校

    private String email;//邮箱

    private String motto;//签名

    private Date registertime;//注册时间

    private Long type;//用户类型

    private Long acb;//

    private String name;//真实姓名

    private String phone;

    private Long acnum;//通过的题目数




    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getAcb() {
        return acb;
    }

    public void setAcb(Long acb) {
        this.acb = acb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Long getAcnum() {
        return acnum;
    }

    public void setAcnum(Long acnum) {
        this.acnum = acnum;
    }





}
