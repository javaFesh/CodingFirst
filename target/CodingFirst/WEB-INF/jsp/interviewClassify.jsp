<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 3. 导入bootstrap的js文件 -->
    <link rel="stylesheet" href="/css/reset.css">
    <link href="${pageContext.request.contextPath}//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/web.css"/>
    <link rel="stylesheet" type="/text/css" href="css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css"/>
    <link rel="stylesheet" href="/css/head.css"/>
    <link rel="stylesheet" href="/css/index.css">
    <link type="text/css" rel="stylesheet" href="/css/tiku.css" />
    <title>青年无忧-分类</title>

    <style>

        body {
            /*background: url("/image/timg.gif") 100% 100%;*/
            background: url("/image/listxing.jpeg") 100% 100% ;
            background-position: center center;
            background-size: cover;

        }

        a {
            font-size: 40px;
        }

    </style>
</head>
<body>
<%@ include file="head.jsp" %>
<%--<div class="context">--%>
    <%--<c:forEach items="${sessionScope.fatherType}" var="b" varStatus="s">--%>

        <%--<div class="context-pis" style="margin-top: 60px">--%>
            <%--<p> <a style="color: white" href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${b.id}&currentPage=1">--%>
                    <%--${b.type}--%>
            <%--</a></p>--%>
        <%--</div>--%>
    <%--</c:forEach>--%>
<%--</div>--%>
<div class="context" style="margin-top: 160px">
    <div class="context-tiku" style="margin-top: 200px">
        <c:forEach items="${list}" var="item" varStatus="s">

            <div class="context-pis">

                <p><a href="/user/getInterviewForUser?typeId=${item.typeId}">${item.typeName}</a></p>
            </div>
        </c:forEach>

    </div>
</div>
<%--<p style="clear: both"></p>--%>
<%--<hr style="width: 100%; height: 1px; color: white">--%>
<%--<div class="jiaozhu">--%>
    <%--<p> 版权所有 Copyright © 2019 GS GeShuai 葛帅帅 </p>--%>
<%--</div>--%>
</body>
</html>
