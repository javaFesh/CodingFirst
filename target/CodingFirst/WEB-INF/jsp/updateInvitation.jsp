<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: ly128
  Date: 2019/7/10
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>修改话题</title>
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css" />
    <link rel="stylesheet" href="/css/head.css" />
    <link rel="stylesheet" href="/css/index.css">
    <link rel="stylesheet" href="/css/discussion.css">
</head>
<body style="background-color: #f8f8f8">
<!-- 导航 -->
<%@ include file="head.jsp" %>
<%--<header class="header" style="background-color: #3d3d3d">--%>
    <%--<div class="container clearfix">--%>
        <%--<div class="fl left">--%>
            <%--<a href="javascript:void(0)" ><img src="/image/logo.gif" alt="" class="img1" /></a>--%>
            <%--<a href="javascript:void(0)" ><img src="/image/logo.gif" alt="" class="img2" /></a>--%>
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
                <%--<li>--%>
                    <%--hello &nbsp; ${loginUser.userName}--%>
                <%--</li>--%>
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
        <%--<img src="/image/closed.png" alt="" class="closed" />--%>
    <%--</div>--%>
    <%--<div class="logo">--%>
        <%--<img src="/image/logo.gif" alt="" />--%>
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
<!-- top -->
<div id="invitationTop"><a href="/#"><img src="/image/addInvitationTop.jpg" ></a></div>
<div style="width:1100px;margin: 10px auto;">
    <form action="/invitation/doUpdateInvitation" onsubmit="return checkInsert();">
        <input type="text" name="invitationTitle" value="${invitation.invitationTitle}" style="margin:10px 0; width:500px; border: 1px solid lightgrey;"/><br>

        <textarea name="invitationContent" id="invitationContent" cols="140" rows="10" value="${invitation.invitationContent}" style="margin:10px 0;width:1100px;border: 1px solid lightgrey"></textarea><br>
        文章类型：
        <select name="invitationTypeName" >
        <option value="">-- 请选择 --</option>
        <c:forEach items="${invitationTypeList}" var="invitationType">
            <option name="invitationTypeName" >${invitationType.invitationTypeName}</option>
        </c:forEach>
        </select>
        <br>
        若文章类型不存在，请输入：<input type="text" name="invitationTypeName2" style="border: 1px solid lightgrey" >
        <br>
        <input type="submit" >
    </form>
</div>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
<script src="/js/jquery.fullPage.min.js"></script>
<script src="/js/index_slick.js"></script>
<script src="/js/swiper.min.js"></script>
<script src="/js/index.js"></script>
<script src="/js/addInvitation.js"></script>
</body>
</html>
