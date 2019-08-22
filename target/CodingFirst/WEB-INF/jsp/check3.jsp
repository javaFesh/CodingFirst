<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/5/18
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>校验页面</title>
    <script type="text/javascript">
        onload = function(){
            setInterval(go,1000);
        };
        var x = 4;
        function go() {
            x--;
            if (x <= 0) {
                location.href = "/user/register";
            }
        }
    </script>
</head>
<body>
<h1 align="center">该手机号已注册&nbsp;&nbsp;<span id="sp" style="width: 20px;height: 20px"></span>请重新注册</h1>
</body>
</html>>

</body>
</html>
