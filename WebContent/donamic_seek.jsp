<%@page import="com.han.entity.Photo"%>
<%@page import="java.util.List"%>
<%@page import="com.han.impl.PhotoDaoImpl"%>
<%@page import="com.han.dao.PhotoDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/donamic_seek.css"/>
        <style type="text/css">
     
        	*{
        		margin: 0px;
        		padding: 0px;
        	}
        </style>
    </head>
    <body>
    	<div class="donamic">
    		<form method="post" action="donamic_seek">
    		<div class="donamic_one">发布动态</div>
    		<div class="donamic_two">
    			<textarea name="donamic_connect" id = "donamic_connect" placeholder="请输入内容"></textarea>
    			<ul >
    			<%
    			PhotoDao dao = new PhotoDaoImpl();
    			int k=(int)request.getSession().getAttribute("number");
    			   List<Photo> list = dao.findAllPhoto(k+1);
    			 
    			   for(Photo photo:list){
    			%>
    				<li><img src="image/<%=photo.getPhoto()%>"/></li>
    				<%} %>
    			</ul>
    			<div style="clear: both;"></div>
    			
    		</div>
    		<a href="donamic_addPhoto.jsp"><input type="button" value="添加图片"  class="add"/></a>
    			<div style="clear: both;"></div>
    		<input type="submit" value="发布" name="donamic_seek" id="doname_seek"  class="seek"/>
    		</form>
    		
    	</div>
 	</body>
</html>