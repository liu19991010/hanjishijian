package com.han.Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.han.dao.DonamicDao;
import com.han.entity.Donamic;
import com.han.impl.DonamicDaoImpl;

/**
 * Servlet implementation class Donamic_seekServlet
 */
@WebServlet("/donamic_seek")
public class Donamic_seekServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8"); 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String username = (String) request.getSession().getAttribute("name");
		Date date = new Date();
		String s = simpleDateFormat.format(date);
		String connect = request.getParameter("donamic_connect");
		
		DonamicDao dao = new DonamicDaoImpl();
		Donamic donamic =  new Donamic(username,0,connect,s);
		int temp = dao.insert(donamic);
		if(temp==1) {
        	request.getRequestDispatcher("donamic.jsp").forward(request, response);
//      	  response.getWriter().print("³É¹¦");
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
