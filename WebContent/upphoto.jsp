<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
   
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>上传图片</title>
        <link rel="stylesheet" type="text/css" href="css/upphoto.css"/>
    </head>
    <body>
    	<form action="upphoto"  enctype="multipart/form-data" method="post">
    		<div class="main">
    			<div class="m">请选择头像文件</div>
    			<input type="file" name="file" multiple="multiple" class="input1">
    			<input type="submit" name="seek"  class="input2">
    		</div>
    		
    	</form>
 	</body>
</html>