<%@page import="com.han.impl.LoginDaoImpl"%>
<%@page import="com.han.dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>图片拼成的CSS3 3D立方体旋转展示动画特效</title>

<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/title.css" /> 
<style type="text/css">
	*{
				margin: 0;
			    padding:0px;
                font-family: 华文新魏;	    
			}
</style>

</head>
<body style="background: #101010">
		<div class="title" >
			<div class="logo"></div>
			<div class="menu">
				<a href="index.jsp"><div >主页</div></a>
				<a href="study.jsp"><div>书斋</div></a>
				<a href="donamic.jsp"><div>动态</div></a>
				<div style="color: #f99d14;">动画</div>
				<a href="game.jsp"><div>游戏</div></a>
			</div>
			<div class="head">
				<%LoginDao dao = new LoginDaoImpl(); %>
				<img src="image/<%=dao.findHead((String)request.getSession().getAttribute("name")) %>" class="round_icon" />
			    
			</div>
			<div style="clear:both"></div>
			</div>
			<div style="width: 100%; height: 80px;"></div>

<div id="trans3DDemo1">
	<div id="trans3DBoxes1">
		<div class="a1"></div>
		<div class="a2"></div>
		<div class="a3"></div>
		<div class="a4"></div>
		<div class="a5"></div>
		<div class="a6"></div>
	</div>
</div>

<script type="text/javascript" src="js/jquery-3.4.0.min.js"></script>
<script type="text/javascript" src='js/TweenMax.min.js'></script>
<script type="text/javascript" src="js/index.js"></script>


</body>
</html>