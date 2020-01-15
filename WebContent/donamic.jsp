<%@page import="com.han.entity.Donamic_reply"%>
<%@page import="com.han.impl.Donamic_replyDaoImpl"%>
<%@page import="com.han.dao.Donamic_replyDao"%>
<%@page import="com.han.entity.Donamic_comment"%>
<%@page import="com.han.impl.Donamic_commentDaoImpl"%>
<%@page import="com.han.dao.Donamic_commentDao"%>
<%@page import="com.han.entity.Photo"%>
<%@page import="com.han.impl.PhotoDaoImpl"%>
<%@page import="com.han.dao.PhotoDao"%>
<%@page import="com.han.impl.LoginDaoImpl"%>
<%@page import="com.han.dao.LoginDao"%>
<%@page import="com.han.entity.Donamic"%>
<%@page import="java.util.List"%>
<%@page import="com.han.impl.DonamicDaoImpl"%>
<%@page import="com.han.dao.DonamicDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8">
        <title>JSP Page</title>
   <link rel="stylesheet" href="css/title.css" />
   <link rel="stylesheet" href="css/donamic.css" />
		<style type="text/css">
			*{
				margin: 0;
			    padding:0px;
			    color: #A0A0A0;
                font-family: 华文新魏;	    
			}
			
			
		</style>
	</head>
	<body>
		<div class="title" style="background: rgb(0,0,0,0.7);">
			<div class="logo"></div>
			<div class="menu">
				<a href="index.html"><div >主页</div></a>
				<a href="study.html"><div>书斋</div></a>
				<div style="color: #f99d14;">动态</div>
				<div>待定</div>
				<div>待定</div>
			</div>
			<div class="head">
				<img src="img/bg.png" class="round_icon" />
			    <div class="setting">
			    	<div>设置</div>
			    	<div>设置</div>
			    	<div>设置</div>
			    	<div>设置</div>
			    	<div>设置</div>
			    </div>
			</div>
			</div>
			<div class="one"><img src="img/bg.png"/></div>
			<div class="name"><%=request.getSession().getAttribute("name") %></div>
			<div class="donamic">
				<img src="img/donamic.png" />
			</div>
			<div class="next">
				<div> 时光清浅，岁月静好</div>
			</div>
			<div class="content">
				<div class="weight">
					<div class="con">
						<a href="donamic_seek.jsp"><input type="submit" name="publish" id="publish" class="publish" value="发布动态" /></a>
					</div>
					<div style="clear:both"></div>
					<ul>
					<% DonamicDao dao = new DonamicDaoImpl();
						LoginDao dao1 = new LoginDaoImpl();
						List<Donamic>list = dao.findAllDonamic();
						request.getSession().setAttribute("number", list.size());
						System.out.print(list.size());
						for(Donamic donamic:list) {
					%>

						<li>
							<div class="weig">
							<div class="weig1">
							<div class="weig1_one"><img src="image/<%=dao1.findHead(donamic.getUsername())%>"/></div>
							<div class="weig1_two">
							<div style="height: 25px;line-height: 25px;font-size: 15px;font-family: 华文新魏;"><%=donamic.getUsername() %></div>
							<div style="margin-left: 5px;"><%=donamic.getTime() %></div>
							</div>
							
							</div>
							<div class="weig2"><%=donamic.getConnect() %></div>
							<div class="weig3">
								<ul>
								<!--690px-->
								<%PhotoDao dao2 = new PhotoDaoImpl();
								  List <Photo> list2 = dao2.findAllPhoto(donamic.getDonamic_id());
								  int i = list2.size();
								  int j=0;
								  if(i>=2&&i<=4){
									  i=332;
									  j=332;
								  }else if(i>=5){
									  i=220;
									  j=220;
								  }else{
									  i=666;
									  j=444;
								  }
								  for(Photo photo:list2){
								%>
								<li style="width: <%=i%>px;">
								<img src="image/<%=photo.getPhoto() %>" style="width: <%=i%>px;height: <%=j%>px;" />
								</li>
								
								<%} %>
								
								
								
								</ul>
								<div style="clear:both"></div>
								</div>
								
								
							</div>
							<div class="discull">
								<ul>
								<%Donamic_commentDao dao3 = new Donamic_commentDaoImpl();
								  List<Donamic_comment> list3 = dao3.findAllDonamic_comment(donamic.getDonamic_id());
								  for(Donamic_comment dona:list3){
								
								
								%>
									<li >
										<div class="a">
											<img src="image/<%=dao1.findHead(dona.getUsername()) %>" />
										</div>
										<div class="b">
											<div><%=dona.getConnect() %></div>
											<div><%=dona.getTime() %></div>
										</div>
										<input type="button" value="回复" class="rs"/>
										<div class="rf"><img src="img/1.png"/>
										<div>查看所有回复</div>
										</div>
										<div style="clear:both"></div>
										<form action="replay1" method="post">
										<div class="rs2">
										<textarea  name="res1" id="res1" placeholder="请输入内容！"></textarea>
						                <input type="submit" name="publish3" id="publish3"  value="发布" />
						                <input name="replay11" id="replay11" value="<%=dona.getComment_id() %>" style="display:none;"/>
						                <input name="replay12" id="replay12" value="<%=dona.getUsername()%>" style="display:none;"/>
						                 </div>
						                 </form>
										
											   <ul>
											   <% 
											      Donamic_replyDao dao4 = new Donamic_replyDaoImpl();
											      List<Donamic_reply> list4 = dao4.findAllDonamic_reply(dona.getComment_id());
											      for(Donamic_reply d:list4){
											    %>
												  <li><div class="c">
													<img src="image/<%=dao1.findHead(d.getReply_username()) %>" />
												</div>
												<div class="d">
													<div><%=d.getReply_username() %>回复<%=d.getComment_username() %>:<%=d.getConnect() %></div>
											        <div><%=d.getTime() %></div>
												</div>
												<input type="button" value="回复" class="rs1"/>
												<div style="clear:both"></div>
												<form action="replay2" method="post">
												<div class="res">
												<textarea  name="res" id="res" placeholder="请输入内容！"></textarea>
						                        <input type="submit" name="publish2" id="publish2"  value="发布" />
						                        <input name="replay21" id="replay21" value="<%=d.getConnect_id() %>" style="display:none;"/>
						                        <input name="replay22" id="replay22" value="<%=d.getReply_username()%>" style="display:none;"/>
						                        </div>
						                        </form>
												  </li>
												  <%} %>
											</ul>
										
										
									</li>
								<%} %>	
									
								</ul>
							</div>
							<input type="button" class="vis" value="评论" />
							<form action="comment" method="post">
							<div class="con1">
								<textarea class="connect1" name="connect1" id="connect1" placeholder="请输入内容！"></textarea>
						        <input type="submit" name="publish1" id="publish1" class="publish1" value="发布" />
						        <input name = "donamic_id" value="<%=donamic.getDonamic_id()%>" style="display:none"/> 
							</div>
							<div style="clear:both"></div>
							</form>
						</li>
			
			<%} %>
			
			
			</ul>
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					
					
				</div>
			</div>
	</body>
</html>
<script type="text/javascript" src="js/jquery-3.4.0.min.js"></script>
<script>
$(document).ready(function(e) {
    $(".weight li .vis").click(function(e) {
    	$(this).parent().find(".con1").toggle(); 
    });
});

$(document).ready(function(e) {
    $(".discull li li .rs1").click(function(e) {
    	$(this).parent().find(".res").toggle(); 
    });
});

$(document).ready(function(e) {
    $(".discull li .rs").click(function(e) {
    	$(this).parent().find(".rs2").toggle(); 
    });
});

$(document).ready(function(e) {
    $(".discull li .rf").click(function(e) {
    	$(this).parent().find("li").toggle(); 
    });
});

$(document).ready(function(e) {
    $(".discull li ").hover(function(e) {
    	$(this).find(".rf"). toggle();
    });
});
$(document).ready(function(e) {
    $(".discull li ").hover(function(e) {
    	$(this).find(".rs"). toggle();
    });
});
$(document).ready(function(e) {
    $(".discull li li").hover(function(e) {
    	$(this).find(".rs1"). toggle();
    });
});
</script>