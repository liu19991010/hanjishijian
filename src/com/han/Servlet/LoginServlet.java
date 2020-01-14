package com.han.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.han.dao.LoginDao;
import com.han.impl.LoginDaoImpl;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8"); 
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        LoginDao dao = new LoginDaoImpl();
        request.getSession().setAttribute("name", username);
//        this.getServletContext().setAttribute("name",username);
        String head_portrait = dao.findHead(username);
        request.getSession().setAttribute("head_portrait", head_portrait);
        
        int temp = dao.userExist(username, password);
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
