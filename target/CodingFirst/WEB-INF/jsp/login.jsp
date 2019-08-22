<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/8
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--    <title>登录界面</title>--%>
    <link rel="stylesheet" href="../../css/login.css">
    <script type="text/javascript" src="../../js/login.js"></script>
</head>
<body>
<div class="div1">
    <div class="registerContent">
        <img src="../../image/logo.png" alt=""> <br>
        <span class="spanOfUser" id="span1" onclick="func1('span1')">
            用户登录
        </span>
        <span class="spanOfCompony" id="span2" onclick="func1('span2')">
            企业登录
        </span> <br>
        <img src="../../image/xhx.png" alt="" id="img1" class="img1">

        <form action="/user/doLoginOfUser" method="post" id="form1" class="form1">
            <label for="userPhone"></label><input type="text" id="userPhone" name="userName" placeholder="   请输入用户名 " onblur="func2()"> <br>
            <span class="form1span1" id="form1span1">*请输入正确用户名</span>
            <label for="userPassword"></label><input type="password" id="userPassword" name="userPassword" placeholder="   请输入密码                                 6-10位" onblur="func3()"><br>
            <span class="form1span2" id="form1span2">*请输入密码</span>
            <input type="submit" value="登  录" style="border-radius: 5px;color: white;border: 0px;background-color: limegreen"> <br>
        </form>

        <%--<div class="ShowDiv" id="ShowDiv"><br />&nbsp;${message}</div>--%>

        <form action="/company/doLoginOfCompany" method="post" id="form2" class="form2" enctype="multipart/form-data">
            <label for="companyPhone"></label><input type="text" id="companyPhone" name="companyName" placeholder="   请输入公司名" onblur="func4()"> <br>
            <span class="form2span1" id="form2span1" style="top: 30px;">*请输入正确公司名</span>
            <label for="companyPassword"></label><input type="password" id="companyPassword" name="companyPassword" placeholder="   请输入密码                                 6-10位" onblur="func6()"><br>
            <span class="form2span2" id="form2span2" style="top: 80px;">*请输入密码</span>
            <input type="submit" value="登  录" style="border-radius: 5px;color: white;border: 0px;background-color: limegreen"> <br>
            <input type="reset" value="重  置" style="background-color: orange;border: 0px;border-radius: 5px;margin-top: -15px">
        </form>

        <div class="quike">
            <span class="quike_span1">还没有账号?：</span> <br>
            <span class="quike_span2"><a href="/user/register">立即注册</a></span>
        </div>
        <span id="ssp1" style="color: white;background-color: #1eb37b;position: absolute;
        top: 90px;right: 10px;font-size: 17px;text-align: center;">${message}&nbsp;&nbsp;
            <a href="#" style="color: black;position: relative;top: -6px;"
               onclick="document.getElementById('ssp1').style.visibility='hidden'">
                x
            </a>
        </span>
    </div>
</div>
</body>
</html>
