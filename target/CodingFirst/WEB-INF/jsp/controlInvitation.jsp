<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ly128
  Date: 2019/7/14
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>话题管理</title>
    <link rel="stylesheet" href="/css/controlInvitation.css">
    <link href="${pageContext.request.contextPath}//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <%--<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->--%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <style>
        td, th {
            text-align: center;
        }

        #form tr:hover {
            background-color: #f5f5f5;
        }

        *, html, body {
            background-color: rgb(246, 246, 246);
        }

    </style>
    <%--接口"/invitation/controlInvitation",更新InvitationController,添加controlInvitation.css--%>
</head>
<body>


        <table border="1" class="table table-bordered table-hover " id="invitationTable">
            <tr class="success">

                <th>序号</th>
                <th>标题</th>
                <th>作者</th>
                <th>创建时间</th>
                <th>类型</th>
                <th>评论</th>
                <th>赞</th>
                <th>浏览量</th>
                <th>操作</th>
            </tr>
            <tbody>
            <c:forEach items="${invitationList}" var="invitation" varStatus="s">
                <tr>
                    <td >${invitation.invitationId}</td>
                    <td >${invitation.invitationTitle}</td>
                    <td >${invitation.user.userName}</td>
                    <td >${invitation.invitationCreateTime}</td>
                    <td >${invitation.invitationType.invitationTypeName}</td>
                    <td >${invitation.invitationCommentNumber}</td>
                    <td >${invitation.invitationAgreeNumber}</td>
                    <td >${invitation.invitationPageView}</td>
                    <td >
                        <a  class="btn btn-success btn-sm" href="/invitation/controlInvitationShow?id= ${invitation.invitationId}">查看</a>
                       <p></p>
                        <a class="btn btn-success btn-sm" href="/invitation/controlInvitationDelete?id=${invitation.invitationId}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
    <%--<table id="invitationTable" >--%>
        <%--<tr>--%>
            <%--<th>序号</th>--%>
            <%--<th>标题</th>--%>
            <%--<th>作者</th>--%>
            <%--<th>创建时间</th>--%>
            <%--<th>类型</th>--%>
            <%--<th>评论</th>--%>
            <%--<th>赞</th>--%>
            <%--<th>浏览量</th>--%>
            <%--<th>操作</th>--%>
        <%--</tr>--%>
        <%--<c:forEach items="${invitationList}" var="invitation">--%>
            <%--<tr>--%>
                <%--<td style="width: 5%">${invitation.invitationId}</td>--%>
                <%--<td style="width: 20%">${invitation.invitationTitle}</td>--%>
                <%--<td style="width: 10%">${invitation.user.userName}</td>--%>
                <%--<td style="width: 20%">${invitation.invitationCreateTime}</td>--%>
                <%--<td style="width: 10%">${invitation.invitationType.invitationTypeName}</td>--%>
                <%--<td style="width: 5%">${invitation.invitationCommentNumber}</td>--%>
                <%--<td style="width: 5%">${invitation.invitationAgreeNumber}</td>--%>
                <%--<td style="width: 15%">${invitation.invitationPageView}</td>--%>
                <%--<td style="width: 20%">--%>
                    <%--<a href="/invitation/controlInvitationShow?id= ${invitation.invitationId}">查看</a>--%>
                    <%--<a href="/invitation/controlInvitationDelete?id=${invitation.invitationId}">删除</a>--%>
                <%--</td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
        <%--<tr>--%>
            <%--<td colspan="9" align="center" >--%>
                <%--当前${pageBean.currentPage}/${pageBean.totalPage}页&nbsp;&nbsp;--%>
                <%--<a href="/invitation/controlInvitation?page=1">首页</a>&nbsp;--%>
                <%--<a href="/invitation/controlInvitation?page=${pageBean.currentPage-1}">上一页</a>&nbsp;--%>
                <%--<a href="/invitation/controlInvitation?page=${pageBean.currentPage+1}">下一页</a>&nbsp;--%>
                <%--<a href="/invitation/controlInvitation?page=${pageBean.totalPage}">末页</a>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</table>--%>


<div style="margin: 0 auto; width: 350px">
    当前${pageBean.currentPage}/${pageBean.totalPage}页&nbsp;&nbsp;
    <a class="btn btn-success" href="/invitation/controlInvitation?page=1">首页</a>&nbsp;
    <a  class="btn btn-success" href="/invitation/controlInvitation?page=${pageBean.currentPage-1}">上一页</a>&nbsp;
    <a   class="btn btn-success"href="/invitation/controlInvitation?page=${pageBean.currentPage+1}">下一页</a>&nbsp;
    <a   class="btn btn-success"href="/invitation/controlInvitation?page=${pageBean.totalPage}">末页</a>
</div>
</body>
</html>
