<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/12
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人简历</title>
    <link rel="stylesheet" href="../../css/personalExperience.css">
    <link rel="stylesheet" href="../../css/headercss.css">
    <script type="text/javascript" src="../../js/personalExperience.js"></script>
    <style>
        body {
            background:orange;

        }
    </style>
</head>
<body>
<%--<%@ include file="head.jsp" %>--%>
<div class="header" style="background-color: transparent;">
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
                <%--<a href="">我的帖子</a>--%>
                <%--<a href="">我的评论</a>--%>
                <%--<a href="/user/finishedWork?id=${loginUser.userId}">已做题目</a>--%>
                <a href="/imageFile/selectImageFile?id=${loginUser.userId}">个人设置</a>
                <a href="/user/login">退出</a>
            </div>
        </li>

    </ul>
</div>
    <div class="framDiv">
        <div class="container" style="background: rgba(255,255,255,0.7)">
            <span class="headerspan" id="sp1" >填写个人基本信息</span>
            <form action="/user/doUpdateUserOfExp" method="post" class="exform1" onmouseover="disdiv()">
                <input type="hidden" name="userId" value="${userOfExp.userId}">
                <input type="text" name="userName2" placeholder="   请输入你的真实姓名" value="${userOfExp.userName2}"> <br>
                <c:if test="${userOfExp.userGender eq '男'}">
                    <label for="gendermale"><div>男</div></label>
                    <input type="radio" name="userGender" id="gendermale" value="男" style="left: -200px" checked = "checked">
                    <label for="genderfamale"><div>女</div></label>
                    <input type="radio" name="userGender" id="genderfamale" value="女" style="left: -35px"><br>
                </c:if>
                <c:if test="${userOfExp.userGender eq '女'}">
                    <label for="gendermale"><div>男</div></label>
                    <input type="radio" name="userGender" id="gendermale" value="男" style="left: -200px">
                    <label for="genderfamale"><div>女</div></label>
                    <input type="radio" name="userGender" id="genderfamale" value="女" style="left: -35px" checked = "checked"><br>
                </c:if>
                <input type="text" name="userAge" placeholder="   请选择出生年月" style="margin-top: 15px" value="${userOfExp.userAge}"> <br>
                <input type="text" name="userPhone" placeholder="   请填写电话号码" value="${userOfExp.userPhone}"> <br>
                <input type="text" name="userEmail" id="userEmail" value="${userOfExp.userEmail}" placeholder="   请填写你的联系邮箱" oninput="myonEmail()" onblur="document.getElementById('divforemail').style.visibility = 'hidden';"> <br>
                <a href="#sp2"><div>下一步</div></a>

                <div class="exform2">
                    <span class="headerspan" id="sp2">填写教育基本信息</span>
                    <input type="text" name="userSchool" placeholder="   请填写毕业院校" style="margin-top: 15px;margin-left: 26px" value="${userOfExp.userSchool}"> <br>
                    <textarea name="userExpStudy" id="userExpStudy" cols="70" rows="10" placeholder="   请输入你的学习经历">${userOfExp.userExpStudy}</textarea> <br>
                    <textarea name="userExp" id="userExp" cols="70" rows="10" placeholder="   请输入你的工作经历">${userOfExp.userExp}</textarea> <br>
                    <textarea name="userIntroduce" id="userIntroduce" cols="70" rows="10" placeholder="   请说说对自己的评价">${userOfExp.userIntroduce}</textarea> <br>
                    <a href="#sp1"><div>上一步</div></a> <input type="submit" value="提   交">
                </div>
            </form>
            <div class="divforemail" id="divforemail">
                <ul>
                    <li onmouseover="insertspan('@sina.com')"><span id="span3"></span><span class="span4">@sina.com</span></li>
                    <li onmouseover="insertspan2('@163.com')"><span id="span4"></span><span class="span4">@163.com</span></li>
                    <li onmouseover="insertspan2('@qq.com')"><span id="span5"></span><span class="span4">@qq.com</span></li>
                    <li onmouseover="insertspan2('@126.com')"><span id="span6"></span><span class="span4">@126.com</span></li>
                    <li onmouseover="insertspan2('@sina.cn')"><span id="span7"></span><span class="span4">@sina.cn</span></li>
                    <li onmouseover="insertspan2('@hotmail.com')"><span id="span8"></span><span class="span4">@hotmail.com</span></li>
                    <li onmouseover="insertspan2('@gmail.com')"><span id="span9"></span><span class="span4">@gmail.com</span></li>
                </ul>
            </div>
        </div>
    </div>
</body>
</html>
