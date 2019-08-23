<%@ page import="org.springframework.web.bind.annotation.SessionAttribute" %>
<%@ page import="com.fjut.oj.edu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/22
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试session</title>
</head>
<body>
<%User user;
    user = (User) request.getSession().getAttribute("user");
%>
<%=user.getNick()%>
</body>
</html>
