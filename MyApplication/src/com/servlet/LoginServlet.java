package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/mydata")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>loginservlet");
		writer.println("</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("Welcome to servlet " + name);
		
		if (name.equals("citi") && password.equals("citi")) {
			writer.println("welcome to servlet 1233");
		} else {
//			writer.println("wrong credentials man, please relogin");
//			writer.println("<form action='mydata' method='post'>");
//			writer.println("USERNAME: <input type='text' name='username'><br>");
//			writer.println("PASSWORD: <input type='password' name='password'><br>");
//			writer.println("<input type='submit' name='login'>");
//			writer.println("</form");
			writer.println("<html><body>wrong login credentials, kindly login again</body></html>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("form.html");
			dispatcher.forward(request, response);
		
		}
		
		
		
		writer.println("</body>");
		writer.println("</html>");
	}

}
