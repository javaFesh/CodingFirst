<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ly128
  Date: 2019/7/6
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>话题展示</title>
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css"/>
    <link rel="stylesheet" href="/css/head.css"/>
    <link rel="stylesheet" href="/css/index.css">
    <link rel="stylesheet" href="/css/invitation.css">
    <script src="/js/discussion.js" type="text/javascript" language="javascript" defer="defer"></script>
    <style>
        body {
            /*!*background: #EAEAEA;!important;*/
            font-family: "Avant Garde", "Tahoma", "Microsoft YaHei", "SimHei" !important;
            /*color: #999999 !important;*/
            color: white !important;
            /*font-weight: bold !important;*/
            /*font-size:  14px !important;*/

        }
        body{
        background: url("/image/mao.gif") 100% 100% no-repeat;
        background-size: cover;
        opacity: 10%;
        }
        /*background-color: palegreen;*/
        /*border: 3px solid rgba(255, 255, 255, 0.5) ;*/
        /*border-radius: 6px;*/
        .abody{

            width: 1100px;
            background-color: rgba(255, 255, 255, 0.1);
            border: 3px solid rgba(255, 255, 255, 0.5) ;
            border-radius: 6px;
        }
    </style>
</head>
<body >
<!-- 导航 -->
<%@ include file="head.jsp" %>

<div id="body" class="abody">
    <!--话题标题-->
    <div id="title">
        <div>
            ${invitation.invitationTitle}
        </div>
        <div id="invitationMessage">
            <div style="float:left;">
                ${invitation.user.userName}&nbsp;&nbsp;
                ${invitation.invitationCreateTime}&nbsp;&nbsp;
                发表在[${invitation.invitationType.invitationTypeName}]
            </div>
            <div style="float:right;">
                <strong>评论 </strong><span class="badge">${invitation.invitationCommentNumber}</span>&nbsp;|&nbsp;
                <a href="/invitation/updateInvitationAgreeNumber?invitationId=${invitation.invitationId}">
                    <strong>赞</strong> </a><span class="badge">${invitation.invitationAgreeNumber}</span>&nbsp;|&nbsp;
                <strong>浏览量 </strong><span class="badge">${invitation.invitationPageView} </span>
            </div>

        </div>

    </div>
    <!--话题内容-->
    <hr style="background:rgba(255, 255, 255, 0.5) ">
    <div id="content" style="font-size: 15px">
        ${invitation.invitationContent}
    </div>

    <c:forEach items="${commentList}" var="comment">
        <div id="comment" >
            <div style="width: 46px;height: 47px;background-image: url('/image/sctp.png');border-radius: 25px;display: inline-block">
                <c:if test="${comment.user.userPicture == null}">
                    <img src="/userPicture/hsnrm.png" alt="" style="margin-top:-30px;width: 35px;height: 35px;border-radius: 25px">
                </c:if>
                <c:if test="${comment.user.userPicture != null}">
                    <img src="${comment.user.userPicture}" alt="" style="margin-top:-30px;width: 35px;height: 35px;border-radius: 25px">
                </c:if>
            </div>
            <div style="margin-left:20px;width: 800px;font-size: 14px;display: inline-block">

                <div style="display: inline-block">${comment.commentContent}</div>
                <div style=" margin-top: 10px;width: 900px;font-size: 10px;color: #666666;display: inline-block">
                        ${comment.user.userName}&nbsp;发表于&nbsp;${comment.commentCreateTime}
                            <hr style="background:rgba(255, 255, 255, 0.3) ">
                </div>
            </div>

            <br>

        </div>
    </c:forEach>
    <div id="add" style="float: left" >
        <form  style="margin-left: 30%" class="form-inline" action="/comment/addComment" onclick="return checkLogin(${loginUser})">
            <div class="form-group">
                <textarea style="background: rgba(255,255,255,0.5)!important" class="form-control" name="commentContent" id="commentContent" cols="100" rows="3"
                          placeholder="添加评论........"></textarea>

            </div>

            <div class="form-group">
                <input type="hidden" name="commentPostId" value="${invitation.invitationId}">
                <input type="hidden" name="userId" value="${loginUser.userId}">

            </div>

            <div class="form-group">
                 &nbsp; &nbsp;<button style="display: block" type="submit" class="btn btn-success " >添加评论</button>

            </div>

        </form>


    </div>


</div>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
<script src="/js/jquery.fullPage.min.js"></script>
<script src="/js/index_slick.js"></script>
<script src="/js/swiper.min.js"></script>
<script src="/js/index.js"></script>
</body>
</html>
