<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/7/12
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>青年无忧-分类</title>
    <link type="text/css" rel="stylesheet" href="/css/tiku.css"/>
    <style>
       body,html {
            background-color:#C7C7C7;
        }
    </style>
</head>
<body>
<div class="context-tiku" style="margin-top: 200px">
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/houtai/selectAllType?father_type=编程语言">编程语言</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/houtai/selectAllType?father_type=算法设计">算法设计</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/houtai/selectAllType?father_type=数据结构">数据结构</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/houtai/selectAllType?father_type=数学和逻辑">数学和逻辑</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/houtai/selectAllType?father_type=计算机基础">计算机基础</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/houtai/selectAllType?father_type=软件开发">软件开发</a></p>
    </div>
</div>
</body>
</html>
