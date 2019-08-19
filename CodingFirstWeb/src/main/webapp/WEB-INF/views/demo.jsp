<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/15
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Demo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script src="<%=basePath%>/static/js/jquery.js"></script>
    <script type="text/javascript">
        function mytest(op){
            $.getJSON("demoajax",{key:op},function(data){
                alert(data.name);
            });
        }
    </script>

</head>

<body>

<div id="demos">
    <b>样例列表:</b><br>
    <c:forEach items="${demos}" var="demo">
        ------------------------------------
        <br>
        <b>样例ID：</b><span id="account">${demo.id}</span><br>
        <b>样例名称：</b><span id="content">${demo.name}</span><br>
        <b>发表时间：</b>
        <br>
    </c:forEach>
</div>


<input type="button" onclick="mytest('asdasd')" value="获取AJAX">
</body>
</html>
