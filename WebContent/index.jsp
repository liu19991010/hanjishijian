<%@page import="com.han.impl.LoginDaoImpl"%>
<%@page import="com.han.dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSP Page</title>
    	<link rel="stylesheet" href="css/title.css" />
		<style type="text/css">
			*{
				margin: 0;
			    padding:0px;
                font-family: 华文新魏;	    
			}
			/*   中间轮播图片*/
			.ppt{
				width:100%;
				height:calc(100vh);
				overflow: hidden;
			}
            .ppt ul li {
             list-style-type:none;
             width:100%;
             height:calc(100vh); 
             background-position: center center ;/*璁剧疆鍨傜洿 姘村钩灞呬腑*/
			 background-repeat:no-repeat;/*璁剧疆鑳屾櫙鍥剧墖涓嶅钩閾�*/
			 background-attachment: fixed;/*褰撳唴瀹归珮搴﹀ぇ浜庡浘鐗囬珮搴︽椂锛岃儗鏅浘鐗囩殑浣嶇疆鐩稿浜巚iewport鍥哄畾*/
			 background-size: cover;
         }
         /*右侧选择列表*/
		</style>
	</head>
	<body>
		<div class="title">
			<div class="logo"></div>
			<div class="menu">
				<div style="color: #f99d14;">主页</div>
				<a href="study.jsp"><div>书斋</div></a>
				<a href="donamic.jsp"><div>动态</div></a>
				<a href="cartoon.jsp"><div>动画</div></a>
				<a href="game.jsp"><div>游戏</div></a>
			</div>
			<div class="head">
			<%LoginDao dao = new LoginDaoImpl(); %>
				<img src="image/<%=dao.findHead((String)request.getSession().getAttribute("name")) %>" class="round_icon" />
			    
			</div>
			<div style="clear:both"></div>
			
		</div>
		
		<div class="ppt">
			<ul>
				<li style="background: url(img/a1.png);"></li>
				<li style="background: url(img/a2.png);"></li>
				<li style="background: url(img/a3.png);"></li>
				<li style="background: url(img/a4.png);"></li>
				<li style="background: url(img/a5.png);"></li>
			</ul>
		</div>
	</body>
</html>
<script type="text/javascript" src="js/jquery-3.4.0.min.js"></script>
<script type="text/javascript" src="js/index_bofang.js"></script>
