package com.han.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.han.dao.RegistDao;
import com.han.entity.User;
import com.han.impl.RegistDaoImpl;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
		String head=(String) this.getServletContext().getAttribute("111");
		 String username = request.getParameter("username");
	      String password = request.getParameter("password");
	      String email = request.getParameter("email");
	      int age = Integer.parseInt(request.getParameter("age"));
	      int sex = Integer.parseInt(request.getParameter("sex"));
	      System.out.println(username);
	      System.out.println(password);
	      System.out.println(age);
	      System.out.println(sex);
	      System.out.println(email);
	      System.out.println(head);
	      User user = new User(username, password, head, sex, email, age);
	      RegistDao dao = new RegistDaoImpl();
	      int temp = dao.insertUser(user);
			
			if(temp==1) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				response.getWriter().print("Ê§°Ü");
			}
//		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
