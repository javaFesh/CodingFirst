<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="X-UA-Compatible" content="ie=edge" />
	<title>青年无忧网</title>
	<link rel="stylesheet" href="/css/reset.css">
	<link rel="stylesheet" type="/text/css" href="css/swiper.min.css"/>
	<link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/animate.css">
	<link rel="stylesheet" href="/css/slick.css">
	<link rel="stylesheet" href="/css/jquery.fullPage.css" />
	<link rel="stylesheet" href="/css/head.css" />
	<link rel="stylesheet" href="/css/index.css">
</head>
<body>
<%@ include file="head.jsp" %>
	<!-- 导航 -->
	<%--<header class="header"> --%>
		<%--<div class="container clearfix"> --%>
			<%--<div class="fl left">--%>
				<%--<a href="javascript:void(0)" ><img src="/image/logo.gif" alt="" class="img1" /></a>--%>
				<%--<a href="javascript:void(0)" ><img src="/image/logo.gif" alt="" class="img2" /></a>--%>
			<%--</div>--%>
			<%--<div class="fr nav"> --%>
				<%--<ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">--%>
					<%--<li class="active">--%>
						<%--<a href="javascript:void(0)">首页</a>--%>
					<%--</li>--%>
					<%--<li class="dropdown">--%>
						<%--<a href="javascript:void(0)">--%>
							<%--笔试--%>
						<%--</a>--%>
						<%--<div class="dropdown_menu">--%>
							<%--<a href="${pageContext.request.contextPath}/type/totiku">题库</a>--%>
							<%--<a href="#">模拟答卷</a>--%>
							<%----%>
						<%--</div>--%>
					<%--</li>--%>
					<%--<li class="dropdown">--%>
						<%--<a href="javascript:void(0)">面试</a>--%>
						<%--<div class="dropdown_menu">--%>
							<%--<a href="#">历年真题</a>--%>
							<%--<a href="#">面试技巧</a>--%>
							<%--<a href="#">HR面试</a>--%>

						<%--</div>--%>
					<%--</li>--%>
					<%--<li class="dropdown">--%>
						<%--<a href="javascript:void(0)">求职</a>--%>
						<%--<div class="dropdown_menu">--%>
							<%--<a href="#">找工作</a>--%>
							<%--<a href="#">发布职位</a>--%>
							<%----%>
						<%--</div>--%>
					<%--</li>--%>
					<%--<li>--%>
						<%--<a href="javascript:void(0)">讨论区</a>--%>
					<%--</li>--%>
					<%--<li>--%>
						<%--<a href="javascript:void(0)">登录</a>--%>
					<%--</li>--%>
					<%--<li>--%>
						<%--<a href="https://www.baidu.com/">注册</a>--%>
					<%--</li>--%>
				<%--</ul>--%>
			<%--</div>--%>
			<%--<a href="javascript:void(0)" id="navToggle">--%>
	            <%--<span></span>--%>
	        <%--</a>--%>
		<%--</div>--%>
	<%--</header>--%>
	<!--移动端的导航-->
	<div class="m_nav">
		<div class="top clearfix">
			<img src="image/closed.png" alt="" class="closed" />
		</div>
		<div class="logo">
			<img src="image/logo.gif" alt="" />
		</div>
		<ul class="ul" data-in="fadeInDown" data-out="fadeOutUp">
			<li class="active">
				<a href="javascript:void(0)">首页</a>
			</li>
			<li class="dropdown">
				<a href="javascript:void(0)">
					笔试
				</a>
				<div class="dropdown_menu">
					<a href="${pageContext.request.contextPath}/type/selectAll">题库</a>
					<a href="${pageContext.request.contextPath}/WEB-INF/jsp/login.html">模拟答卷</a>
				</div>
			</li>
			<li class="dropdown">
				<a href="javascript:void(0)">面试</a>
						<div class="dropdown_menu">
							<a href="#">历年真题</a>
							<a href="#">HR面试</a>
							<a href="#">面试技巧</a>
				</div>
			</li>
			<li class="dropdown">
						<a href="javascript:void(0)">求职</a>
						<div class="dropdown_menu">
							<a href="#">找工作</a>
							<a href="#">发布职位</a>
							
						</div>
					</li>
					<li>
						<a href="javascript:void(0)">讨论区</a>
					</li>
					
					<li>
						<a href="${pageContext.request.contextPath}/houtai/toLogin">登录</a>
					</li>
					
					<li>
						<a href="https://www.baidu.com/">注册</a>
					</li>
					
		</ul>
	</div>
	<!-- 内容 -->
    <div id="index_main" class="index_main">
    	<!--导航-->
        <div class="section section1">
            <div class="index_banner">
                <div class="item">
                    <div class="items scaleBg" style="background-image: url(/image/banner1.jpg);"></div>
                    <div class="inner">
                        <div class="block_txt">
                            <h4> Goodliness,to be continued</h4>
                            <h2><span>青年无忧网,</span>找工作的神器</h2>
							<h3>找工作,就上青年无忧网,让你收获一份特殊的Offer</h3>                            
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="items scaleBg" style="background-image: url(/image/2.jpg);"></div>
                    <div class="inner">
                        <div class="block_txt">
                            <h4> Goodliness,to be continued</h4>
                            <h2>月薪:<span>一万,两万,三万,五万...</span>一切皆有可能</h2>
							<h3>我们有让美好持续发生的愿望，更有让美好持续发生的能力</h3>                            
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="items scaleBg" style="background-image: url(/image/banner2.jpg);"></div>
                    <div class="inner">
                        <div class="block_txt">
                            <h4> </h4>
                            <h2><span>我们面向</span>招聘人群</h2>
							<h3>专科  | 本科  |  硕士  |  博士  |  ...</h3>                            
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="items scaleBg" style="background-image: url(/image/banner3.jpg);"></div>
                    <div class="inner">
                        <div class="block_txt">
                            <h4> </h4>
                            <h2>前程无忧服务方案</h2>
							<h3>全程支持  |  个性服务</h3>                            
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="items scaleBg" style="background-image: url(/image/banner4.jpg);"></div>
                    <div class="inner">
                        <div class="block_txt">
                            <h4>  </h4>
                            <h2><span>世界/国内</span>名企招聘</h2>
							<h3>苹果  |  华为  |  三星     |  腾讯  |  ...</h3>                            
                        </div>
                    </div>
                </div>            
           	</div>
            <div class="left slick_txt">
                <div class="prev slick_arrow"></div>
            </div>
            <div class="right slick_txt">
                <div class="next slick_arrow"></div>
            </div>
            <div class="number">
                <div class="inner clearfix">
                    <span class="active">01</span>
                    <span >02</span>
                    <span >03</span>
                    <span >04</span>
                    <span >05</span>
                </div>
            </div>
        </div>

    </div>
	<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
	<script src="/js/jquery.fullPage.min.js"></script>
	<script src="/js/index_slick.js"></script>
	<script src="/js/swiper.min.js"></script>
	<script src="/js/index.js"></script>
</body>
</html>