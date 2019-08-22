<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/12
  Time: 1:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我做过的题目</title>
    <link rel="stylesheet" href="../../css/headercss.css">
    <link rel="stylesheet" href="../../css/personalExperience.css">
    <style>
        td{
            text-align: center;
            color: lightseagreen;
        }

    </style>
</head>
<body>
<div class="header" style="background-color: transparent;">
    <img src="../../image/logo.gif" alt="">
    <ul class="navbar_nav">
        <li class="active">
            <a href="/user/goNumberOne?id=${loginUser.userId}">首页</a>
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
                <a href="/user/getInterviewForUser?typeId=1">面试真题</a>
                <a href="/faceSkill/showAllInterviewSkillForUser">面试技巧</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="/job/main?currentPage=1">找工作</a>
            <div class="dropdown_menu">
                <%--<a href="#">找工作</a>--%>
                <%--<a href="#">发布职位</a>--%>

            </div>
        </li>

        <li>
            <a href="/invitation/selectAll">讨论区</a>
        </li>
        <li class="dropdown">

            <a href="javascript:void(0)"><div style="margin-top: -10px;width: 46px;height: 47px;border-radius: 25px">
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
                <%--<a href="/user/getAllmyTiezi?id=${loginUser.userId}">我的帖子</a>--%>
                <%--<a href="/user/getAllmyComment?id=${loginUser.userId}">我的评论</a>--%>
                <%--<a href="/user/finishedWork?id=${loginUser.userId}">已做题目</a>--%>
                <a href="/imageFile/selectImageFile?id=${loginUser.userId}">个人设置</a>
                <a href="/user/login">退出</a>
            </div>
        </li>

    </ul>
</div>
<div class="framDiv" style="height: 900px;z-index: 0">
    <div class="container" style="height: 800px;width: 550px;left: 20px;overflow: auto">
        <span class="headerspan" id="sp1">我做过的面试</span>
        <table style="margin: 20px auto;border: solid 1px coral;width: 480px">
            <thead>
            <th>编号</th>
            <th>面试题目</th>
            <th>我的答案</th>
            <th>标准答案</th>
            </thead>
            <tbody>
            <c:forEach items="${list1}" var="list1">
                <tr>
                    <td>${list1.id}</td>
                    <td>${list1.question}</td>
                    <td>${list1.answer}</td>
                    <td>${list1.crrAnswer}</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
    <div class="container" style="height: 800px;width: 550px;left: 620px;overflow: auto">
        <span class="headerspan" id="sp1">我做过的笔试</span>
        <table style="margin: 20px auto;border: solid 1px coral;width: 480px">
            <thead>
            <th>编号</th>
            <th>笔试题目</th>
            <th>我的答案</th>
            <th>标准答案</th>
            </thead>
            <tbody>
            <c:forEach items="${list2}" var="list2">
                <tr>
                    <td>${list2.id}</td>
                    <td>${list2.question}</td>
                    <td>${list2.answer}</td>
                    <td>${list2.crrAnswer}</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>
