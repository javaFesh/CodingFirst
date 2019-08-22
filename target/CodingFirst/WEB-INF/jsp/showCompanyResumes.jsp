<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/15
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>本公司收到的简历</title>
    <%--<link rel="stylesheet" href="../../css/headercss.css">--%>
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
<body style="background-color: lightgrey">
<div class="header" style="background-color: transparent;">
    <img src="../../image/logo.gif" alt="">
    <ul class="navbar_nav">
        <li class="active" style="margin-left: 180px">
            <a href="/company/shouye">首页</a>
        </li>

        <li class="dropdown">
            <a href="/job/main?currentPage=1">职位</a>
            <div class="dropdown_menu">
                <%--<a href="#">找工作</a>--%>
                <a href="/job/insert">发布职位</a>

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

            <th>应聘生姓名</th>
            <%--<th>性别</th>--%>
            <th>毕业学校</th>
            <th>工作经历</th>
            <th>投递本公司</th>
            <th>操作</th>
    </tr>
    <tbody>
    <c:forEach items="${pageBean.pageData}" var="list">
        <tr>
            <td style="width: 10%">${list.userName2}</td>
            <%--<td style="width: 5%">${list.userGender}</td>--%>
            <td style="width: 15%">${list.userSchool}</td>
                <%--<td>${list.}</td>--%>
            <td style="width: 28%"><div style="width: 50px">${list.userExp}</div></td>
            <td style="width: 15%">${list.workName}</td>
            <td style="width: 25%">
                <a  class="btn btn-success btn-sm" href="/company/seeResume?id=${list.userId}&resumeId=${list.workId}" onclick="show()">查看</a>
                <%--&nbsp;<a class="btn btn-success btn-sm"href="/company/setResumeToDaiGouTong?id=${loginCompany.companyId}&resumeId=${list.workId}">待沟通</a>--%>
                &nbsp;<a class="btn btn-success btn-sm"href="/company/setResumeToDaiGouTong?id=${loginCompany.companyId}&userId=${list.userId}">下载简历</a>
                &nbsp;<a class="btn btn-success btn-sm" href="/company/setResumeToMianShi?id=${loginCompany.companyId}&resumeId=${list.workId}">通知面试</a>
                &nbsp;<a class="btn btn-success btn-sm" href="/company/setResumeToGiveUp?id=${loginCompany.companyId}&resumeId=${list.workId}">放弃他/她</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>
<%--<table style="z-index: 0;opacity: 0.5;margin: 110px auto;background-color: white;width: 80%;height: auto">--%>
    <%--<thead style="background-color: limegreen">--%>
    <%--<th>应聘生姓名</th>--%>
    <%--<th>性别</th>--%>
    <%--<th>毕业学校</th>--%>
    <%--&lt;%&ndash;<th>学历</th>&ndash;%&gt;--%>
    <%--<th>工作经历</th>--%>
    <%--<th>投递本公司</th>--%>
    <%--<th>操作</th>--%>
    <%--</thead>--%>
    <%--<tbody>--%>
    <%--<c:forEach items="${pageBean.pageData}" var="list">--%>
        <%--<tr>--%>
            <%--<td style="width: 10%">${list.userName2}</td>--%>
            <%--<td style="width: 5%">${list.userGender}</td>--%>
            <%--<td style="width: 15%">${list.userSchool}</td>--%>
                <%--&lt;%&ndash;<td>${list.}</td>&ndash;%&gt;--%>
            <%--<td style="width: 28%"><div style="width: 50px">${list.userExp}</div></td>--%>
            <%--<td style="width: 15%">${list.workName}</td>--%>
            <%--<td style="width: 25%">--%>
                <%--<a href="/company/seeResume?id=${list.userId}&resumeId=${list.workId}" onclick="show()">查看</a>--%>
                <%--&nbsp;<a href="/company/setResumeToDaiGouTong?id=${loginCompany.companyId}&resumeId=${list.workId}">待沟通</a>--%>
                <%--&nbsp;<a href="/company/setResumeToMianShi?id=${loginCompany.companyId}&resumeId=${list.workId}">通知面试</a>--%>
                <%--&nbsp;<a href="/company/setResumeToGiveUp?id=${loginCompany.companyId}&resumeId=${list.workId}">放弃他/她</a>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
<h4 align="center">
    查到 <font ">${pageBean.totalCount}</font>&nbsp;条记录&nbsp;&nbsp;当前${pageBean.getCurrentPage()}/共${pageBean.getTotalPage()}页 &nbsp;&nbsp;
    <a  class="btn-success btn btn-sm" href="/company/hadGetResumeFromUser?currentPage=1&id=${loginCompany.companyId}">首页</a>
    <a  class="btn-success btn btn-sm" href="/company/hadGetResumeFromUser?currentPage=${pageBean.getCurrentPage()-1}&id=${loginCompany.companyId}">上一页 </a>
    <a class="btn-success btn btn-sm" href="/company/hadGetResumeFromUser?currentPage=${pageBean.getCurrentPage()+1}&id=${loginCompany.companyId}">下一页 </a>
    <a class="btn-success btn btn-sm" href="/company/hadGetResumeFromUser?currentPage=${pageBean.getTotalPage()}&id=${loginCompany.companyId}">末页</a>
</h4>




</body>
</html>
