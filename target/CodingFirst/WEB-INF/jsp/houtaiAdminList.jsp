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

    </style>
    <script>
        function delectBlogBiaoQian(id) {

            if (confirm("您确定要删除吗？")) {
                //访问路径
                location.href = "/admin/deleteAdmin?id=" + id;
            }
        }

    </script>
</head>
<body>
<div>
    <h3 style="text-align: center">管理员管理</h3>

    <form id="form" action="#" method="post">
        <table border="1" class="table table-bordered table-hover ">
            <tr class="success">

                <th>ID</th>
                <th>name</th>
                <th>Role</th>
                <th>操作</th>
            </tr>
            <tbody>
            <c:forEach items="${adminList}" var="t" varStatus="s">
                <tr>
                    <td>${s.count}</td>
                    <td>${t.name}</td>
                    <td>${t.role}</td>


                    <c:if test="${sessionScope.loginAdmin.name=='admin'}">
                        <td>

                            <a
                                    class="btn btn-success btn-sm"
                                    href="javascript:delectBlogBiaoQian(${t.id});">删除
                            </a>

                        </td>
                    </c:if>
                    <c:if test="${sessionScope.loginAdmin.name!='admin'}">
                        <td>

                            <a
                                    class="btn btn-success btn-sm disabled"
                                    href="javascript:delectBlogBiaoQian(${t.id});">不可操作
                            </a>

                        </td>
                    </c:if>

                </tr>

            </c:forEach>
            </tbody>

        </table>
    </form>
    <c:if test="${sessionScope.loginAdmin.name=='admin'}">
        <div style="clear:right;float: left">
            <form class="form-inline" action="${pageContext.request.contextPath}/admin/adminAdd"
                  method="post">
                <div class="form-group">
                    <label for="exampleInputName2">添加管理员账户:</label>
                    <input type="text" name="name" class="form-control" id="exampleInputName2">
                </div>
                <div class="form-group">
                    <label for="exampleInputName6">添加管理员密码:</label>
                    <input type="password" name="password" class="form-control" id="exampleInputName6">
                </div>
                <div class="form-group">
                    <label for="exampleInputName6">角色:</label>
                    <select name="role" id="" style="width: 102px; height: 35px">
                        <option value="管理员">管理员</option>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">添加</button>
            </form>
        </div>


    </c:if>
    <c:if test="${sessionScope.loginAdmin.name!='admin'}">
      <h4 style="color: red">*备注:普通管理员不具备添加管理员功能,请联系超级管理员添加!</h4>
    </c:if>
</div>
</body>
</html>
