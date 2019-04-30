package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegisterDao;
import com.model.RegisterBean;

public class RegisterServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/jsp");
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String e = request.getParameter("email");
		String dob = request.getParameter("dateOfBirth");
		int m = Integer.parseInt(request.getParameter("mobileNo"));
		String psw = request.getParameter("password");
		String cpsw = request.getParameter("cpassword");
		
		RegisterBean b = new RegisterBean();
		b.setFname(fn);
		b.setLname(ln);
		b.setEmail(e);
		b.setDateOfBirth(dob);
		b.setMobileNo(m);
		b.setPassword(psw);
		b.setCpassword(cpsw);
		
		int i = RegisterDao.insertRecord(b);
		if(i > 0)
		{
			RequestDispatcher  dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		else 
		{
			System.out.print("Registration Fail..!!1 Try Again");
			RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
			dispatcher.forward(request, response);
		}
		
	}
	
}
