package com.han.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.han.dao.InvitationDao;
import com.han.entity.Invitation;
import com.han.impl.InvitationDaoImpl;

/**
 * Servlet implementation class Comment_sendServlet
 */
@WebServlet("/send")
public class Comment_sendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8"); 
//        String username=(String) this.getServletContext().getAttribute("name");
        String username=(String) request.getSession().getAttribute("name");
        System.out.println(username+"11111111111111111111111111111111111111111111111111111");
        String author = request.getParameter("send_bookauthor");
        String bookname = request.getParameter("send_bookname");
		String connect = request.getParameter("send_connect");
		Invitation invitation = new Invitation(username,0,author,bookname,connect,0);
		InvitationDao dao = new InvitationDaoImpl();
		int temp = dao.Insertinvitation(invitation);
		if(temp==1) {
			 request.getRequestDispatcher("study.jsp").forward(request, response);
		}else {
			 request.setAttribute("error", "·¢²¼Ê§°Ü");
			 request.getRequestDispatcher("comment_send.jsp").forward(request, response);
		}
				

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
