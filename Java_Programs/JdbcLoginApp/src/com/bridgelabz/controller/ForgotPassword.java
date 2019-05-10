package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String em = request.getParameter("email");
		String pass = request.getParameter("password");
		String cpsw = request.getParameter("cpass");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nainesh", "root", "root");
		
			PreparedStatement ps = con.prepareStatement
			("update student set password = ? where email = ?");
			
			ps.setString(2, em);
			ps.setString(1, pass);
			if(pass.equals(cpsw)) {
			int i = ps.executeUpdate();
				if(i > 0)
				{
					RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
					rd.forward(request, response);
				}
				else
				{
					System.out.println("Try Again..");
					RequestDispatcher rd  = request.getRequestDispatcher("forgot.jsp");
				}
			}		
			else
			{
				System.out.println("New password and confirm pass must be same");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		//	doGet(request, response);
	}

}
