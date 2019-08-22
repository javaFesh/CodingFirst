<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <!-- 3. 导入bootstrap的js文件 -->
    <link rel="stylesheet" href="/css/reset.css">
    <link href="${pageContext.request.contextPath}//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/web.css"/>
    <link rel="stylesheet" type="/text/css" href="css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css"/>
    <link rel="stylesheet" href="/css/head.css"/>
    <link rel="stylesheet" href="/css/index.css">
    <script src="/js/discussion.js" type="text/javascript" language="javascript" defer="defer"></script>
</head>
<body>

<header class="header" style="background: transparent;">
    <div class="container clearfix">
        <div class="fl left">
            <a href="javascript:void(0)"><img src="/image/logo.gif" alt="" class="img1" style="margin-top: -12px"/></a>
            <a href="javascript:void(0)"><img src="/image/logo.gif" alt="" class="img2"/></a>
        </div>
        <div class="fr nav">
            <ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">
                <li class="active">
                    <a href="/type/to">首页</a>
                </li>
                <li class="dropdown">
                    <a href="javascript:void(0)">
                        笔试
                    </a>
                    <div class="dropdown_menu">
                        <a href="${pageContext.request.contextPath}/type/totiku" onclick="return checkLogin(${sessionScope.loginUser})">题库</a>
                        <a href="${pageContext.request.contextPath}/dajuan/to" onclick="return checkLogin(${sessionScope.loginUser})">模拟答卷</a>

                    </div>
                </li>
                <li class="dropdown">
                    <a href="javascript:void(0)">面试</a>
                    <div class="dropdown_menu">
                        <a href="/user/getInterviewForUserClassify" onclick="return checkLogin(${sessionScope.loginUser})">历年真题</a>

                        <a href="/faceSkill/showAllInterviewSkillForUser" onclick="return checkLogin(${sessionScope.loginUser})">面试技巧</a>
                        <%--<a href="#">HR面试</a>--%>

                    </div>
                </li>
                <li class="dropdown">
                    <a href="javascript:void(0)">求职</a>
                    <div class="dropdown_menu">
                        <c:if test="${loginUser.userPicture != null}">
                            <a href="/job/main?currentPage=1" >找工作</a>
                            <%--<a href="/job/insert">发布职位</a>--%>
                        </c:if>
                        <c:if test="${loginUser.userPicture == null}">
                            <a href="/job/main?currentPage=1" >找工作</a>
                            <a href="/job/insert" onclick="return checkLogin(${sessionScope.loginUser})">发布职位</a>
                        </c:if>


                    </div>
                </li>
                <li>
                    <a href="/invitation/selectAll">讨论区</a>
                </li>
                <c:if test="${sessionScope.loginUser!=null}">
                    <li class="dropdown">

                        <a href="javascript:void(0)"><div style="width: 46px;height: 47px;border-radius: 25px">
                            <c:if test="${loginUser.userPicture != null}">
                                <img src="${loginUser.userPicture}" alt="" style="width: 50px;height:50px; border-radius: 25px">
                            </c:if>
                            <c:if test="${loginUser.userPicture == null}">
                                <img src="/image/sctp.png" alt="" style="width: 50px;height: 50px;border-radius: 25px">
                            </c:if>
                        </div></a>
                        <div class="dropdown_menu">
                            <a href="/user/personalExperience?id=${loginUser.userId}">个人简历</a>
                            <a href="/user/hitExperience?id=${loginUser.userId}">已投企业</a>
                                <%--<a href="/user/getAllmyTiezi?id=${loginUser.userId}">我的帖子</a>--%>
                                <%--<a href="/user/getAllmyComment?id=${loginUser.userId}">我的评论</a>--%>
                            <%--<a href="/invitation/selectInvitationByUser">我的帖子</a>--%>
                            <%--<a href="#">我的评论</a>--%>
                            <%--<a href="/user/finishedWork?id=${loginUser.userId}">已做题目</a>--%>
                            <a href="/imageFile/selectImageFile?id=${loginUser.userId}">个人设置</a>
                            <a href="/user/login">退出</a>
                        </div>
                    </li>
                </c:if>
                <c:if test="${sessionScope.loginUser==null}">
                    <li>
                        <a href="${pageContext.request.contextPath}/user/login">登录</a>
                    </li>

                    <li>
                        <a href="/user/register">注册</a>
                    </li>
                </c:if>

            </ul>
        </div>
        <a href="javascript:void(0)" id="navToggle">
            <span></span>
        </a>
    </div>
    <!--移动端的导航-->
    <%--<div class="m_nav">--%>
        <%--<div class="top clearfix">--%>
            <%--<img src="/image/closed.png" alt="" class="closed"/>--%>
        <%--</div>--%>
        <%--<div class="logo">--%>
            <%--<img src="/image/logo.gif" alt=""/>--%>
        <%--</div>--%>
        <%--<ul class="ul" data-in="fadeInDown" data-out="fadeOutUp">--%>
            <%--<li class="active">--%>
                <%--<a href="javascript:void(0)">首页</a>--%>
            <%--</li>--%>
            <%--<li class="dropdown">--%>
                <%--<a href="javascript:void(0)">--%>
                    <%--笔试--%>
                <%--</a>--%>
                <%--<div class="dropdown_menu">--%>
                    <%--<a href="#">题库</a>--%>
                    <%--<a href="#">模拟答卷</a>--%>
                <%--</div>--%>
            <%--</li>--%>
            <%--<li class="dropdown">--%>
                <%--<a href="javascript:void(0)">面试</a>--%>
                <%--<div class="dropdown_menu">--%>
                    <%--<a href="#">历年真题</a>--%>
                    <%--<a href="#">HR面试</a>--%>
                    <%--<a href="#">面试技巧</a>--%>
                <%--</div>--%>
            <%--</li>--%>
            <%--<li class="dropdown">--%>
                <%--<a href="javascript:void(0)">求职</a>--%>
                <%--<div class="dropdown_menu">--%>
                    <%--<a href="/job/main?currentPage=1">找工作</a>--%>
                    <%--<a href="/job/insert">发布职位</a>--%>

                <%--</div>--%>
            <%--</li>--%>
            <%--<li>--%>
                <%--<a href="javascript:void(0)">讨论区</a>--%>
            <%--</li>--%>

            <%--<li>--%>
                <%--<a href="login.html">登录</a>--%>
            <%--</li>--%>

            <%--<li>--%>
                <%--<a href="javascript:void(0)">注册</a>--%>
            <%--</li>--%>

        <%--</ul>--%>
    <%--</div>--%>
    <%--<!-- 内容 -->--%>

</header>


</body>
</html>
