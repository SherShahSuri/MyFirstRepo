package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=resp.getWriter();
//		writer.println("<html>");
//		writer.println("<head>");
//		writer.println("<title>myservlet");
//		writer.println("</title>");
//		writer.println("</head>");
//		writer.println("<body>");
//		writer.println("Welcome to servlet");
//		writer.println("</body>");
//		writer.println("</html>");
	}
	
}
