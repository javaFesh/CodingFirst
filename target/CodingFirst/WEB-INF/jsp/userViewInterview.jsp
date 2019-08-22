<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/14
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>面试真题</title>
    <link rel="stylesheet" href="../../css/personalSet.css">
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <style>
        body {
            background: url("/image/timg.gif") 100% 100% no-repeat;
            background-size: cover;
            /*color: white;*/
        }

        a {
            text-decoration: none;
            color: white;
        }

        a:hover {
            cursor: pointer;
        }
    </style>
    <script>
        function show() {
            document.getElementById("answer").style.visibility = "visible";
        }

        // function disAnswer() {
        //     document.getElementById("answer").style.visibility = "hidden";
        // }
    </script>
    <style>
        .con1 {
            width: 800px;

            /*background: palegoldenrod;*/
            margin: 100px auto;
        }
        .con2{
            width: 300px;
            height: 30px;
            margin: 0px auto;
            margin-top: 10px;
        }
        body {
            /*!*background: #EAEAEA;!important;*/
            font-family: "Avant Garde", "Tahoma", "Microsoft YaHei", "SimHei" !important;
            /*color: #999999 !important;*/
            color: white !important;
            /*font-weight: bold !important;*/
            font-size:  16px !important;

        }
    </style>
</head>
<body>
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
            <a href="javascript:void(0)">求职</a>
            <div class="dropdown_menu">
                <a href="/job/main?currentPage=1">找工作</a>
                <%--<a href="/job/insert">发布职位</a>--%>

            </div>
        </li>
        <li>
            <a href="javascript:void(0)">讨论区</a>
        </li>
        <li class="dropdown">

            <a href="javascript:void(0)">
                <div style="margin-top: -10px;width: 46px;height: 47px;background-image: url('../../image/sctp.png');border-radius: 25px">
                    <c:if test="${loginUser.userPicture != null}">
                        <img src="${loginUser.userPicture}" alt="" style="width: 50px;height: 50px;border-radius: 25px">
                    </c:if>
                    <c:if test="${loginUser.userPicture == null}">
                        <img src="/image/sctp.png" alt="" style="width: 50px;height: 50px;border-radius: 25px">
                    </c:if>
                </div>
            </a>
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

<div class="con1">



    <c:forEach items="${pageBean.pageData}" var="data">

        <input name="typeId" type="hidden" value="${typeId}">
        <input name="interviewId" type="hidden" value="${data.interviewId}">

        <div style=" font-size:  16px !important;font-weight: bold" >题目:${data.interviewTitle}</div>
        <br>

        <div style="background:rgba(255,255,255,0.3) ;border-radius: 6px ; border: 2px solid rgba(255,255,255,0.5)">
                <strong>答案:</strong>${data.interviewAnswer}
        </div>
        <%--</form>--%>
    </c:forEach>
    <div class="con2">
        <a class="btn-success btn btn-sm" href="/user/getInterviewForUser?currentPage=1&typeId=${typeId}">第一题</a>
        <a class="btn-success btn btn-sm"
           href="/user/getInterviewForUser?currentPage=${pageBean.getCurrentPage()-1}&typeId=${typeId}">上一题 </a>
        <a class="btn-success btn btn-sm"
           href="/user/getInterviewForUser?currentPage=${pageBean.getCurrentPage()+1}&typeId=${typeId}"
           onclick="disAnswer()">
            下一题
        </a>
        <a class="btn-success btn btn-sm "
           href="/user/getInterviewForUser?currentPage=${pageBean.getTotalPage()}&typeId=${typeId}">最后一题 </a>

    </div>
</div>
</body>
</html>
