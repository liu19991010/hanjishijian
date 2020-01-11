package com.han.Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.han.dao.Donamic_commentDao;
import com.han.entity.Donamic_comment;
import com.han.impl.Donamic_commentDaoImpl;

/**
 * Servlet implementation class CommentServlet
 */
@WebServlet("/comment")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8"); 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String s = simpleDateFormat.format(date);
		String username=(String) request.getSession().getAttribute("name");
		int donamic =Integer.parseInt(request.getParameter("donamic_id")) ;
		String donamic_connect = request.getParameter("connect1");
		Donamic_commentDao dao = new Donamic_commentDaoImpl();
		Donamic_comment ds = new Donamic_comment(username,donamic,0,donamic_connect,s);
		int temp = dao.insertConamic_comment(ds);
		if(temp==1) {
			request.getRequestDispatcher("donamic.jsp").forward(request, response);
		}else {
			response.getWriter().print("Ê§°Ü");
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
