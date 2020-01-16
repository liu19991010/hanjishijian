<%@page import="com.han.dao.LoginDao"%>
<%@page import="com.han.impl.LoginDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<head>
<title>2048小游戏</title>
<link rel="stylesheet" href="css/title.css" /> 
<link rel="stylesheet" href="css/game.css" />
<style>
	*{
		font-family: "华文新魏";
	}
	
</style>
</head>


<body>
	<div class="title">
			<div class="logo"></div>
			<div class="menu">
				<a href="index.jsp"><div>主页</div></a>
				<a href="study.jsp"><div>书斋</div></a>
				<a href="donamic.jsp"><div>动态</div></a>
				<a href="cartoon.jsp"><div>动画</div></a>
				<div style="color: #f99d14;">游戏</div>
			</div>
			<div class="head">
			<%LoginDao dao = new LoginDaoImpl(); %>
				<img src="image/<%=dao.findHead((String)request.getSession().getAttribute("name")) %>" class="round_icon" />
			    
			</div>
			</div>
			<div style="clear:both"></div>
			<div style="width: 100%; height: 80px;"></div>
	
	
	
	
<h1 align=center style="margin-top: 100px;">2048小游戏</h1>
<div class="down" onclick="down()">上</div>
<div class="right" onclick="right()">左</div>
<canvas id="drawing" height=200px width=200px  ></canvas>
<div class="left" onclick="left()">右</div>
<div class="up" onclick="up()">下</div>
<script type="text/javascript" src="js/2048.js" ></script>
</body>

</html> 
