package com.han.Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.han.dao.Donamic_replyDao;
import com.han.entity.Donamic_reply;
import com.han.impl.Donamic_replyDaoImpl;

/**
 * Servlet implementation class Replay1Servlet
 */
@WebServlet("/replay1")
public class Replay1Servlet extends HttpServlet {
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
		String reply_name = (String) request.getSession().getAttribute("name");
		String connect = request.getParameter("res1");
		int  comment_id = Integer.parseInt(request.getParameter("replay11"));
	    String comment_username = request.getParameter("replay12");
	    Donamic_replyDao dao = new Donamic_replyDaoImpl();
	    Donamic_reply don = new Donamic_reply(comment_id, comment_username, 0, connect, s, reply_name);
	    int temp = dao.insertDonamic_reply(don);
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
