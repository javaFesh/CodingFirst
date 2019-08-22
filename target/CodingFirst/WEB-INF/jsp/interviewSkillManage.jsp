<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/7/14
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理面试技巧</title>
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


        table td{
            margin: 0 auto;
            text-align: center;
          background-color: transparent !important;
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

        function disdiv1() {
            window.location.href = "/faceSkill/showAllInterviewSkillWithPage?currentPage=1";
        }
    </script>
</head>
<body>
    <div class="mainInter" id="mainInter">
        <h3 align="center">面试技巧</h3>
        <div style="background-color: green;text-align: center;width: 100px;height: 30px;margin-left: 90%;padding-top: 5px"><a href="#" onclick="show()" style="text-decoration: none;color: white">增加技巧</a></div>
        <table id="tb1" border="1" style=" border: solid 1px rgba(255,255,255,0.7)">
            <thead id="thead">
                <th>ID</th>
                <th>题目</th>
                <th>回答提示</th>
                <th>操作</th>
            </thead>
            <tbody>
            <c:forEach items="${pageBean.pageData}" var="list">
                <tr>
                    <td style="width: 50px; background-color: transparent !important;">${list.skillId}</td>
                    <td style="width: 450px; background-color: transparent !important;">${list.skillQuestion}</td>
                    <td style="width: 750px ;background-color: transparent !important;">${list.skillAnswer}</td>
                    <td style="width: 50px;background-color: transparent !important;">
                        <div ><a class="btn btn-success btn-sm" href="/faceSkill/deleteInterviewSkillById?id=${list.skillId}" style="text-decoration: none;color: white">删除</a></div>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="4" align="center" style="position: fixed;top: 480px;left: 400px" style="background-color: transparent !important;">
                    查到 <font color="blue">${pageBean.totalCount}</font>&nbsp;条记录&nbsp;&nbsp;当前${pageBean.getCurrentPage()}/共${pageBean.getTotalPage()}页 &nbsp;&nbsp;
                    <a  class="btn btn-success btn-sm" href="/faceSkill/showAllInterviewSkillWithPage?currentPage=1">首页</a>
                    <a class="btn btn-success btn-sm" href="/faceSkill/showAllInterviewSkillWithPage?currentPage=${pageBean.getCurrentPage()-1}">上一页 </a>
                    <a class="btn btn-success btn-sm" href="/faceSkill/showAllInterviewSkillWithPage?currentPage=${pageBean.getCurrentPage()+1}">下一页 </a>
                    <a class="btn btn-success btn-sm"  href="/faceSkill/showAllInterviewSkillWithPage?currentPage=${pageBean.getTotalPage()}">末页</a>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <%--/faceSkill/addSkillJump--%>
    <div style="z-index: 1;visibility: hidden;width: 40%;height: 70%;background-color: rgba(255,255,255,0.5 ); color: white;position: absolute;top: 20%;left: 28%;border-radius: 6px" id="div1">
        <span style="position: relative;left: 30%;top: 10%;font-size: 20px">增加面试技巧</span>
        <form action="/faceSkill/addInterviewSkill" method="post" style="position: relative;left: 30%;top: 5%;">
            <label for="skillQuestion">面试问题 </label><br><input type="text" id="skillQuestion" name="skillQuestion" placeholder="  请输入面试时可能遇到的问题" style="width: 250px;height: 40px"> <br>
            <label for="skillAnswer">面试回答: </label> <br><textarea name="skillAnswer" id="skillAnswer" style="width: 250px;height: 150px;overflow: auto" placeholder="  应该如何回答?"></textarea> <br>
            <input type="submit" value="上传" style="width: 70px;height: 35px;background-color: #007aff;color: white;border: 0">
            <input type="reset" value="重置" style="width: 70px;height: 35px;background-color: #007aff;color: white;border: 0">
            <button style="width: 70px;height: 35px;background-color: #007aff;color: white;border: 0" onclick="disdiv1()">取消</button>
        </form>
    </div>
</body>
</html>
