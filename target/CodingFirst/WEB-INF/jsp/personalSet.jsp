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

<%--<%@ include file="head.jsp" %>--%>
<div class="header" style=" background: transparent !important;">
    <img src="../../image/logo.gif" alt="">
    <ul class="navbar_nav">
        <li class="active">
            <a href="/type/to">首页</a>
        </li>
        <li class="dropdown">
            <a href="javascript:void(0)">
                笔试
            </a>
            <div class="dropdown_menu">
                <a href="${pageContext.request.contextPath}/type/totiku">题库</a>
                <a href="${pageContext.request.contextPath}/dajuan/to">模拟答卷</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="javascript:void(0)">面试</a>
            <div class="dropdown_menu">
                <%--<a href="/user/getInterviewForUser?typeId=1">面试真题</a>--%>
                <a href="/user/getInterviewForUserClassify">面试真题</a>
                <a href="/faceSkill/showAllInterviewSkillForUser">面试技巧</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="/job/main?currentPage=1">找工作</a>
            <div class="dropdown_menu">
                <%--<a href="#">找工作</a>--%>
                <%--<a href="#">发布职位</a>--%>

            </div>
        </li>
        <li>
            <a href="/invitation/selectAll">讨论区</a>
        </li>
        <li class="dropdown">

            <a href="javascript:void(0)"><div style="margin-top: -10px;width: 46px;height: 47px;border-radius: 25px">
                <c:if test="${loginUser.userPicture != null}">
                    <img src="${loginUser.userPicture}" alt="" style="width: 44px;height: 45px;border-radius: 25px">
                </c:if>
                <c:if test="${loginUser.userPicture == null}">
                    <img src="/image/sctp.png" alt="" style="width: 44px;height: 45px;border-radius: 25px">
                </c:if>
            </div></a>
            <div class="dropdown_menu">
                <a href="/user/personalExperience?id=${loginUser.userId}">个人简历</a>
                <a href="/user/hitExperience?id=${loginUser.userId}">已投企业</a>
                <%--<a href="/user/getAllmyTiezi?id=${loginUser.userId}">我的帖子</a>--%>
                <%--<a href="/user/getAllmyComment?id=${loginUser.userId}">我的评论</a>--%>
                <%--<a href="/user/finishedWork?id=${loginUser.userId}">已做题目</a>--%>
                <a href="/imageFile/selectImageFile?id=${loginUser.userId}">个人设置</a>
                <a href="/user/login">退出</a>
            </div>
        </li>

    </ul>
</div>
    <ul class="ul1" style="opacity: 0.5" style="border-radius: 6px; border: 2px solid rgba(255,255,255,0.5);background: rgba(255,255,255,0.3)">
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
        <div class="userInform">你好：${loginUser.userName}</div>
        <div class="image" >
            <c:if test="${loginUser.userPicture!= null}">
                <img src="${loginUser.userPicture}" alt="" style="width: 50px;height: 50px;border-radius: 25px">
            </c:if>
            <c:if test="${loginUser.userPicture == null}">
                <img src="/image/sctp.png" alt="" style="width: 50px;height: 50px;border-radius: 25px">
            </c:if>
        </div>
        <form id="form1" action="/imageFile/uploadFile?id=${loginUser.userId}" method="post" enctype="multipart/form-data">
            <label for="imageFile">更换头像</label><input type="file" name="myFile" id="imageFile"> <br>
            <input type="submit" value="更改">
        </form>
    </div>

    <div class="right" id="right2" style="visibility: hidden;border-radius: 6px; border: 2px solid rgba(255,255,255,0.5);background: rgba(255,255,255,0.3)">

           <span>修改密码</span>
           <form style="margin-left: 50px" action="/user/updatePassword?id=${loginUser.userId}" method="post" onsubmit="return setPassword()" class="passwordForm" style="opacity: 0.5">
               <label class="back"for="p1">旧密码</label>&nbsp;&nbsp;<input  class="back" type="password" id="p1" name="userPassword" placeholder="   请输入旧密码"> <br>
               <label class="back"for="p2">新密码</label>&nbsp;&nbsp;<input class="back"type="password" id="p2" name="password1" placeholder="   请输入新密码"> <br>
               <label class="back"for="p3">新密码</label>&nbsp;&nbsp;<input class="back"type="password" id="p3" name="password2" placeholder="   请再次输入密码"> <br>
               <input style="margin-left: -34px" class="btn btn-success" type="submit" value="确定">
               <%--<img src="../../image/yj.gif" onmousedown="trand('p1')" onmouseup="tranu('p1')" style="top: 13%;margin-left: 50px">--%>
               <%--<img src="../../image/yj.gif" onmousedown="trand('p2')" onmouseup="tranu('p2')" style="top: 28%;margin-left: 50px">--%>
               <%--<img src="../../image/yj.gif" onmousedown="trand('p3')" onmouseup="tranu('p3')" style="top: 43%;margin-left: 50px">--%>
           </form>

    </div>
</body>
</html>
