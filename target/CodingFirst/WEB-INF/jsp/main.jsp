<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="X-UA-Compatible" content="ie=edge" />

	<%--<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>--%>
	<%--<script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>--%>
	<%--<link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">--%>

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
	<!-- 导航 -->
	<%--<header class="header" style="background-color: #343434">--%>
		<%--<div class="container clearfix"> --%>
			<%--<div class="fl left">--%>
				<%--<a href="javascript:void(0)" ><img src="${pageContext.request.contextPath}/image/logo.gif" alt="" class="img1" /></a>--%>
				<%--<a href="javascript:void(0)" ><img src="${pageContext.request.contextPath}/image/logo.gif" alt="" class="img2" /></a>--%>
			<%--</div>--%>
			<%--<div class="fr nav"> --%>
				<%--<ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">--%>
					<%--<li class="active">--%>
						<%--<a href="/user/goNumberOne?id=${loginUser.userId}">首页</a>--%>
					<%--</li>--%>
					<%--<li class="dropdown">--%>
						<%--<a href="javascript:void(0)">--%>
							<%--笔试--%>
						<%--</a>--%>
						<%--<div class="dropdown_menu">--%>
							<%--<a href="#">题库</a>--%>
							<%--<a href="#">模拟答卷</a>--%>
							<%----%>
						<%--</div>--%>
					<%--</li>--%>
					<%--<li class="dropdown">--%>
						<%--<a href="javascript:void(0)">面试</a>--%>
						<%--<div class="dropdown_menu">--%>
							<%--<a href="/user/getInterviewForUserClassify">面试真题</a>--%>
							<%--<a href="/faceSkill/showAllInterviewSkillForUser">面试技巧</a>--%>
							<%--<a href="#">HR面试</a>--%>
						<%--</div>--%>
					<%--</li>--%>
					<%--<li class="dropdown">--%>
						<%--<a href="javascript:void(0)">找工作</a>--%>
						<%--<div class="dropdown_menu">--%>
							<%--&lt;%&ndash;<a href="#">找工作</a>&ndash;%&gt;--%>
							<%--&lt;%&ndash;<a href="#">发布职位</a>&ndash;%&gt;--%>
							<%----%>
						<%--</div>--%>
					<%--</li>--%>
					<%--<li>--%>
						<%--<a href="javascript:void(0)">讨论区</a>--%>
					<%--</li>--%>
					<%--<li class="dropdown">--%>

						<%--<a href="javascript:void(0)"><div style="width: 46px;height: 47px;background-image: url('../../image/sctp.png');border-radius: 25px">--%>
							<%--<c:if test="${fileImag != null}">--%>
								<%--<img src="../../userPicture/${fileImag}" alt="" style="width: 44px;height: 45px;border-radius: 25px">--%>
							<%--</c:if>--%>
						<%--</div></a>--%>
						<%--<div class="dropdown_menu">--%>
							<%--<a href="/user/personalExperience?id=${loginUser.userId}">个人简历</a>--%>
							<%--<a href="/user/hitExperience?id=${loginUser.userId}">已投企业</a>--%>
							<%--&lt;%&ndash;<a href="/user/getAllmyTiezi?id=${loginUser.userId}">我的帖子</a>&ndash;%&gt;--%>
							<%--&lt;%&ndash;<a href="/user/getAllmyComment?id=${loginUser.userId}">我的评论</a>&ndash;%&gt;--%>
							<%--<a href="#">我的帖子</a>--%>
							<%--<a href="#">我的评论</a>--%>
							<%--<a href="/user/finishedWork?id=${loginUser.userId}">已做题目</a>--%>
							<%--<a href="/imageFile/selectImageFile?id=${loginUser.userId}">个人设置</a>--%>
							<%--<a href="../../index.jsp">退出</a>--%>
						<%--</div>--%>
					<%--</li>--%>

				<%--</ul>--%>
			<%--</div>--%>
			<%--<a href="javascript:void(0)" id="navToggle">--%>
	            <%--<span></span>--%>
	        <%--</a>--%>
		<%--</div>--%>
	<%--</header>--%>
	<!--移动端的导航-->
	<%@ include file="head.jsp" %>
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