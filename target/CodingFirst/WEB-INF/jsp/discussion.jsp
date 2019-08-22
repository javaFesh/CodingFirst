<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ly128
  Date: 2019/6/29
  Time: 7:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>讨论区</title>
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css" />
    <link rel="stylesheet" href="/css/head.css" />
    <link rel="stylesheet" href="/css/index.css">
    <link rel="stylesheet" href="/css/discussion.css">
    <script src="/js/discussion.js" type="text/javascript" language="javascript" defer="defer"></script>
    <style>
        body{
            background: #EAEAEA; !important;
            font-family: "Avant Garde","Tahoma","Microsoft YaHei","SimHei" !important;
            color: #999999 !important;
            font-weight: bold !important;
            /*font-size:  14px !important;*/

        }
        /*body{*/
            /*background: url("/image/4.jpg") 100% 100% no-repeat;*/
            /*background-size: cover;*/
            /*opacity: 10%;*/
        /*}*/
    </style>
</head>
<body style="background-color: #EAEAEA;font-weight: bold;">
<!-- 导航 -->
<%@ include file="head.jsp" %>
<!-- top -->
<div id="invitationTop"><a href="/#"><img src="/image/invitationTop.jpg" ></a></div>
<div style="width:1100px;margin: 10px auto;">
<div style="width:802px;margin-right:5px;border: 1px solid lightgrey;float: left; " >
    <!-- 发帖 -->
    <div id="publish" style=" background-color:#EAEAEA;">
        <div class="publishTitle" >&nbsp;&nbsp;&nbsp;&nbsp;#分享与求助</div>
        <div><a class="btn btn-success" href="/invitation/addInvitation" id="doPublish" onclick="return checkLogin(${sessionScope.loginUser})">我要发布</a></div>
    </div>
    <hr style="background:rgba(255, 255, 255, 0.5) ">
    <div id="type" >
        <a href="/invitation/selectAll" id="typeList" class="btn btn-success" >全部</a>
        <c:forEach items="${invitationTypeList}" var="invitationType">
            <a class="btn btn-success" href="/invitation/selectInvitationByType?invitationTypeName=${invitationType.invitationTypeName}" id="typeList" style="font-weight: bold">${invitationType.invitationTypeName}</a>
        </c:forEach>
        <%--<div style="margin: 10px 0px 0px 550px; ">--%>
            <%--<form action="/invitation/selectInvitationByKey">--%>
                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<label for="exampleInputName6">添加管理员密码:</label>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;<input type="text" name="key" class="form-control" id="exampleInputName6">&ndash;%&gt;--%>

            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<button type="submit" class="btn btn-success " style="float:right">查询</button>&ndash;%&gt;--%>
                <%--<input type="text"  class="form-control"style="border: 1px solid lightgrey;width: 58px "name="key" style="float: left">--%>
                <%--<input type="submit" value="查询" class="btn btn-success "style="float: left" >--%>
            <%--</form>--%>
        <%--</div>--%>
        <div style="clear:right;float:right ;">
            <form class="form-inline" action="/invitation/selectInvitationByKey"
                  method="post">
                <div class="form-group">
                    <%--<label for="exampleInputName2">添加管理员账户:</label>--%>
                    <input type="text" name="key" class="form-control" id="exampleInputName2">
                </div>


                <button type="submit" class="btn btn-success">查询</button>
            </form>
        </div>
    </div>
    <hr style="background:rgba(255, 255, 255, 0.5) ">
    <div style="width:800px;padding:10px;background-color:#EAEAEA;">
        <!--话题列表-->
        <table id="discussionList" >
            <c:forEach items="${invitationList}" var="invitation">
                <tr>
                    <td>
                        <div id="talk">
                            <div id="talkName">
                                <a href="/invitation/selectById?id= ${invitation.invitationId}">${invitation.invitationTitle}</a>
                            </div>
                            <div id="talkMessage" style="width: 700px; ">
                                <div id="talkMessageLeft" style="float:left; ">
                                        ${invitation.user.userName}&nbsp;&nbsp;
                                        ${invitation.invitationCreateTime}&nbsp;&nbsp;
                                    发表在[${invitation.invitationType.invitationTypeName}]

                                </div>
                                <div id="talkMessageRight" style="float:right;">
                                    <%--评论<span class="badge"> ${invitation.invitationCommentNumber}</span>&nbsp;|&nbsp;--%>
                                    <%--赞<span class="badge">${invitation.invitationAgreeNumber}</span>&nbsp;|&nbsp;--%>
                                    <%--浏览量<span class="badge"> </span>--%>
                                    <button class="btn btn-info" type="button">
                                        评论 <span class="badge">${invitation.invitationCommentNumber}</span>
                                    </button>
                                    <button class="btn btn-info" type="button">
                                        赞 <span class="badge">${invitation.invitationAgreeNumber}</span>
                                    </button>
                                <button class="btn btn-info" type="button">
                                    浏览量 <span class="badge">${invitation.invitationPageView}</span>
                                </button>

                                </div>
                        </div>

                    </td>
                </tr>

            </c:forEach>
            <tr>
                <td colspan="1" align="center" >
                    当前${pageBean.currentPage}/${pageBean.totalPage}页&nbsp;&nbsp;
                    <c:if test="${key== null}">
                        <c:if test="${invitationTypeName == null}">
                            <a class="btn btn-success" href="/invitation/selectAll?page=1">首页</a>&nbsp;
                            <a class="btn btn-success" href="/invitation/selectAll?page=${pageBean.currentPage-1}">上一页</a>&nbsp;
                            <a  class="btn btn-success"href="/invitation/selectAll?page=${pageBean.currentPage+1}">下一页</a>&nbsp;
                            <a  class="btn btn-success" href="/invitation/selectAll?page=${pageBean.totalPage}">末页</a>
                        </c:if>
                        <c:if test="${invitationTypeName != null}">
                            <a  class="btn btn-success"href="/invitation/selectInvitationByType?page=1&invitationTypeName=${invitationTypeName}">首页</a>&nbsp;
                            <a  class="btn btn-success"href="/invitation/selectInvitationByType?page=${pageBean.currentPage-1}&invitationTypeName=${invitationTypeName}">上一页</a>&nbsp;
                            <a class="btn btn-success"href="/invitation/selectInvitationByType?page=${pageBean.currentPage+1}&invitationTypeName=${invitationTypeName}">下一页</a>&nbsp;
                            <a class="btn btn-success" href="/invitation/selectInvitationByType?page=${pageBean.totalPage}&invitationTypeName=${invitationTypeName}">末页</a>
                        </c:if>

                    </c:if>
                    <c:if test="${key != null}">
                        <a  class="btn btn-success"href="/invitation/selectInvitationByKey?page=1&key=${key}&invitationTypeName=${invitationTypeName}">首页</a>&nbsp;
                        <a  class="btn btn-success"href="/invitation/selectInvitationByKey?page=${pageBean.currentPage-1}&key=${key}&invitationTypeName=${invitationTypeName}">上一页</a>&nbsp;
                        <a class="btn btn-success"href="/invitation/selectInvitationByKey?page=${pageBean.currentPage+1}&key=${key}&invitationTypeName=${invitationTypeName}">下一页</a>&nbsp;
                        <a class="btn btn-success" href="/invitation/selectInvitationByKey?page=${pageBean.totalPage}&key=${key}&invitationTypeName=${invitationTypeName}">末页</a>
                    </c:if>

                </td>
            </tr>
        </table>

    </div>
