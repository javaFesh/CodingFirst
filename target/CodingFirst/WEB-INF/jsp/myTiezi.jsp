<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/13
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>我的帖子</title>
    <link rel="stylesheet" href="../../css/headercss.css">
    <link rel="stylesheet" href="../../css/personalExperience.css">
    <style>
        td{
            text-align: center;
        }
    </style>
</head>
<body>
<div class="header">
    <img src="../../image/logo.gif" alt="">
    <ul class="navbar_nav">
        <li class="active">
            <a href="javascript:void(0)">首页</a>
        </li>
        <li class="dropdown">
            <a href="javascript:void(0)">
                笔试
            </a>
            <div class="dropdown_menu">
                <a href="#">题库</a>
                <a href="#">模拟答卷</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="javascript:void(0)">面试</a>
            <div class="dropdown_menu">
                <a href="#">面试真题</a>
                <a href="#">面试技巧</a>
                <a href="#">HR面试</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="javascript:void(0)">找工作</a>
            <div class="dropdown_menu">
                <%--<a href="#">找工作</a>--%>
                <%--<a href="#">发布职位</a>--%>

            </div>
        </li>
        <li>
            <a href="javascript:void(0)">讨论区</a>
        </li>
        <li class="dropdown">

            <a href="javascript:void(0)"><div style="margin-top: -10px;width: 46px;height: 47px;background-image: url('../../image/sctp.png');border-radius: 25px">
                <c:if test="${loginUser.userPicture != null}">
                    <img src="${loginUser.userPicture}" alt="" style="width: 44px;height: 45px;border-radius: 25px">
                </c:if>
                <c:if test="${loginUser.userPicture == null}">
                    <img src="/image/sctp.png" alt="" style="width: 44px;height: 45px;border-radius: 25px">
                </c:if>
            </div></a>
            <div class="dropdown_menu">
                <a href="/user/personalExperience?id=${loginUser.userId}">个人简历</a>
                <a href="/user/hitExperience?id=${loginUser.userId}">已投企业</a>
                <a href="">我的帖子</a>
                <a href="">我的评论</a>
                <a href="/user/finishedWork?id=${loginUser.userId}">已做题目</a>
                <a href="/imageFile/selectImageFile?id=${loginUser.userId}">个人设置</a>
                <a href="../../index.jsp">退出</a>
            </div>
        </li>

    </ul>
</div>
<div class="framDiv" style="height: 900px;z-index: 0">
    <div class="container" style="height: 800px;width: 700px;left: 180px;">
        <span class="headerspan" id="sp1">我发过的帖子</span>
        <table style="margin: 20px auto;border: solid 1px coral;width: 650px">
            <thead>
            <th>帖子标题</th>
            <th>帖子内容</th>
            <th>发帖时间</th>
            <th>话题分类</th>
            <th>话题浏览量</th>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="list1">
                <tr>
                    <td>${list1.invitationTitle}</td>
                    <td><a href="/user/getInvatationDetails?id=${list1.invitationId}&uId=${loginUser.userId}">查看</a></td>
                    <td>${list1.invitationCreateTime}</td>
                    <td>${list1.invitationType}</td>
                    <td>${list1.invitationPageView}</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
    <div style="z-index: 1;background-color: white;width: 250px;height: 300px;position: fixed;right: 200px;top: 150px;">
        <span>帖子内容</span> <br>
        ${checkinvitationdetails}
    </div>
</div>
</body>
</html>
