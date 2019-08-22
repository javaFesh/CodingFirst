<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>青年无忧网</title>
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css" />
    <link rel="stylesheet" href="/css/head.css" />
    <link rel="stylesheet" href="/css/index.css">
    <style type="text/css">
        body{
            background-color: ghostwhite;
            font-size: 15px;
            text-decoration: none;
        }

        #a1{
            /*color: black;*/
            /*text-decoration: none;*/
            /*border-radius: 5px;*/
            font-size: 10px;
        }

        /*#a1:hover{*/
            /*color: mediumseagreen;*/
        /*}*/

        button{
            background-color: ghostwhite;
            border-radius: 5px;
        }

        #button1:hover{
            color: mediumseagreen;
        }
        *, html, body {
            background-color: rgb(246, 246, 246);
        }
    </style>
</head>
<body id="body1">
<table border="1" class="table table-bordered table-hover ">
    <tr class="success">

        <th>职位名称</th>
        <th>公司名称</th>
        <th>岗位福利</th>
        <th>职位介绍</th>
        <th>岗位职责</th>
        <th>岗位要求</th>
        <%--<th>工作城市</th>--%>
        <%--<th>工作类型</th>--%>
        <%--<th>工作薪资</th>--%>
        <%--<th>工作经验</th>--%>
        <%--<th>学历要求</th>--%>
        <%--<th>工作性质</th>--%>
        <th>工作地点</th>
        <th>创建时间</th>
        <th>审核状态</th>
        <th>操作</th>

    </tr>

    <tbody>
    <c:forEach items="${pageBean.pageData}" var="item">
        <tr>
            <td>${item.workName}</td>
            <td>${item.companyName}</td>
            <td>${item.workWelfare}</td>
            <td>${item.workDetails}</td>
            <td>${item.workDuty}</td>
            <td>${item.workAsk}</td>
                <%--<td>${item.workCity}</td>--%>
                <%--<td>${item.workTypeName}</td>--%>
                <%--<td>${item.workSalaryName}</td>--%>
                <%--<td>${item.experienceName}</td>--%>
                <%--<td>${item.degreeName}</td>--%>
                <%--<td>${item.workNatureName}</td>--%>
            <td>${item.workplace}</td>
            <td>${item.createTime}</td>
            <td>${item.workState}</td>

            <td><a id="a1" href="/job/updateById?id=${item.id}&currentPage=1 " class="btn btn-success" >审核</a>&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn btn-success" id="a1" href="/job/deleteById?id=${item.id}&currentPage=1">删除</></td>
        </tr>

    </c:forEach>
    <tr>
        <td colspan="9" align="center">
            当前${pageBean.getCurrentPage()}/${pageBean.getTotalPage()}页&nbsp;&nbsp;&nbsp;&nbsp;
            <a class="btn btn-success btn-sm" id="a1" href="/job/select?currentPage=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a class="btn btn-success btn-sm" id="a1" href="/job/select?currentPage=${pageBean.getCurrentPage()-1}">上一页 </a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a class="btn btn-success btn-sm" id="a1" href="/job/select?currentPage=${pageBean.getCurrentPage()+1}">下一页 </a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a class="btn btn-success btn-sm" id="a1" href="/job/select?currentPage=${pageBean.getTotalPage()}">末页</a>
        </td>
    </tr>
    </tbody>

</table>

    <script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
    <script src="/js/jquery.fullPage.min.js"></script>
    <script src="/js/index_slick.js"></script>
    <script src="/js/swiper.min.js"></script>
    <script src="/js/index.js"></script>
</body>
</html>
