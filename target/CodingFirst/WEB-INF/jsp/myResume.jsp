<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/13
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>已投简历界面</title>
    <link rel="stylesheet" href="../../css/headercss.css">
    <link rel="stylesheet" href="../../css/personalExperience.css">
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <style>
        td{
            text-align: center;
        }
        .showPro1{
            background-color: limegreen;
            width: 20px;
            height: 20px;
            border-radius: 10px;
            float: left;
            z-index: 0;
        }
        .showPro{
            background-color: limegreen;
            width: 50px;
            height: 3px;
            float: left;
            z-index: 0;
            margin-top: 9px;
        }
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
                <%--<a href="">我的帖子</a>--%>
                <%--<a href="">我的评论</a>--%>
                <%--<a href="/user/finishedWork?id=${loginUser.userId}">已做题目</a>--%>
                <a href="/imageFile/selectImageFile?id=${loginUser.userId}">个人设置</a>
                <a href="/user/login">退出</a>
            </div>
        </li>

    </ul>
</div>
<div class="framDiv" style="height: 900px;z-index: 0">
    <div class="container" style="height: 800px;width: 800px;left: 80px">
        <span class="headerspan" id="sp1">我投过的简历</span>
        <table style="margin: 20px auto;border: solid 1px coral;width:750px">
            <thead>
            <th>编号</th>
            <th>公司名称</th>
            <th>工作城市</th>
            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;职位</th>
            <th>职位简介</th>
            <th>薪资待遇</th>
            <th><span style="margin-left: 30px">进度 </span><span style="font-size: 5px">(1.投递成功2.被查看3.面试)</span></th>
            <th>&nbsp;&nbsp;操作</th>
            </thead>
            <tbody>

            <c:forEach items="${list}" var="list">
                <tr>
                    <td>${list.id}</td>
                    <td>${list.companyName}</td>
                    <td>${list.workCity}</td>
                    <td>${list.workName}</td>
                    <td><a class="btn btn-success btn-sm" style="font-size: 7px !important;" href="/user/getWorkDetails?id=${list.workId}&uId=${loginUser.userId}">查看</a></td>

                    <td>${list.workSalary}</td>
                    <%--<td>${list.progress}</td>--%>
                    <td style="color: white;width: 250px">
                        <c:if test="${list.progress == 32}">
                            <span style="margin-left: 30px">
                            <div class="showPro1" style="margin-left: 40px">1</div>
                            <div class="showPro"></div>
                            <div class="showPro1" style="background-color: gray">2</div>
                            <div class="showPro" style="background-color: gray"></div>
                            <div class="showPro1" style="background-color: gray">3</div>
                            <%--<div class="showPro" style="background-color: gray"></div>--%>
                            <%--<div class="showPro1" style="background-color: gray">4</div>--%>
                            <c:if test="${list.test != null}">
                                <div style="width: 100px;height: 30px;font-size: 10px;color: red;margin-left: 200px">
                                        ${list.test}
                                </div>
                            </c:if>
                        </c:if>

                        <c:if test="${list.progress == 33}">
                            <div class="showPro1" style="margin-left: 40px">1</div>
                            <div class="showPro"></div>
                            <div class="showPro1">2</div>
                            <div class="showPro"></div>
                            <div class="showPro1" style="background-color: gray">3</div>
                            <%--<div class="showPro" style="background-color: gray"></div>--%>
                            <%--<div class="showPro1" style="background-color: gray">4</div>--%>
                            <c:if test="${list.test != null}">
                                <div style="width: 100px;height: 30px;font-size: 10px;color: red;margin-left: 200px">
                                        ${list.test}
                                </div>
                            </c:if>
                        </c:if>
                        <c:if test="${list.progress == 34}">
                            <div class="showPro1" style="margin-left: 40px">1</div>
                            <div class="showPro"></div>
                            <div class="showPro1">2</div>
                            <div class="showPro"></div>
                            <div class="showPro1">3</div>
                            <%--<div class="showPro"></div>--%>
                            <%--<div class="showPro1" style="background-color: gray">4</div>--%>
                            <c:if test="${list.test != null}">
                                <div style="width: 100px;height: 30px;font-size: 10px;color: red;margin-left: 200px">
                                        ${list.test}
                                </div>
                            </c:if>
                        </c:if>
                        <c:if test="${list.progress == 35}">
                            <div class="showPro1" style="margin-left: 40px">1</div>
                            <div class="showPro"></div>
                            <div class="showPro1">2</div>
                            <div class="showPro"></div>
                            <div class="showPro1">3</div>
                            <%--<div class="showPro"></div>--%>
                            <%--<div class="showPro1">4</div>--%>
                            <c:if test="${list.test != null}">
                                <div style="width: 100px;height: 30px;font-size: 10px;color: red;margin-left: 200px">
                                        ${list.test}
                                </div>
                            </c:if>
                        </c:if>
                                </span>
                    </td>
                    <td><a href="/user/deleteSelfExp?id=${list.workId}&uId=${loginUser.userId}" style="color: white;text-decoration: none"><span style="background-color: limegreen;padding: 1px 5px">删除</span></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div style="z-index: 1;background-color: transparent;width: 250px;

    position: fixed;left: 900px;top: 150px; border-radius: 6px;border: 1px solid rgb(255,255,255,0.7)">
        <span>职位简介</span> <br>
        ${checkWorkdetails}
    </div>
</div>

</body>
</html>
