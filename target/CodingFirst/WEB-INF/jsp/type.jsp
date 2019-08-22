<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 3. 导入bootstrap的js文件 -->
    <link rel="stylesheet" href="/css/reset.css">
    <link href="${pageContext.request.contextPath}//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/web.css"/>
    <link rel="stylesheet" type="/text/css" href="css/swiper.min.css"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/jquery.fullPage.css"/>
    <link rel="stylesheet" href="/css/head.css"/>
    <link rel="stylesheet" href="/css/index.css">
    <link type="text/css" rel="stylesheet" href="/css/tiku.css"/>
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
    <!--jquery-migrate-1.2.1高版jQuery需要加载，如果您用的是低版本jQuery可以不用调用 -->
    <script src="http://www.jq22.com/jquery/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="/js-tiku/jquery.corner.js"></script>
    <script type="text/javascript" src="/js-tiku/jquery.roundabout.js"></script>
    <script type="text/javascript" src="/js-tiku/jquery.roundabout-shapes.js"></script>
    <script type="text/javascript" src="/js-tiku/tiku.js"></script>
    <title>青年无忧-分类</title>
    <style>

        body, html {
            background: url("/image/4.jpg");
            background-size: 100% 100%;
        }

        .gla_inbox > a {

            font-size: 25px;
        }
        .context-tiku{

            border: 3px solid rgba(255, 255, 255, 0.5) ;
            border-radius: 6px;
        }
    </style>
</head>
<body>
<%@ include file="head.jsp" %>
<div id="gla">
    <div id="gla_box">
        <ul>

            <li>
                <div class="gla_inbox">
                    <!--<p>Picture info 1</p>-->
                    <img src="${pageContext.request.contextPath}/image/01.png"/>
                    <a href="${pageContext.request.contextPath}/type/selectAll?father_type=编程语言">编程语言</a>
                </div>
            </li>

            <li>
                <div class="gla_inbox">
                    <!--<p>Picture info 2</p>-->
                    <img src="${pageContext.request.contextPath}/image/02.png"/>
                    <a href="${pageContext.request.contextPath}/type/selectAll?father_type=算法设计">算法设计</a>
                </div>
            </li>

            <li>
                <div class="gla_inbox">
                    <!--<p>Picture info 3</p>-->
                    <img src="${pageContext.request.contextPath}/image/03.png"/>
                    <a href="${pageContext.request.contextPath}/type/selectAll?father_type=数据结构">数据结构</a>
                </div>
            </li>

            <li>
                <div class="gla_inbox">
                    <!--<p>Picture info 4</p>-->
                    <img src="${pageContext.request.contextPath}/image/04.png"/>
                    <a href="${pageContext.request.contextPath}/type/selectAll?father_type=数学和逻辑">数学和逻辑</a>
                </div>
            </li>

            <li>
                <div class="gla_inbox">
                    <!--<p>Picture info 5</p>-->
                    <img src="${pageContext.request.contextPath}/image/five.png"/>
                    <a href="${pageContext.request.contextPath}/type/selectAll?father_type=计算机基础">计算机基础</a>
                </div>
            </li>
            <li>
                <div class="gla_inbox">
                    <!--<p>Picture info 6</p>-->
                    <img src="${pageContext.request.contextPath}/image/02.png"/>
                    <a href="${pageContext.request.contextPath}/type/selectAll?father_type=软件开发">软件开发</a>
                </div>
            </li>

        </ul>
    </div>
</div>
<div class="context-tiku">
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/type/selectAll?father_type=编程语言">编程语言</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/type/selectAll?father_type=算法设计">算法设计</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/type/selectAll?father_type=数据结构">数据结构</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/type/selectAll?father_type=数学和逻辑">数学和逻辑</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/type/selectAll?father_type=计算机基础">计算机基础</a></p>
    </div>
    <div class="context-pis">
        <p><a href="${pageContext.request.contextPath}/type/selectAll?father_type=软件开发">软件开发</a></p>
    </div>
</div>

</body>
</html>
<%--<embed src="/monidajuan/mp3.mp3" width="0" height="0" border="0" autostart="1" loop="ture">--%>