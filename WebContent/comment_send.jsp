<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/comment_send.css" />
<style type="text/css">
			*{
				margin: 0;
			    padding:0px;
                font-family: 华文新魏;	
                color:#FFFFFF    
			}
		</style>
    </head>
    <body>
    	<div class="connet">
    		<form action="send" method="post">
    			<h1>发布书评</h1>
    			<div class="connect">
    				<label>作者</label>
    				<input type="text" name="send_bookauthor" id="send_bookauthor" placeholder="请输入作者"/>
    			</div>
    			<div style="clear: both;"></div>
    			<div class="connect">
    				<label>书名</label>
    				<input type="text" name="send_bookname" id="send_bookname" placeholder="请输入书名" />
    			</div>
    			<div style="clear: both;"></div>
    			<div class="f">请输入发布内容</div>
    			<textarea  name="send_connect" id="send_connect" placeholder="请输入内容！" ></textarea>
    			<%=request.getAttribute("error") %>
    			<input type="submit" class="f1"  value="提交"/>
    			
    		</form>
    	</div>
 	</body>
</html>