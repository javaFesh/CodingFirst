<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/11
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人设置</title>
    <link rel="stylesheet" href="../../css/personalSet.css">
    <script type="text/javascript" src="../../js/personalSet.js"></script>
    <style>
        body {
            background: url("/image/4.jpg") 100% 80% no-repeat;
            background-size: cover;
            color: white !important;
        }
        .back{
            border-radius: 6px; border: 1px solid rgba(255,255,255,0.5);
            background: transparent !important;
            color: white !important;
        }
    </style>
</head>
<body>
<%--<%@ include file="head1.jsp" %>--%>
<div class="header" style="background: transparent !important;">
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
                <a href="/user/login">注册</a>
            </li>
        </c:if>

    </ul>
</div>
    <ul class="ul1"  style="opacity: 0.5" style="border-radius: 6px; border: 2px solid rgba(255,255,255,0.5);background: rgba(255,255,255,0.3)">
        <li>
            <a href="#" id="a1" onclick="document.getElementById('a1').style.color = '#1eb37b';
                                        document.getElementById('a2').style.color = '#494949';
                                        document.getElementById('sp1').style.top = '-55px';
                                        document.getElementById('right2').style.visibility = 'hidden';
                                        document.getElementById('right1').style.visibility = 'visible';">
                个人信息
            </a>
        </li>
        <span id="sp1">|</span>
        <li style="margin-top: -48px"><a href="#" id="a2" onclick="document.getElementById('a2').style.color = '#1eb37b';
                                        document.getElementById('a1').style.color = '#494949';
                                        document.getElementById('sp1').style.top = '-10px';
                                        document.getElementById('right1').style.visibility = 'hidden';
                                        document.getElementById('right2').style.visibility = 'visible';">
                密码设置
            </a>
        </li>
    </ul>

    <div class="right" id="right1" style="color: white; border-radius: 6px; border: 2px solid rgba(255,255,255,0.5);background: rgba(255,255,255,0.3)">
        <div class="userInform">你好：${loginCompany.companyName}</div>
        <div class="image" >
            <c:if test="${loginCompany.companyPicture != null}">
                <img src="${loginCompany.companyPicture}" alt="" style="width: 50px;height: 50px;border-radius: 25px">
            </c:if>
            <c:if test="${loginCompany.companyPicture == null}">
                <%--<img src="/image/sctp.png" alt="" style="width: 50px;height: 50px;border-radius: 25px;">--%>
            </c:if>
        </div>
        <form id="form1" action="/imageFile/uploadFileOfCompany?id=${loginCompany.companyId}" method="post" enctype="multipart/form-data">
            <label for="imageFile">更换头像</label><input type="file" name="myFile" id="imageFile"> <br>
            <input type="submit" value="更改">
        </form>
    </div>

    <div class="right" id="right2" style="visibility: hidden;border-radius: 6px; border: 2px solid rgba(255,255,255,0.5);background: rgba(255,255,255,0.3)">
        <span>修改密码</span>
        <form action="/company/updateCompanyPassword?id=${loginCompany.companyId}" method="post" onsubmit="return setPassword()" class="passwordForm">
            <label class="back" for="p1">旧密码</label>&nbsp;&nbsp;<input class="back" type="password" id="p1" name="companyPassword" placeholder="   请输入旧密码"> <br>
            <label class="back" for="p2">新密码</label>&nbsp;&nbsp;<input class="back" type="password" id="p2" name="password1" placeholder="   请输入新密码"> <br>
            <label class="back" for="p3">新密码</label>&nbsp;&nbsp;<input class="back" type="password" id="p3" name="password2" placeholder="   请再次输入密码"> <br>
            <input style="margin-left: -34px" class="btn btn-success" type="submit" value="确定">
            <%--<img src="../../image/yj.gif" onmousedown="trand('p1')" onmouseup="tranu('p1')" style="top: 13%">--%>
            <%--<img src="../../image/yj.gif" onmousedown="trand('p2')" onmouseup="tranu('p2')" style="top: 28%">--%>
            <%--<img src="../../image/yj.gif" onmousedown="trand('p3')" onmouseup="tranu('p3')" style="top: 43%">--%>
        </form>
    </div>
</body>
</html>
