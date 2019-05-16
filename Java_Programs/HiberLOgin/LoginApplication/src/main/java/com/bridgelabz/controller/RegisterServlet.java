package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.Dao;
import com.bridgelabz.pojo.Student;
@WebServlet ("/registerServlet")
	
public class RegisterServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			Dao dao = new Dao();
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			RequestDispatcher rd1 = req.getRequestDispatcher("index.jsp");
			System.out.println(req.getParameter("password"));
			System.out.println(req.getParameter("confPassword"));
			Student st = new Student();
			st.setUserName(req.getParameter("username"));
			st.setPassWord(req.getParameter("password"));
			st.setfName(req.getParameter("fName"));
			st.setlName(req.getParameter("lName"));
			st.setDob(req.getParameter("dob"));
			st.setContactNumber(req.getParameter("mobileNo"));
			st.seteMail(req.getParameter("email"));
			System.out.println(st);
			if(st.getPassWord().equals(req.getParameter("confPassword"))) {
				dao.register(st);
				req.setAttribute("msg", "<h3 style=\"color:green\">Registration Succesfull "+st.getfName()+" Plese Login</h3>");
				rd1.forward(req, res);
			}else {
				  	req.setAttribute("msg", "Password and conform <br>password must be same");
				 	rd.forward(req, res);
			}
			pw.close();
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			doGet(req, res);
		}
	}
	
	
	

