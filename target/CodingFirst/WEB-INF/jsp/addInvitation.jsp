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
    <title>发布话题</title>
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css" />
    <link rel="stylesheet" href="/css/head.css" />
    <link rel="stylesheet" href="/css/index.css">
    <link rel="stylesheet" href="/css/discussion.css">
    <script charset="utf-8" src="/kindeditor/kindeditor-all.js"></script>
    <script charset="utf-8" src="/kindeditor/lang/zh-CN.js"></script>
    <script>
        KindEditor.ready(function (K) {
            window.editor = K.create('#editor_id');
        });
    </script>
    <style>
        body{
            background: #EAEAEA; !important;
            font-family: "Avant Garde","Tahoma","Microsoft YaHei","SimHei" !important;
            color: #999999 !important;
            font-weight: bold !important;
            font-size:  13px !important;
            /*background: red; !important;*/

        }
    </style>
</head>
<body style="background-color: #EAEAEA">
<!-- 导航 -->
<%@ include file="head.jsp" %>

<div id="invitationTop"><a href="/#"><img src="/image/addInvitationTop.jpg" ></a></div>
<div style="width:1100px;margin: 10px auto;">
    <form action="/invitation/doAddInvitation" name="addInvitation" onsubmit="return checkInsert();" method="post">
        <div class="form-group">
            <label for="talk_miaoshu">文章标题：</label>
            <input type="text" class="form-control" id="talk_miaoshu" name="invitationTitle" placeholder="请输入文章标题......">
            <input type="hidden" name="userId" value="${loginUser.userId}">
        </div>
        <div class="form-group" style="align-content: center">
            <label for="editor_id">文章内容：</label>
            <textarea class="form-control" id="editor_id" name="invitationContent" cols="100" rows="17"
                      placeholder="请输入文章内容......"></textarea>
        </div>
        <div class="form-group">
            <label for="editor_id">选择添加类型:</label>
            <select name="invitationTypeName" id="" style="width: 70px; height: 30px">
                <option name="invitationTypeName" value="" >-请选择-</option>
            <c:forEach items="${invitationTypeList}" var="invitationType">
                <option name="invitationTypeName" >${invitationType.invitationTypeName}</option>
            </c:forEach>
        </select>
        </div>
        <div class="form-group">

            <label for="editor_id">若文章类型不存在，请输入:</label>
            <input class="form-control" type="text" name="invitationTypeName2" style="width: 300px" >

        </div>
        <div class="form-group" style="text-align: center">
            <input class="btn btn-success btn-lg" type="submit" value="提交信息"/>
        </div>
    </form>
    <%--<form action="/invitation/doAddInvitation" name="addInvitation" onsubmit="return checkInsert();">--%>
        <%--<input type="text" name="invitationTitle" placeholder="请输入文章标题" style="margin:10px 0;width: 500px;border: 1px solid lightgrey"/><br>--%>
        <%--<input type="hidden" name="userId" value="${loginUser.userId}">--%>
        <%--<textarea name="invitationContent" id="invitationContent" cols="140" rows="10" placeholder="请输入文章内容" style="margin:10px 0;width:1100px;border: 1px solid lightgrey"></textarea><br>--%>
        <%--文章类型：--%>
        <%--<select name="invitationTypeName" >--%>
        <%--<option value="">-- 请选择 --</option>--%>
        <%--<c:forEach items="${invitationTypeList}" var="invitationType">--%>
            <%--<option name="invitationTypeName" >${invitationType.invitationTypeName}</option>--%>
        <%--</c:forEach>--%>
        <%--</select >--%>
        <%--<br>--%>
        <%--若文章类型不存在，请输入：<input type="text" name="invitationTypeName2" style="border: 1px solid lightgrey" >--%>
        <%--<br>--%>
        <%--<input type="submit" id="addInvitation">--%>

    <%--</form>--%>
</div>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
<script src="/js/jquery.fullPage.min.js"></script>
<script src="/js/index_slick.js"></script>
<script src="/js/swiper.min.js"></script>
<script src="/js/index.js"></script>
<script src="/js/addInvitation.js"></script>
<script src="/js/filter.js"></script>
</body>
</html>
