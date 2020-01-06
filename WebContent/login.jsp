<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入</title>
<link rel="stylesheet" href="css/login.css" />
		<style type="text/css">
			*{
				margin: 0px;
				padding:0px;
				}
					
		</style>
</head>
	<body>
		<div class="login">
			<form action="login" method="post">
				<h1>用户登录</h1>
			<div class="form-group">
				
				    <label for="username" class="from-label">用户名:</label>
				    <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名">
		 
			</div>	
			
			<div style="clear:both"></div>
			
			
			<div class="form-group">
				    <label for="username" class="from-label">密码:</label>
				    <input type="text" class="form-control" name="password" id="password" placeholder="请输入密码">
			</div>	
				   <div class="form-group group">
				
				      <div class="checkbox">
				        <label>
				          <input type="checkbox"> 自动登录
				        </label>
				        </div>
				        <div class="checkbox">
				        <label>
				          <input type="checkbox"> 记住密码
				        </label>
				        </div>
				        <div class="kong"></div>
				  </div>
			<div style="width: 100px; height: 20px; color: #FFFFFF;"> </div>
			
			<div class="form-group1">
				    <div class="deng">
				    <input type="submit"  width="100" value="登录" name="submit" border="0">
				    </div>
				    <a href="regist.html">
				    <div class="deng">
				    <input type="button"  width="100" value="注册" name="submit" border="0">
				    </div></a>
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
