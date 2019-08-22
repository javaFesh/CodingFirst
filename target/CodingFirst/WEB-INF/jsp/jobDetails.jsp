<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>青年无忧网</title>
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css" />
    <link rel="stylesheet" href="/css/head.css" />
    <link rel="stylesheet" href="/css/index.css">
    <script src="/js/discussion.js" type="text/javascript" language="javascript" defer="defer"></script>

    <style>

        body{

            font-family: "Avant Garde","Tahoma","Microsoft YaHei","SimHei" !important;
            color: white !important;
            font-weight: bold !important;
            font-size:  12px !important;
            background: url("/image/4.jpg") 100% 100% no-repeat;
            background-size: cover;

        }
        textarea{
            background-color: rgba(255,255,255,0.1);

            border-radius: 6px;
        }
    </style>
</head>
<body id="body1">
    <!-- 导航 -->
    <%@ include file="../head.jsp" %>


    <div style="width: 100%; height: 150px; margin-top: 80px;color: #999999 !important;">
        <div style="float:left; width: 60%; height: 80px; margin-left: 260px">
            <h2>${work.workName}</h2> ${work.workCity} ${work.createTime}发布 <br>
            ${work.workSalaryName}   ${work.experienceName}/${work.degreeName} <br>
            ${work.workNatureName}
        </div>

        <div style="width: 300px; height: 150px; margin-left: 900px">
            <a href="https://mail.qq.com/cgi-bin/loginpage" class="btn btn-success  btn-lg " onclick="return checkLogin(${sessionScope.loginUser})">发电子邮件</a>
            <button class="btn btn-warning  btn-lg "  onclick="fun3()" >投递简历</button>

            <%--<button style="float:left; margin-top: 30px; margin-left: 50px; background-color: white;" onclick="fun3()">上传简历附件</button>--%>
        </div>
    </div>

    <div style="width: 80%; height: 70%; clear: both; margin-top: 10px; ">
        <div style="width: 45%; float: left; margin-left: 260px; margin-top: 10px;">
            <c:choose>
                <c:when test="${empty work.workWelfare}">
                </c:when>
                <c:otherwise>
                    <div>
                        <span style="float:left;font-size: 18px;">职位福利：</span> <br>
                        <textarea name="" id="" cols="60" rows="5" style="clear: both; font-size: 15px">${work.workWelfare}</textarea>
                    </div>
                </c:otherwise>
            </c:choose>

            <c:choose>
                <c:when test="${empty work.workDetails}">
                </c:when>
                <c:otherwise>
                    <div>
                        <span style="float:left;">职位描述：</span> <br>
                        <textarea name="" id="" cols="60" rows="10" style="clear: both; font-size: 14px">${work.workDetails}</textarea>
                    </div>
                </c:otherwise>
            </c:choose>

            <c:choose>
                <c:when test="${empty work.workDuty}">
                </c:when>
                <c:otherwise>
                    <div>
                        <span style="float:left;">岗位职责：</span> <br>
                        <textarea name="" id="" cols="60" rows="10" style="clear: both; font-size: 14px">${work.workDuty}</textarea>
                    </div>
                </c:otherwise>
            </c:choose>

            <c:choose>
                <c:when test="${empty work.workAsk}">
                </c:when>
                <c:otherwise>
                    <div>
                        <span style="float:left;">岗位要求:</span> <br>
                        <textarea name="" id="" cols="60" rows="20" style="clear: both; font-size: 14px">${work.workAsk}</textarea>
                    </div>
                </c:otherwise>
            </c:choose>

            <div>
                <span>工作地点:</span>
                <p style="font-size: 15px">${work.workplace}</p>
            </div>
        </div>

        <div style="float: left; width: 30%; margin-top: 100px; margin-left: 30px; border: 2px solid rgba(255,255,255,0.7);
        color: white !important;font-size:20px;background:  rgba(255,255,255,0.1);border-radius: 6px">
            <%--<div>${work.companyPicture}</div>--%>

           公司名: <span>${work.companyName}</span>
                <br>
            地 &nbsp;址:<span>${work.companyAddress}</span>
                <br>

            <div>
                公司简介: ${work.companyDescribe}
            </div>
        </div>
    </div>



    <div id="upload" style="clear: both; visibility: hidden;position: absolute;top: 200px;left: 500px;width: 350px;height: 250px;
    background-color: rgba(255,255,255,0.5); border: 1px solid rgba(255,255,255,0.7);border-radius: 6px">
        <%--<span style="font-size: 25px; float:left; margin-top: 30px; margin-left: 50px">上传简历附件</span>--%>
            <span style="font-size: 25px; float:left; margin-top: 40px; margin-left: 50px">投递简历</span> <br>
            <button class="btn btn-info btn-lg ">投递简历</button>
           <form action="/job/upload?id=${work.id}" method="post" enctype="multipart/form-data">
            <input type="hidden" name="userId" value="${loginUser.userId}">
            <input type="file" name="file" style="clear: both; float: left; margin-top: 10px; margin-left: 50px"> <br>
            <%--<input type="submit" value="上传" style="clear:both; float:left; margin-top: 10px; margin-left: 50px" onclick="fun4()"> <br>--%>
            <input class="btn btn-success" type="submit" value="确认投递" style="clear: both; float:left; margin-top: 50px; margin-left: 50px" onclick="fun4()">
            <input class="btn btn-success" type="reset" value="放弃投递" style="float:left; margin-left: 160px; margin-top: 50px" onclick="fun4()">
            <span style="clear:both;float: left; margin-left: 10px">只支持word、pdf、ppt、txt、wps格式文件</span>
        </form>
    </div>
    
    <a href="#body1"><input  class="btn btn-warning" type="button" value="回到顶部" style="clear: both; float: right; margin-bottom: 10px; margin-right: 50px; "/></a>



    <script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
    <script src="/js/jquery.fullPage.min.js"></script>
    <script src="/js/index_slick.js"></script>
    <script src="/js/swiper.min.js"></script>
    <script src="/js/index.js"></script>

    <script>
        function fun1() {
            document.getElementById('select').style.visibility = "visible";
            document.getElementById('body1').style.opacity = "0.9";
            document.getElementById('body1').style.backgroundColor = "gray";
        }

        function fun2() {
            document.getElementById('select').style.visibility = "hidden";
            document.getElementById('body1').style.opacity = "1";
            document.getElementById('body1').style.backgroundColor = "white";
        }

        function fun3() {
            document.getElementById('upload').style.visibility = "visible";
            document.getElementById('body1').style.opacity = "0.9";
            document.getElementById('body1').style.backgroundColor = "gray";
        }

        function fun4() {
            document.getElementById('upload').style.visibility = "hidden";
            document.getElementById('body1').style.opacity = "1";
            document.getElementById('body1').style.backgroundColor = "white";
        }
    </script>
</body>
</html>