</div>

    <%--#EAEAEA--%>
<div style="width:288px;margin-left:5px;padding:10px; background-color:#EAEAEA;border: 1px solid lightgrey;float: right">
        <div class="publishTitle " style="width: 250px;height:60px;">
             <button class="btn-info btn">#近期热帖</button>
        </div>
    <div >
        <c:forEach items="${invitationOrderByPageViewList}" var="invitation">
            <div style="width: 250px;">
                <div style="width: 250px;">
                    <a href="/invitation/selectById?id= ${invitation.invitationId}">${invitation.invitationTitle}</a>
                </div>
                <div style="width: 250px; font-size: 10px;">
                    <div style="float:left;">
                            ${invitation.user.userName}&nbsp;&nbsp;
                            发表于${invitation.invitationCreateTime}
                    </div>
                    <div style="float:right;">
                        <%--<button class="btn btn-info" type="button">--%>
                            <%--浏览量 <span class="badge">${invitation.invitationPageView}</span>--%>
                        <%--</button>--%>
                    <strong>浏览量</strong>    <span class="badge">${invitation.invitationPageView}</span>
                    </div>
                </div>
            </div>
            <br>
        </c:forEach>

    </div>
    </div>
</div>
<div id="invitationBottom" >青年无忧，物联网求职必备神器</div>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
<script src="/js/jquery.fullPage.min.js"></script>
<script src="/js/index_slick.js"></script>
<script src="/js/swiper.min.js"></script>
<script src="/js/index.js"></script>

</body>
</html>