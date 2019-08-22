<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/15
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员审核公司营业执照</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /*body {*/
            /*!*background: url("../../image/3391925a2ea32ddeec4ab66065a074d5.gif") 100% 100% no-repeat;*!*/
            /*background-size: cover;*/
            /*!*color: white;*!*/
            /*opacity: 0.5;*/
        /*}*/
        /*td{*/
            /*padding-left: 60px;*/
        /*}*/
        body,html {
            background-color:#EEE9E9;
        }
        td, th {
            text-align: center;
        }
    </style>
    <%--style="width: 90%;height: 80%;background-color: white;margin-left: 50px--%>
</head>
<body>
    <div ">
        <%--<table border="1" style="width: 89%;height: auto;color: black">--%>
            <%--<thead>--%>
                <%--<th>公司名</th>--%>
                <%--<th>公司地址</th>--%>
                <%--<th>公司电话</th>--%>
                <%--<th>营业执照</th>--%>
                <%--<th>审核</th>--%>
            <%--</thead>--%>
            <%--<tbody>--%>
            <%--<c:forEach items="${pageBean.pageData}" var="item">--%>
                <%--<tr>--%>
                    <%--<td>${item.companyName}</td>--%>
                    <%--<td>${item.companyAddress}</td>--%>
                    <%--<td>${item.companyPhone}</td>--%>

                    <%--<td>${item.companyIdentify}</td>--%>
                    <%--<td><img src="/userPicture/${item.companyIdentify}" style="width: 100px;height: 50px;" alt=""></td>--%>
                    <%--<td><a href="/company/updateCompanyState?companyId=${item.companyId}">同意</a></td>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>
            <%--<tr>--%>
                <%--<td colspan="4" align="center" style="position: fixed;top: 450px;left: 500px;">--%>
                    <%--查到 <font color="blue">${pageBean.totalCount}</font>&nbsp;条记录&nbsp;&nbsp;当前${pageBean.getCurrentPage()}/共${pageBean.getTotalPage()}页 &nbsp;&nbsp;--%>
                    <%--<a href="/company/checkCompany?currentPage=1">首页</a>--%>
                    <%--<a href="/company/checkCompany?currentPage=${pageBean.getCurrentPage()-1}">上一页 </a>--%>
                    <%--<a href="/company/checkCompany?currentPage=${pageBean.getCurrentPage()+1}">下一页 </a>--%>
                    <%--<a href="/company/checkCompany?currentPage=${pageBean.getTotalPage()}">末页</a>--%>
                <%--</td>--%>
            <%--</tr>--%>
            <%--</tbody>--%>
        <%--</table>--%>
        <table border="1" class="table table-bordered table-hover " style="margin-top: 50px">
            <tr class="success">

                <th>公司名</th>
                <th>公司地址</th>
                <th>公司电话</th>
                <th>营业执照</th>
                <th>审核</th>
            </tr>
            <tbody>
            <c:forEach items="${pageBean.pageData}" var="item">
                <tr>
                    <td>${item.companyName}</td>
                    <td>${item.companyAddress}</td>
                    <td>${item.companyPhone}</td>
                    <%--<td>${item.companyIdentify}</td>--%>
                    <td><img src="/userPicture/${item.companyIdentify}" style="width: 100px;height: 50px;" alt=""></td>
                    <td><a class="btn btn-success btn-sm" href="/company/updateCompanyState?companyId=${item.companyId}">同意</a></td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="4" align="center" style="position: fixed;top: 450px;left: 500px;">
                    查到 <font >${pageBean.totalCount}</font>&nbsp;条记录&nbsp;&nbsp;当前${pageBean.getCurrentPage()}/共${pageBean.getTotalPage()}页 &nbsp;&nbsp;
                    <a  class="btn btn-success btn-sm" href="/company/checkCompany?currentPage=1">首页</a>
                    <a class="btn btn-success btn-sm" href="/company/checkCompany?currentPage=${pageBean.getCurrentPage()-1}">上一页 </a>
                    <a class="btn btn-success btn-sm" href="/company/checkCompany?currentPage=${pageBean.getCurrentPage()+1}">下一页 </a>
                    <a class="btn btn-success btn-sm" href="/company/checkCompany?currentPage=${pageBean.getTotalPage()}">末页</a>

                </td>
                </tr>
            </tbody>


<%--<h4 style="align-content: center">--%>
    <%--查到 <font >${pageBean.totalCount}</font>&nbsp;条记录&nbsp;&nbsp;当前${pageBean.getCurrentPage()}/共${pageBean.getTotalPage()}页 &nbsp;&nbsp;--%>
    <%--<a href="/company/checkCompany?currentPage=1">首页</a>--%>
    <%--<a href="/company/checkCompany?currentPage=${pageBean.getCurrentPage()-1}">上一页 </a>--%>
    <%--<a href="/company/checkCompany?currentPage=${pageBean.getCurrentPage()+1}">下一页 </a>--%>
    <%--<a href="/company/checkCompany?currentPage=${pageBean.getTotalPage()}">末页</a>--%>
<%--</h4>--%>
        </table>

</body>
</html>
