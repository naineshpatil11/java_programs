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

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("username");
		String psw = request.getParameter("password");
		String dbName = null;
		String pass = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nainesh", "root", "root");
			System.out.println("Connection:::");
			PreparedStatement ps = con.prepareStatement("select * from student where username = ? and password = ?");
			ps.setString(1, uname);
			ps.setString(2, psw);

		ResultSet rs=ps.executeQuery();
		System.out.println("LoginServlet.doPost()::executed");
		while(rs.next())
			{
			dbName = rs.getString("username");
			pass = rs.getString("password");
			}
		if(uname.equals(dbName) && psw.equals(pass))
		{
				//System.out.println("LoginServlet.doPost()");
				out.println("Login Successfully...");
				//response.sendRedirect("newfile.jsp");
		}
		else
		 {
			RequestDispatcher dispatcher = request.getRequestDispatcher("newfile.jsp");
            dispatcher.forward(request, response);
		 }
		} catch (Exception e) {
			System.out.println(e);
		}
		// doGet(request, response);
	}

}
