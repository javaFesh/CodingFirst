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
                location.href = "/houtai/houtaiTypeDelete?id=" + id;
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
                <th>子类</th>
                <th>父类</th>
                <th>操作</th>
            </tr>
            <tbody>
            <c:forEach items="${sessionScope.pb.list}" var="t" varStatus="s">
                <tr>
                    <td>${s.count}</td>
                    <td>${t.type}</td>
                    <td>${t.fatherType}</td>
                    <td>
                            <%--<c:if test="${sessionScope.uesr.name}eq${t.actor}">--%>
                            <%----%>
                            <%--</c:if>--%>

                            <%--<a class="btn btn-default btn-sm"--%>
                            <%--href="${pageContext.request.contextPath}/findBlogServlet?id=${t.q_id}">修改</a>&nbsp;--%>
                        <a
                                class="btn btn-success btn-sm"
                                href="javascript:delectBlogBiaoQian(${t.id});">删除

                                <%--href="${pageContext.request.contextPath}/DelSelectedBlogBiaoQianServlet?id=${t.q_id}">删除--%>
                        </a>

                    </td>
                </tr>

            </c:forEach>
            </tbody>

        </table>
    </form>
    <div style="clear:right;float: left">
        <form class="form-inline" action="${pageContext.request.contextPath}/houtai/typeAdd"
              method="post">
            <div class="form-group">

                <label for="exampleInputName2">添加子类:</label>
                <input type="text" name="type" class="form-control" id="exampleInputName2">
            </div>
            <div class="form-group">

                <select name="fatherType" id="" style="width: 102px; height: 35px">
                    <%--<c:forEach items="${typeList}" var="t" varStatus="s">--%>
                        <%--<option value="${t.fatherType}">${t.fatherType}</option>--%>
                    <%--</c:forEach>--%>
                        <option value="">-请选择父类-</option>
                        <option value="编程语言">编程语言</option>
                        <option value="算法设计">算法设计</option>
                        <option value="数据结构">数据结构</option>
                        <option value="数学和逻辑">数学和逻辑</option>
                        <option value="计算机基础">计算机基础</option>
                        <option value="软件开发">软件开发</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">添加</button>
        </form>
    </div>
    <%--<div style="clear:right;float: right;margin-right: 5px">--%>
        <%--&lt;%&ndash;<a class="btn btn-primary" href="addTalk.jsp">添加留言</a>&ndash;%&gt;--%>
        <%--<a class="btn btn-primary" href="${pageContext.request.contextPath}/blog/tiaoZhuan2" id="delSelectedAll">笔试题管理</a>--%>

    <%--</div>--%>
    <div style="clear :both;">
        <nav aria-label="Page navigation">
            <ul class="pagination ">
                <li>

                    <c:if test="${sessionScope.pb.currentPage-1>0}">
                        <a href="${pageContext.request.contextPath}/houtai/selectAllTypeHouTai?currentPage=${sessionScope.pb.currentPage-1}"
                           aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>
                    <c:if test="${sessionScope.pb.currentPage-1<=0}">
                        <a href="${pageContext.request.contextPath}/houtai/selectAllTypeHouTai?currentPage=1"
                           aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>

                </li>

                <c:forEach begin="1" end="${sessionScope.pb.totalPage}" var="i">
                    <li class=""><a
                            href="${pageContext.request.contextPath}/houtai/selectAllTypeHouTai?currentPage=${i}">${i}</a>
                    </li>
                </c:forEach>

                <li>
                    <c:if test="${sessionScope.pb.currentPage-sessionScope.pb.totalPage<0}">
                        <a href="${pageContext.request.contextPath}/houtai/selectAllTypeHouTai?currentPage=${sessionScope.pb.currentPage+1}"
                           aria-label="Previous">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </c:if>
                    <c:if test="${sessionScope.pb.currentPage-sessionScope.pb.totalPage==0}">
                        <a href="${pageContext.request.contextPath}/houtai/selectAllTypeHouTai?currentPage=${sessionScope.pb.totalPage}"
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
