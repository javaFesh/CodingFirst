<%@ taglib prefix="color" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/7/13
  Time: 7:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考试卷</title>
    <style>

        body {
            /*background: black !important;*/
            /*background: url("/image/mao.gif") no-repeat;*/
            background: url("/image/listxing.jpeg") 100% 100% no-repeat ;
            /* 加载背景图片 */
            /*background-image: url("/image/mao.gif") ;*/
            /*!* 背景图垂直、水平均居中 *!*/
            background-position: center center;

            /*!* 背景图不平铺 *!*/
            /*background-repeat: no-repeat;*/
            /*!* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 *!*/
            /*!*background-attachment: fixed;  !*此条属性必须设置否则可能无效*!*!*/
            /*!* 让背景图基于容器大小伸缩 *!*/
            background-size: cover

        }

        a {
            font-size: 40px;
        }

        .context {

            /*height: 1000px;*/
            width: 800px;
            margin: 0 auto;
            /*background-color: aqua !important;*/
            /*border: 1px solid black;*/
            color: #F0F0F0 !important;
        }
    </style>
    <link type="text/css" rel="stylesheet" href="/css/tiku.css"/>
    <script charset="utf-8" src="/kindeditor/kindeditor-all.js"></script>
    <script charset="utf-8" src="/kindeditor/lang/zh-CN.js"></script>
    <script>
        KindEditor.ready(function (K) {
            window.editor = K.create('#editor_id');
        });
    </script>
    <script type="text/javascript">
        function toggle() {
            var div = document.getElementById("show");
            if (div.style.display == "block") {
                div.style.display = "none";
            } else {
                div.style.display = "block";
            }
        }

    </script>
</head>
<body>
<%@ include file="head.jsp" %>
<div class="context" style="font-size: 25px;color: #F0F0F0;margin-top: 110px; color: #F0F0F0;font-family: 楷体">
    <span style="font-size: 25px;color: #F0F0F0;font-family: 楷体">题目:${writing1.title}</span>
    <div class="form-group" style="align-content: center">

        <textarea class="form-control"
                  style=" background:rgba(255,255,255,0.5)!important;font-size: 20px; font-family: 楷体"  cols="100"
                  rows="10" placeholder="请输入题目答案......"></textarea>
    </div>
    <div class="form-group" style="text-align: center">
        <button onclick="toggle();" class="btn btn-success"> 查看答案</button>
        <button> <a href="" class="btn btn-success">下一题</a></button>
    </div>
    <div id="show"
         style=" display:none; background:rgba(255,255,255,0.3)!important;font-size: 20px; color: #F0F0F0;font-family: 楷体 ;border-radius: 5px">
        ${writing1.answer}
    </div>

</div>
</body>
</html>
