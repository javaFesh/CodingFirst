<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.colin.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: ly128
  Date: 2019/7/13
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>我的帖子</title>
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css"/>
    <link rel="stylesheet" href="/css/head.css"/>
    <link rel="stylesheet" href="/css/index.css">
    <link rel="stylesheet" href="/css/discussion.css">
    <link rel="stylesheet" href="/css/myInvitation.css">
    <script src="/js/discussion.js" type="text/javascript" language="javascript" defer="defer"></script>
</head>
<body style="background-color: #f8f8f8">
<%@ include file="head.jsp" %>
<!-- 导航 -->
<%--<header class="header" style="background-color: #3d3d3d">--%>
    <%--<div class="container clearfix">--%>
        <%--<div class="fl left">--%>
            <%--<a href="javascript:void(0)"><img src="/image/logo.gif" alt="" class="img1"/></a>--%>
            <%--<a href="javascript:void(0)"><img src="/image/logo.gif" alt="" class="img2"/></a>--%>
        <%--</div>--%>
        <%--<div class="fr nav">--%>
            <%--<ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">--%>
                <%--<li class="active">--%>
                    <%--<a href="/#">首页</a>--%>
                <%--</li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="javascript:void(0)">--%>
                        <%--笔试--%>
                    <%--</a>--%>
                    <%--<div class="dropdown_menu">--%>
                        <%--<a href="#">题库</a>--%>
                        <%--<a href="#">模拟答卷</a>--%>

                    <%--</div>--%>
                <%--</li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="javascript:void(0)">面试</a>--%>
                    <%--<div class="dropdown_menu">--%>
                        <%--<a href="#">历年真题</a>--%>
                        <%--<a href="#">HR面试</a>--%>
                        <%--<a href="#">面试技巧</a>--%>
                    <%--</div>--%>
                <%--</li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="javascript:void(0)">求职</a>--%>
                    <%--<div class="dropdown_menu">--%>
                        <%--<a href="#">找工作</a>--%>
                        <%--<a href="#">发布职位</a>--%>

                    <%--</div>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="/invitation/selectAll">讨论区</a>--%>
                <%--</li>--%>
                <%--<% if (session.getAttribute("loginUser") == null) {%>--%>
                <%--<li>--%>
                    <%--<a href="/user/login">登录</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="https://www.baidu.com">注册</a>--%>
                <%--</li>--%>
                <%--<%} else {%>--%>
                <%--<li>--%>
                    <%--hello &nbsp; ${loginUser.userName}--%>
                <%--</li>--%>
                <%--<%}%>--%>
            <%--</ul>--%>
        <%--</div>--%>
        <%--<a href="javascript:void(0)" id="navToggle">--%>
            <%--<span></span>--%>
        <%--</a>--%>
    <%--</div>--%>
<%--</header>--%>
<%--<!--移动端的导航-->--%>
<%--<div class="m_nav">--%>
    <%--<div class="top clearfix">--%>
        <%--<img src="/image/closed.png" alt="" class="closed"/>--%>
    <%--</div>--%>
    <%--<div class="logo">--%>
        <%--<img src="/image/logo.gif" alt=""/>--%>
    <%--</div>--%>
    <%--<ul class="ul" data-in="fadeInDown" data-out="fadeOutUp">--%>
        <%--<li class="active">--%>
            <%--<a href="/#">首页</a>--%>
        <%--</li>--%>
        <%--<li class="dropdown">--%>
            <%--<a href="javascript:void(0)">--%>
                <%--笔试--%>
            <%--</a>--%>
            <%--<div class="dropdown_menu">--%>
                <%--<a href="#">题库</a>--%>
                <%--<a href="#">模拟答卷</a>--%>
            <%--</div>--%>
        <%--</li>--%>
        <%--<li class="dropdown">--%>
            <%--<a href="javascript:void(0)">面试</a>--%>
            <%--<div class="dropdown_menu">--%>
                <%--<a href="#">历年真题</a>--%>
                <%--<a href="#">HR面试</a>--%>
                <%--<a href="#">面试技巧</a>--%>
            <%--</div>--%>
        <%--</li>--%>
        <%--<li class="dropdown">--%>
            <%--<a href="javascript:void(0)">求职</a>--%>
            <%--<div class="dropdown_menu">--%>
                <%--<a href="#">找工作</a>--%>
                <%--<a href="#">发布职位</a>--%>

            <%--</div>--%>
        <%--</li>--%>
        <%--<li>--%>
            <%--<a href="/invitation/selectAll">讨论区</a>--%>
        <%--</li>--%>

    <%--</ul>--%>
<%--</div>--%>
<%--<!-- 个人信息 -->--%>
<div id="info">
    <div style="width: 100px; height:80px;float: left;">
        <img src="/${loginUser.userPicture}" alt="">
    </div>
    <div style="width: 700px;padding: 20px 0 0 10px; float: left;">
        <div>
            ${loginUser.userName}&nbsp;${loginUser.userId}
        </div>
        <div style="font-size: 12px;margin-top: 5px">
            <%
                User user = (User) session.getAttribute("loginUser");
                if (user.getUserSchool() == null) {
            %>
            未填写学校信息
            <%
            } else {
            %>
            ${loginUser.userSchool}
            <%
                }
            %>&nbsp;&nbsp;&nbsp;&nbsp;
        </div>
    </div>
    <div style="width: 300px; float: right">
        <a href="/#" id="changeInfo">编辑</a>
    </div>
</div>
<div style="margin: 10px auto;width: 1100px;padding: 10px">
    <table id="discussionList">
        <c:forEach items="${invitationList}" var="invitation">
            <tr>
                <td>
                    <div id="talk">
                        <div id="talkName">
                            <a href="/invitation/selectById?id= ${invitation.invitationId}">${invitation.invitationTitle}</a>
                        </div>
                        <div id="talkMessage" style="width: 700px; ">
                            <div id="talkMessageLeft" style="float:left;">
                                评论${invitation.invitationCommentNumber}&nbsp;|&nbsp;
                                赞${invitation.invitationAgreeNumber}&nbsp;|&nbsp;
                                浏览量${invitation.invitationPageView}&nbsp;&nbsp;
                                    ${invitation.invitationCreateTime}&nbsp;&nbsp;
                                发表在[${invitation.invitationType.invitationTypeName}]
                            </div>
                            <div id="talkMessageRight" style="float:right;">
                                <a href="/invitation/deleteInvitationById?id=${invitation.invitationId}">删除</a>
                                <a href="/invitation/updateInvitation?invitationId=${invitation.invitationId}">修改</a>
                            </div>
                        </div>
                    </div>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="1" align="center">
                当前${pageBean.currentPage}/${pageBean.totalPage}页&nbsp;&nbsp;
                <a href="/invitation/selectInvitationByUser?page=1">首页</a>&nbsp;
                <a href="/invitation/selectInvitationByUser?page=${pageBean.currentPage-1}">上一页</a>&nbsp;
                <a href="/invitation/selectInvitationByUser?page=${pageBean.currentPage+1}">下一页</a>&nbsp;
                <a href="/invitation/selectInvitationByUser?page=${pageBean.totalPage}">末页</a>
            </td>
        </tr>
    </table>
</div>


<div id="invitationBottom">青年无忧，物联网求职必备神器</div>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
<script src="/js/jquery.fullPage.min.js"></script>
<script src="/js/index_slick.js"></script>
<script src="/js/swiper.min.js"></script>
<script src="/js/index.js"></script>

</body>
</html>
