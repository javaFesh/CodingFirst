<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 3. 导入bootstrap的js文件 -->

    <link href="${pageContext.request.contextPath}//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <%--<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->--%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <title>Title</title>
    <style>
        td, th {
            text-align: center;
        }

        #form tr:hover {
            background-color: #f5f5f5;
        }

        *, html, body {
            background-color: rgb(246, 246, 246);
        }

        .logintext {
            height: 30px;
            clear: left;
            clear: right;
            font-size: 14px;
            float: right;
        }

    </style>
    <script>
        function delectBlogBiaoQian(id) {
            // alert(id);
            //用户安全提示
            if (confirm("您确定要删除吗？")) {
                //访问路径
                location.href = "/houtai/houtaiTypeDelete1?id=" + id;
            }
        }

    </script>
</head>
<body>
<div>
    <h3 style="text-align: center">分类管理</h3>

    <form id="form" action="#" method="post">
        <table border="1" class="table table-bordered table-hover ">
            <tr class="success">

                <th>编号</th>
                <th>科目</th>
                <th>操作</th>
            </tr>
            <tbody>
            <c:forEach items="${sessionScope.pb.list}" var="t" varStatus="s">
                <tr>
                    <td>${s.count}</td>
                    <td>${t.typeName}</td>
                    <td>
                        <a
                                class="btn btn-success btn-sm"
                                href="javascript:delectBlogBiaoQian(${t.typeId});">删除
                        </a>

                    </td>
                </tr>

            </c:forEach>
            </tbody>

        </table>
    </form>
    <div style="clear:right;float: left">
        <form class="form-inline" action="${pageContext.request.contextPath}/houtai/typeAdd1"
              method="post">
            <div class="form-group">

                <label for="exampleInputName2">添加科目:</label>
                <input type="text" name="typeName" class="form-control" id="exampleInputName2">
            </div>
            <button type="submit" class="btn btn-primary">添加</button>
        </form>
    </div>
    <div style="clear :both;">
        <nav aria-label="Page navigation">
            <ul class="pagination ">
                <li>

                    <c:if test="${sessionScope.pb.currentPage-1>0}">
                        <a href="${pageContext.request.contextPath}/houtai/selectAllTypeOfInterview?currentPage=${sessionScope.pb.currentPage-1}"
                           aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>
                    <c:if test="${sessionScope.pb.currentPage-1<=0}">
                        <a href="${pageContext.request.contextPath}/houtai/selectAllTypeOfInterview?currentPage=1"
                           aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>

                </li>

                <c:forEach begin="1" end="${sessionScope.pb.totalPage}" var="i">
                    <li class=""><a
                            href="${pageContext.request.contextPath}/houtai/selectAllTypeOfInterview?currentPage=${i}">${i}</a>
                    </li>
                </c:forEach>

                <li>
                    <c:if test="${sessionScope.pb.currentPage-sessionScope.pb.totalPage<0}">
                        <a href="${pageContext.request.contextPath}/houtai/selectAllTypeOfInterview?currentPage=${sessionScope.pb.currentPage+1}"
                           aria-label="Previous">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </c:if>
                    <c:if test="${sessionScope.pb.currentPage-sessionScope.pb.totalPage==0}">
                        <a href="${pageContext.request.contextPath}/houtai/selectAllTypeOfInterview?currentPage=${sessionScope.pb.totalPage}"
                           aria-label="Previous">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </c:if>

                </li>
                <span style="font-size: 25px;margin-left: 5px">
                    共${sessionScope.pb.totalCount}条记录,当前${sessionScope.pb.currentPage}页,共${sessionScope.pb.totalPage}页
                </span>
            </ul>
        </nav>
    </div>
</div>
</body>
</html>
