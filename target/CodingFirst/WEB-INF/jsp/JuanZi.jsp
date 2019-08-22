<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/7/13
  Time: 7:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考试卷</title>
    <style>

        body {
            /*background: url("/image/timg.gif") 100% 100%;*/
            background: url("/image/xingkong4.jpg") 100% 100% ;
            background-position: center center;
            background-size: cover;
        }

        a {
            font-size: 40px;
        }

    </style>
    <link type="text/css" rel="stylesheet" href="/css/tiku.css"/>
</head>
<body>
<%@ include file="head.jsp" %>

<div class="context" style="margin-top: 160px">
    <div class="context-tiku" style="margin-top: 200px">
        <c:forEach items="${sessionScope.fatherType}" var="b" varStatus="s">

            <div class="context-pis">
                <p><a href="${pageContext.request.contextPath}/writing/findWritingOne?id=${b.id}">${b.type}</a></p>
            </div>
        </c:forEach>

    </div>
</div>
</body>
</html>
