<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/7/12
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>模拟答卷准备中......</title>
    <style>
        *{
            background-color: 	#EDEDED;
        }
    </style>
    <script type="text/javascript">
        onload = function () {
            setInterval(go, 1000);
        };
        var x = 5; //利用了全局变量来执行
        function go() {
            x--;
            if (x > 0) {
                document.getElementById("sp").innerHTML = x; //每次设置的x的值都不一样了。
            } else {
                location.href = '/dajuan/to';
            }
        }
    </script>
</head>
<body>
<h1>请做好答题准备,无忧君祝您取得好成绩,考试马上开始</h1>
<hr>
<span id="sp">5</span> <span>s后跳转试卷......</span>


</body>
</html>
