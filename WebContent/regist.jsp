<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="css/regist.css" />
		<style type="text/css">
			*{
				margin:0px;padding: 0px;
			}
		</style>
	</head>
	<body>
		<div class="regist">
			<h1>会员注册</h1>
		<form class="form-horizontal" action="regist" method="post" style="margin-top:5px;" >
			
			<label style="float: left;margin-left: 70px;margin-top: 30px;margin-right: 30px;font-family: 华文新魏;" >头像</label>
			 <div class="head">
			<img src="image/<%=request.getAttribute("123")%>" class="round_icon"/>
			 </div>
			<%System.out.print(request.getAttribute("123")); %>
			<%System.out.print(32453); %>
			<div style="clear:both"></div>
			 <div class="form-group" style="margin-top: 25px;">
			    <label >用户名</label>
			      <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名">
			    </div>
			   <div class="form-group">
			    <label >密码</label>
			      <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="请输入密码">
			  </div>
			   <div class="form-group">
			     <label>邮件</label>
			      <input type="password" class="form-control" id="confirmpwd" name="email" placeholder="请输入Email">
			  </div>
			  <div class="form-group">
			     <label>年龄</label>
			      <input type="password" class="form-control" id="confirmpwd" name="age" placeholder="请输入年龄">
			  </div>
		
			  <div class="form-group opt">  
			  <label >性别</label>  
			  
			    <label class="radio-inline">
			  <input type="radio" name="sex" id="inlineRadio1" value="1"> 男
			</label>
			<label class="radio-inline">
			  <input type="radio" name="sex" id="inlineRadio2" value="0"> 女
			</label>
		
			 </div>		
			    <div class="deng">
			    	<div class="one1"></div>
			    	<input type="submit"  width="100" value="注册" name="submit" >
			    </div>
			</form>
			</div>
			
			  <div class="bottom">
            <div class="one">
                &nbsp;&nbsp;&nbsp;&nbsp;总有那样一群人，走过沧桑，冷静理智。对他们而言，爱或离开，念旧或是新生，忘记或是痴缠，多是源于不同经历后，特定情境下，一场慎重的权衡——对方从哪里来，要到那里去，而自己，可愿同路，可能相扶？
            </div>
            <div class="two">
                制作人：刘小勇   王送雨     ||  联系电话：138xxxxxxxx 或 139xxxxxxxx
            </div>
        </div>
			
			
			
			
		
	</body>
</html>
