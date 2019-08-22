<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/15
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>应聘生简历</title>
    <link rel="stylesheet" href="../../css/personalExperience.css">
    <link rel="stylesheet" href="../../css/headercss.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body{
            color: white !important;
        }
        b{
            background: transparent !important;
        }
    </style>
</head>
<body style=" background: url('/image/timg.gif'); background-size: cover;">
<div class="header" style="background: transparent !important;">
    <img src="../../image/logo.gif" alt="">
    <ul class="navbar_nav">
        <%--<li class="active" style="margin-left: 150px;">--%>
            <%--<a href="/company/toMainOfCompany?id=${loginCompany.companyId}">首页</a>--%>
        <%--</li>--%>

        <%--<li class="dropdown">--%>
            <%--<a href="/job/insert">发布职位</a>--%>
            <%--<div class="dropdown_menu">--%>
            <%--</div>--%>
        <%--</li>--%>
        <li class="dropdown">

        </li>
        <li style="margin-left: 70%">
            <a   href="/company/hadGetResumeFromUser?id=${loginCompany.companyId}">退出</a>
        </li>

    </ul>
</div>
<div class="framDiv" ">
    <div class="container" >
        <span class="headerspan" id="sp1">基本信息</span>
        <form action="/user/doUpdateUserOfExp" method="post" class="exform1" onmouseover="disdiv()">
            <input type="hidden" name="userId" value="${userOfExp.userId}">
            姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<input style=" background: transparent !important; border: 1px solid rgba(255,255,255,0.5)" type="text" name="userName2" placeholder="   请输入你的真实姓名" value="${userOfExp.userName2}" readonly = "readonly"> <br>
            <%--性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：${userOfExp.userGender} <br>--%>
            出生年月：<input style=" background: transparent !important; border: 1px solid rgba(255,255,255,0.5)" type="text" name="userAge" placeholder="   请选择出生年月" style="margin-top: 15px" value="${userOfExp.userAge}" readonly = "readonly"> <br>
            电话号码：<input  style=" background: transparent !important; border: 1px solid rgba(255,255,255,0.5)" type="text" name="userPhone" placeholder="   请填写电话号码" value="${userOfExp.userPhone}" readonly = "readonly"> <br>
            电子邮箱：<input style=" background: transparent !important; border: 1px solid rgba(255,255,255,0.5)" type="text" name="userEmail" id="userEmail" value="${userOfExp.userEmail}" placeholder="   请填写你的联系邮箱" readonly = "readonly" oninput="myonEmail()" onblur="document.getElementById('divforemail').style.visibility = 'hidden';"> <br>
            <a href="#sp2"><div style="margin-left: 13%">下一页</div></a>

            <div class="exform2">
                <span class="headerspan" id="sp2">教育信息</span>
                <label style="position: relative;bottom: -70px;left: -105px">毕业院校：</label><input style=" background-color: transparent !important; border: 1px solid rgba(255,255,255,0.5) ; margin-left: 115px"  type="text" id="userSchool" name="userSchool" placeholder="   请填写毕业院校"  value="${userOfExp.userSchool}" readonly = "readonly"> <br>
                学习经历：<textarea style=" background: transparent !important; border: 1px solid rgba(255,255,255,0.5)" name="userExpStudy" id="userExpStudy" cols="70" rows="10" placeholder="   请输入你的学习经历" readonly = "readonly">${userOfExp.userExpStudy}</textarea> <br>
                工作经历：<textarea  style=" background: transparent !important; border: 1px solid rgba(255,255,255,0.5)" name="userExp" id="userExp" cols="70" rows="10" placeholder="   请输入你的工作经历" readonly = "readonly">${userOfExp.userExp}</textarea> <br>
                个人介绍：<textarea style=" background: transparent !important; border: 1px solid rgba(255,255,255,0.5)"  name="userIntroduce" id="userIntroduce" cols="70" rows="10" placeholder="   请说说对自己的评价" readonly = "readonly">${userOfExp.userIntroduce}</textarea> <br>
                <a href="#sp1"><div style="width: 350px;margin-left: 70px">上一页</div></a>
                <%--<input type="submit" value="提   交">--%>
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
