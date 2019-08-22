<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/7
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
    <link rel="stylesheet" href="../../css/register.css">
    <script type="text/javascript" src="../../js/register.js"></script>
</head>
<body>
<div class="div1">
    <div class="registerContent">
        <img src="../../image/logo.gif" alt=""> <br>
        <span class="spanOfUser" id="span1" onclick="func1('span1')">
            用户注册
        </span>
        <span class="spanOfCompony" id="span2" onclick="func1('span2')">
            企业注册
        </span> <br>
        <img src="../../image/xhx.png" alt="" id="img1" class="img1">

            <form action="/user/doRegisterOfUser" method="post" id="form1" class="form1" onsubmit="return check1()">
                <label for="userName"></label>
                <input type="text" id="userName" name="userName" placeholder="   请输入用户名 " onblur="func2()"> <br>
                <span class="form1span1" id="form1span1">*请输入正确用户名</span>

                <label for="userPassword"></label>
                <input type="password" id="userPassword" name="userPassword" placeholder="   请输入密码                                 6-10位" onblur="func3()"><br>
                <span class="form1span2" id="form1span2">*请输入密码(格式：6-10位数字、字母和下划线可自由搭配)</span>

                <input type="submit" value="快速注册" style="border-radius: 5px;color: white;border: 0px;background-color: limegreen"> <br>
                <input type="reset" value="重新设置" style="background-color: orange;border: 0px;border-radius: 5px;margin-top: -15px">
            </form>

        <%--<div class="ShowDiv"><br />&nbsp;${message}</div>--%>

        <form action="/company/doRegisterOfCompany" method="post" id="form2" class="form2" onsubmit="return check2()" enctype="multipart/form-data">
           <div id="divform" onmouseover="disdiv()">
               <label for="companyPhone" id="companyPhonespan"></label><input type="text" id="companyPhone" name="companyPhone" placeholder="   请输入手机号" onblur="func4()"> <br>
               <span class="form2span1" id="form2span1" style="top: 30px;">*请输入正确手机号</span>
               <label for="companyName"></label><input type="text" id="companyName" name="companyName" placeholder="   请输入公司名称" onblur="func5()"><br>
               <span class="form2span3" id="form2span3" style="position: absolute;left: 40px;top: 80px;font-size: 10px;color: red;">*请输入公司名称</span>
               <label for="companyPassword"></label><input type="password" id="companyPassword" name="companyPassword" placeholder="   请输入密码                                 6-10位" onblur="func6()"><br>
               <span class="form2span2" id="form2span2" style="top: 130px;">*请输入密码(格式：6-10位数字、字母和下划线可自由搭配)</span>
               <input type="file" name="companyIdentifyImage" id="imageFile" class="imageFile" accept="image/*"/>
               <label for="imageFile"><div>上传执照</div></label> <span class="bxx">( 必须项 )</span><br>

               <a href="#companyEmailspan" style="position: relative;left: 170px;top: -50px;color: black" onclick="despan()"><div class="diva">下一步</div></a>

               <label for="companyEmail" id="companyEmailspan"></label>
               <input type="text" id="companyEmail" name="companyEmail" oninput="myonEmail()" placeholder="   请输入邮箱,以便用户投递简历" onblur="func7()">
               <br>
               <span class="form2span4" id="form2span4" style="top: 40px;">*请输入公司邮箱</span>
               <input type="text" id="companyAddress" name="companyAddress" placeholder="   请输入公司地址" onblur="func8()">
               <br>
               <span class="form2span5" id="form2span5" style="top: 90px;">*请输入公司地址</span>
               <input type="text" id="companyDescribe" name="companyDescribe" placeholder="   请输入公司描述" onblur="func9()">
               <br>
               <span class="form2span6" id="form2span6" style="top: 140px;">*请输入公司地址</span>
               <input type="submit" value="企业注册" style="border-radius: 5px;color: white;border: 0px;background-color: limegreen"> <br>
               <input type="reset" value="重新设置" style="background-color: orange;border: 0px;border-radius: 5px;margin-top: -15px">
               <a href="#companyPhonespan" style="position: relative;left: 170px;top: 0px;color: black" onclick="despan()"><div class="diva">上一步</div></a>

           </div>
            <div class="divforemail" id="divforemail">
                <ul>
                    <li onmouseover="insertspan('@sina.com')"><span id="span3"></span><span class="span4">@sina.com</span></li>
                    <li onmouseover="insertspan2('@163.com')"><span id="span4"></span><span class="span4">@163.com</span></li>
                    <li onmouseover="insertspan2('@qq.com')"><span id="span5"></span><span class="span4">@qq.com</span></li>
                    <li onmouseover="insertspan2('@126.com')"><span id="span6"></span><span class="span4">@126.com</span></li>
                    <li onmouseover="insertspan2('@sina.cn')"><span id="span7"></span><span class="span4">@sina.cn</span></li>
                    <li onmouseover="insertspan2('@hotmail.com')"><span id="span8"></span><span class="span4">@hotmail.com</span></li>
                    <li onmouseover="insertspan2('@gmail.com')"><span id="span9"></span><span class="span4">@gmail.com</span></li>
                </ul>
            </div>
        </form>

        <div class="quike">
            <span class="quike_span1">已有账号?：</span> <br>
            <span class="quike_span2"><a href="/user/login">直接登录</a></span>
        </div>
    </div>
</div>
</body>
</html>
