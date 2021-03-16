package com.pranav.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		Long num1 = Long.parseLong(request.getParameter("number1"));
		Long num2 = Long.parseLong(request.getParameter("number2"));
		//Long num1 = 21L;
		//Long num2 = 22L;
		PrintWriter out = response.getWriter();
		out.println("The result is : " + (num1 + num2));
		out.flush();
	}

}
