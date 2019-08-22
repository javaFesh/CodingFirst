<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ly128
  Date: 2019/7/14
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理留言</title>
    <%--更新CommentController等与comment有关的一切--%>
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
        </head>
<body>
<div style="margin: 20px auto;width: 1100px" >

    <table border="1" class="table table-bordered table-hover ">
        <tr  class="success">
            <td style="font-size: larger">
                ${invitation.invitationTitle}
            </td>
        </tr>

        <tr>
            <td style="font-size: x-small;color: #666666">
                ${invitation.user.userName}&nbsp;&nbsp;
                ${invitation.invitationCreateTime}&nbsp;&nbsp;
                发表在[${invitation.invitationType.invitationTypeName}]
                评论${invitation.invitationCommentNumber}&nbsp;|&nbsp;
                赞${invitation.invitationAgreeNumber}&nbsp;|&nbsp;
                浏览量${invitation.invitationPageView}
            </td>
        </tr>
        <tr>
            <td style="font-size: smaller">
                ${invitation.invitationContent}
            </td>
        </tr>
    </table>
    <table border="1" class="table table-bordered table-hover " id="invitationTable">
        <tr class="success">

            <th>留言内容</th>
            <th>作者</th>
            <th>留言时间</th>
            <th>操作</th>
        </tr>
        <tbody>
        <c:forEach items="${commentList}" var="comment">
            <tr style="color: #666666">
                <td>${comment.commentContent}</td>
                <td>${comment.user.userName}</td>
                <td>${comment.commentCreateTime}</td>
                <td>
                    <a class="btn btn-success btn-sm" href="/comment/deleteComment?commentId=${comment.commentId}&invitationId=${invitation.invitationId}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
    <%--<table style="width: 80%;text-align: center;font-size: smaller">--%>

        <%--<tr>--%>
            <%--<th>留言内容</th>--%>
            <%--<th>作者</th>--%>
            <%--<th>留言时间</th>--%>
            <%--<th>操作</th>--%>
        <%--</tr>--%>
        <%--<c:forEach items="${commentList}" var="comment">--%>
            <%--<tr style="color: #666666">--%>
                <%--<td>${comment.commentContent}</td>--%>
                <%--<td>${comment.user.userName}</td>--%>
                <%--<td>${comment.commentCreateTime}</td>--%>
                <%--<td>--%>
                    <%--<a href="/comment/deleteComment?commentId=${comment.commentId}&invitationId=${invitation.invitationId}">删除</a>--%>
                <%--</td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>

</div>
</body>
</html>
