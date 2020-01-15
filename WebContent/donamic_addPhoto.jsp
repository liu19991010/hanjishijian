<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/upphoto.css"/>
    </head>
    <body>
    	<form action="donamic_addphoto" method="post" enctype='multipart/form-data'>
    		<div class="main">
    			<div class="m">请选择头像文件</div>
    			<input type="file" name="file" multiple="multiple" class="input1">
    			<input type="submit" name="seek"  class="input2">
    		</div>
    		
    	</form>
 	</body>
</html>