<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="X-UA-Compatible" content="ie=edge" />

	<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
	<script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

	<title>青年无忧网</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/swiper.min.css"/>
	<link rel="stylesheet" href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/slick.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.fullPage.css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/head.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">

	<style>
		.header .navbar_nav #li1:after{
			content: "";
			width: 0;
			/*height: 2px;*/
			background: orangered;
			position: absolute;
			bottom: 0;
			left: 0;
			transition: all 0.5s ease 0s;
		}
	</style>
</head>
<body>
<%@ include file="head1.jsp" %>
	<!-- 导航 -->


	<!-- 内容 -->
	<div id="index_main" class="index_main">
		<!--导航-->
		<div class="section section1">
			<div class="index_banner">
				<div class="item">
					<div class="items scaleBg" style="background-image: url('../../image/banner1.jpg');"></div>
					<div class="inner">
						<div class="block_txt">
							<h4> Goodliness,to be continued</h4>
							<h2><span>青年无忧网,</span>找工作的神器</h2>
							<h3>找工作,就上青年无忧网,让你收获一份特殊的Offer</h3>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="items scaleBg" style="background-image: url('../../image/2.jpg');"></div>
					<div class="inner">
						<div class="block_txt">
							<h4> Goodliness,to be continued</h4>
							<h2>月薪:<span>一万,两万,三万,五万...</span>一切皆有可能</h2>
							<h3>我们有让美好持续发生的愿望，更有让美好持续发生的能力</h3>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="items scaleBg" style="background-image: url('../../image/banner2.jpg');"></div>
					<div class="inner">
						<div class="block_txt">
							<h4> </h4>
							<h2><span>我们面向</span>招聘人群</h2>
							<h3>专科  | 本科  |  硕士  |  博士  |  ...</h3>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="items scaleBg" style="background-image: url('../../image/banner3.jpg');"></div>
					<div class="inner">
						<div class="block_txt">
							<h4> </h4>
							<h2>前程无忧服务方案</h2>
							<h3>全程支持  |  个性服务</h3>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="items scaleBg" style="background-image: url('../../image/banner4.jpg');"></div>
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
		<!--<div class="section section2">
            <div class="container">
                <h3>第二页</h3>
            </div>
        </div>
        <div class="section section3">
            <div class="container">
                <h3>第三页</h3>
            </div>
        </div>
        <div class="section section4">
            <div class="container">
                <h3>第四页</h3>
            </div>
        </div>-->
	</div>
	<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.fullPage.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/index_slick.js"></script>
	<script src="${pageContext.request.contextPath}/js/swiper.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/index.js"></script>
</body>
</html>