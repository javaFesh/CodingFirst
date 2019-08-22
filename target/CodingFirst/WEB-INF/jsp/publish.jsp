<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <%--<meta charset="UTF-8" />--%>
    <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8”>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>青年无忧网</title>
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css"/>
    <link rel="stylesheet" href="/css/head.css"/>
    <link rel="stylesheet" href="/css/index.css">

    <style>
        body {
            /*background: #EAEAEA !important;*/

            font-family: "Avant Garde", "Tahoma", "Microsoft YaHei", "SimHei" !important;
            /*color: #999999 !important;*/
            color: white !important;
            font-weight: bold !important;
            font-size: 13px !important;
            /*background: red; !important;*/
            background: url("/image/timg.gif") 100% 100% no-repeat;
            background-size: cover;
        }

        .left {
            float: left;

        }

        textarea, input, select {
            background-color: transparent !important;
        }
        option{
            background-color: black;
        }

        input ,textarea{
            color: white !important;
            font-size: 13px;
        }
    </style>
</head>
<body id="body1">
<!-- 导航 -->
<%@ include file="../head1.jsp" %>


<div class="context">
    <h3 style="text-align: center;margin-top: 50px">发布职位</h3>
    <form action="/job/doInsert?currentPage=1" method="post" onsubmit=" publishWork()">
        <input type="hidden" name="userId" value="1">
        <div class="form-group">
            <label for="talk_miaoshu">公司名称：</label>
            <input type="text" class="form-control" id="companyName" name="companyName"
                   placeholder="请输入公司名称......">

        </div>

        <div class="form-group">
            <label for="talk_miaoshu">职&nbsp;位&nbsp;名：</label>
            <input type="text" class="form-control" id="workName" name="workName"
                   placeholder="请输入职位名称......">
        </div>
        <%--<div class="form-group">--%>
            <%--<label for="talk_miaoshu">城市：</label>--%>
            <%--<input type="text" class="form-control" id="workCity" name="workCity"--%>
                   <%--placeholder="请输入城市名称......">--%>
        <%--</div>--%>
        <div class="form-group">
            <label for="talk_miaoshu">工作地点：</label>
            <input type="text" class="form-control" id="workplace" name="workplace"
                   placeholder="请输入工作地点......">
        </div>

        <div class="form-group left">
            <label for="editor_id">职位类型:</label>
            <select name="workTypeId" id="" style="width: 70px; height: 30px">
                <c:forEach items="${listWorkType}" var="item">
                    <option  value="${item.id}" <c:if test="${item.id==2}">selected="selected"</c:if>>
                            ${item.attributeDetailsName}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group left">
            <label for="editor_id">职位性质:</label>
            <select name="workNatureId" id="" style="width: 70px; height: 30px">
                <c:forEach items="${listWorkNature}" var="item">
                    <option value="${item.id}" <c:if test="${item.id==27}">selected="selected"</c:if>>
                            ${item.attributeDetailsName}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group left">
            <label for="editor_id">薪 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;资:</label>
            <select name="workSalaryId" id="" style="width: 70px; height: 30px">
                <c:forEach items="${listWorkSalary}" var="item">
                    <option value="${item.id}" <c:if test="${item.id==8}">selected="selected"</c:if>>
                            ${item.attributeDetailsName}
                    </option>
                </c:forEach>

            </select>
        </div>

        <div class="form-group left">
            <label for="editor_id">工作经验:</label>
            <select name="experienceId" id="" style="width: 70px; height: 30px">
                <c:forEach items="${listExperience}" var="item">
                    <option value="${item.id}" <c:if test="${item.id==15}">selected="selected"</c:if>>
                            ${item.attributeDetailsName}
                    </option>
                </c:forEach>
            </select>

        </div>
        <div class="form-group left">
            <label for="editor_id">学历要求:</label>
            <select name="degreeId" id="" style="width: 70px; height: 30px">
                <c:forEach items="${listDegree}" var="item">
                    <option value="${item.id}" <c:if test="${item.id==21}">selected="selected"</c:if>>
                            ${item.attributeDetailsName}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group left">
            <label for="editor_id">城 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;市:</label>
            <select name="workCity" id="" style="width: 70px; height: 30px">
                <option value="北京">北京</option>
                <option value="上海">上海</option>
                <option value="广州">广州</option>
                <option value="深圳">深圳</option>
                <option value="杭州">杭州</option>
                <option value="成都">成都</option>
                <option value="南京">南京</option>
                <option value="西安">西安</option>
                    
              
            </select>
            </div>
        <div class="form-group " style="align-content: center; clear: left">
            <label for="editor_id">职位福利:</label>
            <textarea class="form-control" id="editor_id" name="workWelfare" cols="100" rows="5"
                      placeholder="请输入职位福利......"></textarea>
        </div>
        <div class="form-group" style="align-content: center">
            <label for="editor_id">职位简介:</label>
            <textarea class="form-control" id="editor_id" name="workDetails" cols="100" rows="5"
                      placeholder="请输入职位简介......"></textarea>
        </div>
        <div class="form-group" style="align-content: center">
            <label for="editor_id">岗位职责:</label>
            <textarea class="form-control" id="editor_id" name="workDuty" cols="100" rows="5"
                      placeholder="请输入岗位职责......"></textarea>
        </div>
        <div class="form-group" style="align-content: center">
            <label for="editor_id">岗位要求:</label>
            <textarea style="background: transparent;" class="form-control" id="editor_id" name="workAsk" cols="100"
                      rows="5"
                      placeholder="请输入岗位要求......"></textarea>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-success btn-lg" type="submit" value="发布职位" onclick=" return publishWork()"/>
            <%--<button  onclick="publishWork()">测试</button>--%>

        </div>
    </form>

</div>


<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
<script src="/js/jquery.fullPage.min.js"></script>
<script src="/js/index_slick.js"></script>
<script src="/js/swiper.min.js"></script>
<script src="/js/index.js"></script>

<script>
    function publishWork() {

        if (document.getElementById("companyName").value == "") {
            alert("公司名称 是必填项，不能为空哦！");
            document.getElementById("companyName").focus();
            return false;
        } else if (document.getElementById("workName").value == "") {
            alert("职位名称 是必填项，不能为空哦！");
            document.getElementById("workName").focus();
            return false;
        } else if (document.getElementById("workCity").value == "") {
            alert("工作城市 是必填项，不能为空哦！");
            document.getElementById("workCity").focus();
            return false;
        } else if (document.getElementById("workCity").value == "") {
            alert("工作城市 是必填项，不能为空哦！");
            document.getElementById("workCity").focus();
            return false;
        }

        alert("职位发布成功,请等待审核");
        return true;
    }
</script>
</body>
</html>
