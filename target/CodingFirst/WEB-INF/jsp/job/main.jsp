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
	<style type="text/css">


        #a1{
            color: black;
			text-decoration: none;
			border-radius: 5px;
        }

        #a1:hover{
            color: mediumseagreen;
        }

        button{
            background-color: ghostwhite;
            border-radius: 5px;
        }

        #button1:hover{
            color: mediumseagreen;
        }
		body{

			font-family: "Avant Garde","Tahoma","Microsoft YaHei","SimHei" !important;
			/*color: #999999 !important;*/
            color: white !important;
			font-weight: bold !important;
			font-size:  12px !important;
			background: url("/image/4.jpg") 100% 100% no-repeat;
			background-size: cover;
		}
	</style>
</head>
<body id="body1" style="background-color: #EAEAEA; !important; " >
<%@ include file="../head.jsp" %>

	<div style="clear: both;  margin-left: 240px;margin-top: 80px;  width: 60% ">

		<form class="form-inline" action="/job/selectWorkByWorkName?currentPage=1"
			  method="post">
			<div class="form-group">

				<input type="text" name="workName" class="form-control" id="exampleInputName2" placeholder="请输入职位.....">
			</div>
			<div class="form-group">

			</div>
			<button type="submit" class="btn btn-success">搜索</button>
		</form>
	</div>

	<%-- 发布职位 border: 1px solid; --%>

	<%-- 职位要求 条件 border: 1px solid; --%>
	<div style="width: 60%; float: left; margin-left: 240px;  height: 100%; border: 1px solid rgba(255,255,255,0.3);background-color:  rgba(255,255,255,0.3)">
        <form action="/job/selectByWorkEverything?currentPage=1" method="post">
		<div style="clear: left;float: left; margin-top: 10px">

			<ul>
                <span>工作地点：</span>
                <input id="button1" type="radio" name="workCity" value="全国" > 全国 &nbsp;
                <input id="button1" type="radio" name="workCity" value="北京" > 北京 &nbsp;
                <input id="button1" type="radio" name="workCity" value="上海" > 上海 &nbsp;
                <input id="button1" type="radio" name="workCity" value="广州" > 广州 &nbsp;
                <input id="button1" type="radio" name="workCity" value="深圳" > 深圳 &nbsp;
                <input id="button1" type="radio" name="workCity" value="杭州" > 杭州 &nbsp;
                <input id="button1" type="radio" name="workCity" value="成都" > 成都 &nbsp;
                <input id="button1" type="radio" name="workCity" value="南京" > 南京 &nbsp;
                <input id="button1" type="radio" name="workCity" value="西安" > 西安 &nbsp; <br> <br>

                <span>工作经验：</span>
                <c:forEach items="${listExperience}" var="item">
                    <input type="radio" value="${item.id}" name="experienceId">
                    ${item.attributeDetailsName}
                </c:forEach>
                <br> <br>

                <span>学历要求：</span>
                <c:forEach items="${listDegree}" var="item">
                    <input type="radio" value="${item.id}" name="degreeId">
                    ${item.attributeDetailsName}
                </c:forEach>
                <br> <br>

                <span>职位类型：</span>
                <c:forEach items="${listWorkType}" var="item">
                    <input type="radio" value="${item.id}" name="workTypeId">
                    ${item.attributeDetailsName}
                </c:forEach>
			</ul>
		</div>

        <div style="clear:both; float: left; margin-left: 0px;">
            <ul>
                <span style="float: left;">工作性质：</span>
                <c:forEach items="${listWorkNature}" var="item">
                    <input type="radio" value="${item.id}" name="workNatureId">
                    ${item.attributeDetailsName}
                </c:forEach>
            </ul>
        </div>

        <div style="clear: both; float: left; margin-left: 0px">
            <ul>
                <span style="float: left; ">月薪：</span>
                <c:forEach items="${listWorkSalary}" var="item">
                    <input type="radio" value="${item.id}" name="workSalaryId">
                    ${item.attributeDetailsName}
                </c:forEach>
            </ul>
        </div>

        <div style="clear: both;float: left; margin-top: 10px">
            <ul>
                <span>排序方式：</span>
                <input  class="btn btn-success" type="submit"  value="搜索">
                <a  class="btn btn-success" href="/job/selectWorkByCreateTime?currentPage=1&name=最新" id="a1">最新</a>
            </ul>
        </div>


        </form></div>


	<%-- 查询出来的职位 border="1px" --%>
	<table  style="clear: both;float: left; height:400px;margin-left: 240px; margin-top: 10px; border: 1px solid rgba(255,255,255,0.3);background-color:  rgba(255,255,255,0.3)"  width="60%;" >
		<c:forEach items="${pageBean.pageData}" var="item">
			<tr>
				<td style="width: 50%">
					<a href="/job/selectJobById?id=${item.id}" id="a1" style="background-color: #f9f9f9"><span style="color: mediumseagreen">${item.workName}</span></a>
					<span style="color: mediumseagreen">[</span><span style="color: mediumseagreen">${item.workCity}</span><span style="color: mediumseagreen">]</span>
						${item.createTime}发布 <br>
						${item.workSalaryName} &nbsp;&nbsp;&nbsp;&nbsp;${item.experienceName}/${item.degreeName} <br>
						${item.workNatureName}
				</td>

				<td style="width: 50%">
					${item.companyName} <br>
					${item.workWelfare}
				</td>

			</tr>

		</c:forEach>
		<tr>
			<td colspan="2" align="center">
				当${pageBean.getCurrentPage()}/${pageBean.getTotalPage()}页&nbsp;&nbsp;&nbsp;&nbsp;
				<a class="btn btn-success"  href="/job/main?currentPage=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a class="btn btn-success" href="/job/main?currentPage=${pageBean.getCurrentPage()-1}">上一页 </a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a class="btn btn-success"  href="/job/main?currentPage=${pageBean.getCurrentPage()+1}">下一页 </a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a class="btn btn-success"   href="/job/main?currentPage=${pageBean.getTotalPage()}">末页</a>
			</td>
		</tr>
	</table>

    <a href="#body1"><input class="btn btn-warning" value="回到顶部" style="clear: both; float:right; margin-right: 100px; margin-bottom: 10px; "/></a>



	<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
	<script src="/js/jquery.fullPage.min.js"></script>
	<script src="/js/index_slick.js"></script>
	<script src="/js/swiper.min.js"></script>
	<script src="/js/index.js"></script>
	<script>

        function selectWorkNature() {
            var workNatureId=document.getElementById("workNatureId").value;
            parent.document.getElementById('Mainid').src='${ctx}/job/selectWorkByWorkNature?workNatureId='+workNatureId+'&currentPage='+1;
        }

        function selectWorkSalary() {
            var workSalaryId=document.getElementById("workSalaryId").value;
            parent.document.getElementById('Mainid').src='${ctx}/job/selectWorkByWorkSalary?workSalaryId='+workSalaryId+'&currentPage='+1;
        }
	</script>
</body>
</html>