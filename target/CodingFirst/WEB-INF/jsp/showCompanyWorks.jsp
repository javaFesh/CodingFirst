<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/15
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>已发布的职位</title>
    <link rel="stylesheet" href="../../css/personalSet.css">
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" />
    <style>

        body {
            /*!*background: #EAEAEA;!important;*/
            font-family: "Avant Garde", "Tahoma", "Microsoft YaHei", "SimHei" !important;
            /*color: #999999 !important;*/
            color: white !important;
            /*font-weight: bold !important;*/
            font-size:  16px !important;
            background: url("/image/timg.gif") 100% 100% no-repeat;
            background-size: cover;

        }
        td, th {
            text-align: center;
            color: white !important;
        }
    </style>
</head>
<body>
<div class="header" style="background-color: transparent;">
    <img src="../../image/logo.gif" alt="">
    <ul class="navbar_nav">
        <li class="active" style="margin-left: 180px">
            <a href="/company/shouye">首页</a>
        </li>

        <li class="dropdown">
            <a href="#">职位</a>
            <div class="dropdown_menu">
                <%--<a href="#">找工作</a>--%>
                <a href="/job/insert">发布职位</a>
                <%--<a href="/job/main?currentPage=1">职位平台</a>--%>
            </div>
        </li>
        <c:if test="${sessionScope.loginCompany!=null}">
            <li class="dropdown" id="li1">

                <a href="javascript:void(0)">
                    <div style="margin-top: 3px;width: 46px;height: 47px;border-radius: 25px">
                        <c:if test="${loginCompany.companyPicture != null}">
                            <img src="${loginCompany.companyPicture}" alt="" style="margin-top: -10px;width: 44px;height: 45px;border-radius: 25px">
                        </c:if>
                        <c:if test="${loginCompany.companyPicture == null}">
                            <img src="/image/sctp.png" alt="" style="margin-top: -10px;width: 44px;height: 45px;border-radius: 25px">
                        </c:if>
                    </div></a>
                <div class="dropdown_menu">
                    <a href="/company/hadUpWorkForMyCompany?id=${loginCompany.companyId}">已发布的职位</a>
                    <a href="/company/hadGetResumeFromUser?id=${loginCompany.companyId}">已收到的简历</a>
                    <a href="/imageFile/selectImageOfCompany?id=${loginCompany.companyId}">个人设置</a>
                </div>
            </li>
            <li>
                <a href="/user/login">退出登录</a>
            </li>
        </c:if>
        <c:if test="${sessionScope.loginCompany==null}">
            <li>
                <a href="${pageContext.request.contextPath}/user/login">登录</a>
            </li>

            <li>
                <a href="/user/register">注册</a>
            </li>
        </c:if>

    </ul>
</div>
<table border="1" class="table table-bordered table-hover " style="margin-top: 50px">
    <tr class="success">
        <%--<span class="sp11">职位名称</span>--%>
        <%--<span class="sp11">职位类别</span>--%>
        <%--<span class="sp11">创建时间</span>--%>
        <%--<span class="sp11">审核状态</span> <br>--%>
        <th>职位名称</th>
        <th>职位类别</th>
        <th>创建时间</th>
        <th>审核状态</th>
    </tr>
    <tbody>
    <c:forEach items="${pageBean.pageData}" var="list" varStatus="s">
        <tr>

            <td> <span>${list.workName}</span></td>

            <td> ${list.workType}</td>

            <td><span >${list.createTime}</span></td>
            <td>
                <span >${list.workState}</span>

            </td>
        </tr>

    </c:forEach>
    </tbody>

</table>

<h4 align="center">查到 <font>${pageBean.totalCount}</font>&nbsp;条记录&nbsp;&nbsp;当前${pageBean.getCurrentPage()}/共${pageBean.getTotalPage()}页 &nbsp;&nbsp;
    <a class="btn btn-success btn-sm" href="/company/hadUpWorkForMyCompany?currentPage=1&id=${loginCompany.companyId}">首页</a>
    <a class="btn btn-success btn-sm"href="/company/hadUpWorkForMyCompany?currentPage=${pageBean.getCurrentPage()-1}&id=${loginCompany.companyId}">上一页 </a>
    <a class="btn btn-success btn-sm" href="/company/hadUpWorkForMyCompany?currentPage=${pageBean.getCurrentPage()+1}&id=${loginCompany.companyId}">下一页 </a>
    <a class="btn btn-success btn-sm" href="/company/hadUpWorkForMyCompany?currentPage=${pageBean.getTotalPage()}&id=${loginCompany.companyId}">末页</a>
</h4>
</body>
</html>
