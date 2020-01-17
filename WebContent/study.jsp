<%@page import="java.util.List"%>
<%@page import="com.han.entity.Invitation"%>
<%@page import="com.han.impl.InvitationDaoImpl"%>
<%@page import="com.han.dao.InvitationDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/title.css" />
		<link rel="stylesheet" href="css/comment.css" />
		<style type="text/css">
			*{
				margin: 0;
			    padding:0px;
                font-family: 华文新魏;	    
			}
			.content2{
				width: 370px;
				padding: 10px;
				margin: 10px;
				color: #FFFFFF;
				background:#000000;
				float: left;
			}
			.content2 li{
				list-style-type: none;
				height: 25px;
				width: 200px;
				padding: 10px;
				line-height: 30px;
			}
		</style>
	</head>
	<body style="background: #282828;">
		<div class="title" style="background: rgb(0,0,0,0.8);">
			<div class="logo"></div>
			<div class="menu">
				<a href="index.jsp"><div >主页</div></a>
				<div style="color:#f99d14; ">书斋</div> 
				<a href="donamic.jsp"><div >动态</div></a>
				<a href="cartoon.jsp"><div>动画</div></a>
				<a href="game.jsp"><div>游戏</div></a>
			</div>
			<div class="head">
			<%System.out.print(request.getSession().getAttribute("head_portrait")) ;%>
				<img src="image/<%=request.getSession().getAttribute("head_portrait") %>" class="round_icon" />
			    <div class="setting">
			    	<div class="aaa">
			    		此间少年
			    	</div>
			    </div>
			</div>
		</div>
		
			<div class="study">
			
				<div class="content1">
					<a href="comment_send.jsp"><div class="send">发布书评</div></a>
					<form action="study" method="post">
					<div class="seek">
						<input type="text" class="form-control" name="seek-content" id="seek-content" placeholder="请输入作者或书名发布人" />
						<input type="submit" name="seek" id="seek" value="搜索" class="form-control1" />
					</div>
					</form>
					<div style="clear:both"></div>
					<ul>
					 <% List <Invitation> list;
					 InvitationDao dao = new InvitationDaoImpl();
					   String s = (String) request.getAttribute("seekconnect");
					   if(s==null){
						    list = dao.findAllInvitation();
					   }else{
					  list = dao.findInvitationAUB(s);
					   }
		                
		                for(Invitation invitation:list) {
		               %>
						<li>
							<div class="cont"><%=invitation.getConnect() %></div>
							<div class="cins">
								<div class="bookname">《<%=invitation.getBookname() %>》</div>
								<div class="author">—— <%=invitation.getAuthor() %></div>
							</div>
							<div class="cins">
								<div class="cirtic">发布人：<%=invitation.getUsername() %></div>
							<div class="cin"><img src="img/comment.png" /> </div>
							<div class="cin">123</div>
							<div class="cin"><img src="img/praise.png" /> </div>
							<div class="cin"><%=invitation.getSum() %></div>
							<div style="clear:both"></div>
							</div>
						</li>
						<%} %>
					</ul>
				</div>
				<div class="content2">
					<h3>推荐作者</h3>
					<ul>
					<% List<String> list1 = dao.findAuthor();
						for(int i=0;i<list1.size();i++) {
						%>
						<li><%=list1.get(i) %></li>
						<%} %>
						
						
					</ul>
				</div>
				<div class="content2">
					<h3>推荐图书</h3>
					<ul>
					<% List<String> list2 = dao.findBookname();
						for(int i=0;i<list2.size();i++) {
						%>
						<li><%=list2.get(i) %></li>
						<%} %>
						
						
					</ul>
				</div>
				<div style="clear:both"></div>
			</div>
	
	</body>
</html>
