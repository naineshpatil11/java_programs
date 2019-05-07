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


@WebServlet ("/loginServlet")
public class LoginServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			Dao dao = new Dao();
			RequestDispatcher rt = req.getRequestDispatcher("index.jsp");
			RequestDispatcher rt1 = req.getRequestDispatcher("welcome.jsp");
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			String userName = req.getParameter("userName");
			String passWord = req.getParameter("passWord");
			System.out.println(userName);
			System.out.println("");
			boolean result = dao.validate(userName, passWord);
			if (result == true) {
				req.setAttribute("msg", userName);
				rt1.forward(req, res);
			}else {
				req.setAttribute("msg", "<h3 style='color:red'>Invalid details</h3>");
				rt.forward(req, res);
			}
			pw.close();
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			doGet(req, res);
		}
	}

