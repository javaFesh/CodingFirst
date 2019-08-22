
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- HTML5文档-->
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html >
<head>
    <style>
        *, html, p {
            background-color: rgb(246,246,246);
            margin: 0;
            padding: 0;
        }
    </style>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%--<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->--%>
    <title>修改文章</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="${pageContext.request.contextPath}//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <script charset="utf-8" src="/kindeditor/kindeditor-all.js"></script>
    <script charset="utf-8" src="/kindeditor/lang/zh-CN.js"></script>
    <script>
        KindEditor.ready(function(K) {
            window.editor = K.create('#editor_id');
        });
    </script>
</head>
<body>
<div >
    <center><h3>修改题目</h3></center>
    <form action="${pageContext.request.contextPath}/houtai/houtaiWritingUpdate" method="post">
        <div class="form-group">
            <label for="talk_miaoshu">题目标题：</label>
            <input type="text" class="form-control" id="talk_miaoshu" name="title" placeholder="请输入题目标题......"
                   value="${writing1.title}">
        </div>
        <div>
            <input type="hidden" name="id" value="${writing1.id}">
        </div>

        <div class="form-group" style="align-content: center">
            <label for="editor_id">题目答案：</label>
            <textarea class="form-control" id="editor_id" name="answer" cols="100" rows="17"
                      placeholder="请输入题目答案......">${writing1.answer}</textarea>

        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交信息"/>
            <%--<input class="btn btn-default" type="reset" value="重置"/>--%>
            <%--<a href="${pageContext.request.contextPath}/findBlogByPageServlet" class="btn btn-default">返回文章列表</a>--%>
        </div>
    </form>
</div>
</body>
</html>