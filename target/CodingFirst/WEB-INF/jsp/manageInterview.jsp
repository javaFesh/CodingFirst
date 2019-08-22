<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/8
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <title>管理员管理面试题</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <style>
        tr:hover {
            background-color: #F0FFFF;
        }
        * {
            margin: 0;
            padding: 0;
        }
        .mainInter {
            width: 100%;
            height: 600px;
            background-color: lightgrey;
        }
        table {
            margin: 0 auto;
        }
        table thead {

        }

        table td{
            text-align: center;

        }
    </style>
    <script>
        function show() {
            document.getElementById("div1").style.visibility = "visible";
            document.getElementById("thead").style.backgroundColor = "black";
            document.getElementById("thead").style.opacity = "0.5";
            document.getElementById("tb1").style.backgroundColor = "black";
            document.getElementById("mainInter").style.backgroundColor = "black";
            document.getElementById("tb1").style.opacity = "0.5";
            document.getElementById("mainInter").style.opacity = "0.5";
        }
        function isAdd(typeId) {
            document.getElementById("interviewTypeId").value = typeId;
        }
        function disdiv1() {
            window.location.href = "/houtai/selectAllInterview?currentPage=1";
        }
    </script>
</head>

<body onblur="disit()">
<div class="mainInter" id="mainInter">
    <h3 align="center">面试真题</h3>
    <div style="background-color: green;text-align: center;width: 100px;height: 30px;margin-left: 90%;padding-top: 5px"><a href="#" onclick="show()" style="text-decoration: none;color: white">增加真题</a></div>
    <table id="tb1"  border="1" style=" border: solid 1px rgba(255,255,255,0.7)">
        <thead id="thead">
        <th>ID</th>
        <th>题目</th>
        <th>答案</th>
        <th>操作</th>
        </thead>
        <tbody>
        <c:forEach items="${pageBean.pageData}" var="list">
            <tr>
                <td style="width: 50px">${list.interviewId}</td>
                <td style="width: 450px">${list.interviewTitle}</td>
                <td style="width: 750px">${list.interviewAnswer}</td>
                <td style="width: 50px">
                    <div style="background-color: limegreen;"><a class="btn btn-success btn-sm" href="/houtai/deleteInterviewById?id=${list.interviewId}" style="text-decoration: none;color: white">删除</a></div>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="4" align="center" style="position: fixed;top: 480px;left: 400px">
                查到 <font color="blue">${pageBean.totalCount}</font>&nbsp;条记录&nbsp;&nbsp;当前${pageBean.getCurrentPage()}/共${pageBean.getTotalPage()}页 &nbsp;&nbsp;
                <a class="btn btn-success btn-sm"href="/houtai/selectAllInterview?currentPage=1">首页</a>
                <a class="btn btn-success btn-sm"href="/houtai/selectAllInterview?currentPage=${pageBean.getCurrentPage()-1}">上一页 </a>
                <a class="btn btn-success btn-sm"href="/houtai/selectAllInterview?currentPage=${pageBean.getCurrentPage()+1}">下一页 </a>
                <a class="btn btn-success btn-sm"href="/houtai/selectAllInterview?currentPage=${pageBean.getTotalPage()}">末页</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<%--/faceSkill/addSkillJump--%>
<div style="z-index: 1;visibility: hidden;width: 40%;height: 80%;background-color: rgba(255,255,255,0.5 );;color: white;position: absolute;top: 20%;left: 28%;border-radius: 6px" id="div1">
    <span style="position: relative;left: 30%;top: 10%;font-size: 20px">增加面试真题</span>
    <form action="/houtai/addInterview" method="post" style="position: relative;left: 30%;top: 5%;">
        <input type="hidden" name="interviewTypeId" id="interviewTypeId" value=""> <br>

        <label for="interviewTitle">面试问题 </label><br><input type="text" id="interviewTitle" name="interviewTitle" placeholder="  请输入面试题" style="width: 250px;height: 40px"> <br>
        <label for="interviewAnswer">面试回答: </label> <br><textarea name="interviewAnswer" id="interviewAnswer" style="width: 250px;height: 150px;overflow: auto" placeholder="  请输入答案"></textarea> <br>
        <input type="reset" value="重置" style="width: 70px;height: 35px;background-color: #007aff;color: white;border: 0">
        <a href="/houtai/selectAllInterview?currentPage=1" style="text-decoration: none"><span style="padding-top:5px;padding-bottom: 5px;padding-left: 10px;padding-right: 10px;background-color: #007aff;color: white;border: 0">取消</span></a>
        <br>点击类型上传： <br>
        <c:forEach items="${pb.list}" var="item">
            <button class="btn btn-primary btn-sm" style="background-color:;border: 0;color: white" onclick="isAdd(${item.typeId})">${item.typeName}</button>
        </c:forEach>
    </form>
</div>
</body>

</html>
