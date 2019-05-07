package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("username");
		String fn =  request.getParameter("firstName");
		String ln = request.getParameter("lastName");
		String psw = request.getParameter("password");
		//String cpsw = request.getParameter("cPassword");
		String e = request.getParameter("email");
		String p = request.getParameter("phoneNum");
		String dob = request.getParameter("dob");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/nainesh","root","root");
			PreparedStatement ps = con.prepareStatement
			("insert into student values(?,?,?,?,?,?,?)");
			
			//ps.setString(1, null);
			ps.setString(1, uname);
			ps.setString(2, fn);
			ps.setString(3, ln);
			ps.setString(4, psw);
			//ps.setString(5, cpsw);
			ps.setString(5, e);
			ps.setString(6, p);
			ps.setString(7, dob);
			
			int i = ps.executeUpdate();
			if(i > 0)
			{
				System.out.println("Record Inserted ");
			//	out.println("Registration Successfully...");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
			else
				System.out.println("Try Again");
			RequestDispatcher rd = request.getRequestDispatcher
					("register.jsp");
			rd.forward(request, response);
		}
		catch (Exception e1) 
		{
			System.out.println(e1);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}




}
