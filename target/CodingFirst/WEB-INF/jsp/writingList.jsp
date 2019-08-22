<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>青年无忧-题库</title>
    <link href="${pageContext.request.contextPath}//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <style type="text/css">
        /*html {*/
            /*background: url("/image/xingkong.jpg") no-repeat;*/
            /*background-size: 100% 100%;*/
        /*}*/

        body {
            /*background-color: rgb(246,246,246);*/
            background: url("/image/listxing.jpeg") no-repeat;
            background-size: 100% 100%;
        }

        td, th {
            text-align: center;
            color: white;
        }

    </style>
</head>
<body>
<%@ include file="head.jsp" %>

<div style="width: 800px;margin: 100px auto ;color: white; font-size: 17px">
    <form class="form-inline" method="post" style="float: right;"
          action="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=1">

        <div class="form-group">
            <label for="exampleInputEmail2">题目:</label>
            <input type="text" name="title" class="form-control" id="exampleInputEmail2" placeholder="请输入要查找的题目......">
        </div>

        <input type="submit" value="查找" class="btn btn-success">
    </form>
    <c:forEach items="${sessionScope.pb.list}" var="b" varStatus="s">

        <%--状态:${b.staticing}--%>
        <c:if test="${b.staticing==0}">
            <a href="${pageContext.request.contextPath}/writing/update?id=${b.id}&staticing=1" class="btn"
               style="background-color: #FFEFDB">一般</a>
        </c:if>
        <c:if test="${b.staticing==1}">
            <a href="${pageContext.request.contextPath}/writing/update?id=${b.id}&staticing=0" class="btn"
               style="background-color:#FFD700">重点</a>
        </c:if>
        <%--类别码model:${id1}--%>
        <%--类别码:${b.typeId}--%>
        编号:${s.count} <br>
        题目:${b.title} <br>
        答案:${b.answer} <br>
        <hr>
    </c:forEach>

    <div>
        <c:if test="${ empty title ||title==null}">
            <nav aria-label="Page navigation">
                <ul class="pagination ">
                    <li>

                        <c:if test="${sessionScope.pb.currentPage-1>0}">
                            <a href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=${sessionScope.pb.currentPage-1}"
                               aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </c:if>
                        <c:if test="${sessionScope.pb.currentPage-1<=0}">
                            <a href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=1"
                               aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </c:if>

                    </li>

                    <c:forEach begin="1" end="${sessionScope.pb.totalPage}" var="i">
                        <li class=""><a

                                href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=${i}">${i}</a>
                        </li>
                    </c:forEach>

                    <li>
                        <c:if test="${sessionScope.pb.currentPage-sessionScope.pb.totalPage<0}">
                            <a href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=${sessionScope.pb.currentPage+1}"
                               aria-label="Previous">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </c:if>
                        <c:if test="${sessionScope.pb.currentPage-sessionScope.pb.totalPage==0}">
                            <a href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=${sessionScope.pb.totalPage}"
                               aria-label="Previous">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </c:if>

                    </li>

                    <c:if test="${sessionScope.pb.totalCount==0}">
                        <span style="font-size: 25px;margin-left: 5px">
                            共${sessionScope.pb.totalCount}条记录
                        </span>
                    </c:if>
                    <c:if test="${sessionScope.pb.totalCount!=0}">
                       <span style="font-size: 25px;margin-left: 5px">
                        共${sessionScope.pb.totalCount}条记录,当前${sessionScope.pb.currentPage}页,共${sessionScope.pb.totalPage}页
                    </span>
                    </c:if>

                </ul>
            </nav>
        </c:if>
        <c:if test="${ not empty title }">
            <nav aria-label="Page navigation">
                <ul class="pagination ">
                    <li>

                        <c:if test="${sessionScope.pb.currentPage-1>0}">
                            <a href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=${sessionScope.pb.currentPage-1}&title=${title}"
                               aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </c:if>
                        <c:if test="${sessionScope.pb.currentPage-1<=0}">
                            <a href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=1&title=${title}"
                               aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </c:if>

                    </li>

                    <c:forEach begin="1" end="${sessionScope.pb.totalPage}" var="i">
                        <li class=""><a

                                href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=${i}&title=${title}">${i}</a>
                        </li>
                    </c:forEach>


                    <li>
                        <c:if test="${sessionScope.pb.currentPage-sessionScope.pb.totalPage<0}">
                            <a href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=${sessionScope.pb.currentPage+1}&title=${title}"
                               aria-label="Previous">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </c:if>
                        <c:if test="${sessionScope.pb.currentPage-sessionScope.pb.totalPage==0}">
                            <a href="${pageContext.request.contextPath}/writing/findWritingByPage?id=${id1}&currentPage=${sessionScope.pb.totalPage}&title=${title}"
                               aria-label="Previous">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </c:if>

                    </li>

                    <c:if test="${sessionScope.pb.totalCount==0}">
                        <span style="font-size: 25px;margin-left: 5px">
                            共${sessionScope.pb.totalCount}条记录
                        </span>
                    </c:if>
                    <c:if test="${sessionScope.pb.totalCount!=0}">
                       <span style="font-size: 25px;margin-left: 5px">
                        共${sessionScope.pb.totalCount}条记录,当前${sessionScope.pb.currentPage}页,共${sessionScope.pb.totalPage}页
                    </span>
                    </c:if>

                </ul>
            </nav>
        </c:if>
    </div>
</div>
</body>
</html>
