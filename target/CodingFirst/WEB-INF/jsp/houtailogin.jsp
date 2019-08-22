<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
  <meta charset="utf-8">
  <meta name="renderer" content="webkit|ie-comp|ie-stand">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport"
        content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <!--[if lt IE 9]>
  <script type="text/javascript" src="/lib/html5shiv.js"></script>
  <script type="text/javascript" src="/lib/respond.min.js"></script>
  <![endif]-->
  <link href="/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css"/>
  <link href="/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css"/>
  <link href="/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css"/>
  <link href="/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css"/>
  <!--[if IE 6]>
  <script type="text/javascript" src="/lib/DD_belatedPNG_0.0.8a-min.js"></script>
  <script>DD_belatedPNG.fix('*');</script>
  <![endif]-->
  <title>青年无忧登录</title>
  <meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">

  <meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
  <style>
    *{
      margin: 0 auto;
    }
    .verify{
      width: 400px;
      height: 40px;
      margin-top: 30px;
    }
    .verify span{
      width: 38px;
      height: 40px;
      font-family: ﻿MicrosoftYaHei;
      font-size: 16px;
      font-weight: normal;
      font-style: normal;
      font-stretch: normal;
      line-height: 40px;
      letter-spacing: 0px;
      color: #302f41;
      margin-right: 23px;
    }
    #verify_box{
      width: 358px;
      height: 40px;
      text-align: center;
      line-height: 40px;
      font-size: 14px;
      color:#fff;
      position: relative;
      background-color: rgba(212, 212, 212, 1);
      top:-40px;
      right:-32px;
    }
    #verify_xbox{
      width: 54px;
      height: 40px;
      text-align: center;
      line-height: 40px;
      font-size: 14px;
      color:#fff;
      position: absolute;
      background: #7BBB55;
    }
    #btn{
      cursor: pointer;
      width: 54px;
      height: 40px;
      background-color: rgba(255, 255, 255, 1);
      border: solid 1px rgba(212, 212, 212, 1);
      float: right;
    }
    .continue{
      width: 120px;
      height: 40px;
      background-color: rgba(212, 212, 212, 1);
      margin: 0 70px;
      border: none;
      color: #302f41;
      font-size: 16px;
    }
    .continue:hover{
      background-color: rgba(235, 54, 38, 1);
      color: #ffffff;
    }
    img {
      max-width: 100%;
    }
  </style>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value=""/>
<div class="header">
  <h2 style="color: #F2F2F2; margin-left: 30px;margin-top:-5px;font-weight: 600">青 年 无 忧 网  后 台 管 理 系 统</h2>
</div>
<div class="loginWraper">
  <div id="loginform" class="loginBox">
    <form class="form form-horizontal" action="${pageContext.request.contextPath}/admin/toLogin" method="post">



      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="" name="name" type="text" placeholder="账户" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="" name="password" type="password" placeholder="密码" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <%--<div class="formControls col-xs-8 col-xs-offset-3">--%>
        <%--<input class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">--%>
        <%--<img src=""> <a id="kanbuq" href="javascript:;">看不清，换一张</a> </div>--%>

        <div class="verify">

          <span> </span>

          <div id="verify_box">
            <div id="verify_xbox" >
              <div id="btn">
                <img src="/image/lllllll.png"/>
              </div>
            </div>
            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;按住滑块，拖动到最右边
          </div>

        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <label for="online">
            <input type="checkbox" name="online" id="online" value="">
            使我保持登录状态</label>
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input name="" type="submit" class="btn btn-success radius size-L"
                 value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
          <input name="" type="reset" class="btn btn-default radius size-L"
                 value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
        </div>


      </div>
        <p class="formControls col-xs-8 col-xs-offset-3" style="color: red">${message}</p>
        <%--<span class="formControls col-xs-8 col-xs-offset-3" style="color: red">${message}</span>--%>
    </form>
  </div>
</div>
<div class="footer">Copyright 青年无忧网</div>
<script type="text/javascript" src="/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="/js/slide.js"></script>

</body>
</html>