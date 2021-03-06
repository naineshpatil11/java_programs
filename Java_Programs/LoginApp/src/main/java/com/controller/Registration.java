package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BaseDaoImpl;
import com.model.Users;
@WebServlet ("/registration")
public class Registration extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String psw = request.getParameter("password");
		String cpsw = request.getParameter("cpword");
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String dob = request.getParameter("dob");
		String pno = request.getParameter("phoneNo");
		String email = request.getParameter("email");
System.out.println("Registration.doPost()::Data got into POJO");
		Users users = new Users();

		users.setUsername(uname);
		users.setPassword(psw);
		users.setCpword(cpsw);
		users.setFirstName(fname);
		users.setLastName(lname);
		users.setDob(dob);
		users.setPhoneNum(pno);
		users.setEmail(email);
System.out.println("Registration.doPost()::data is set into POJO");
		System.out.println(users.toString());

		if (request.getParameter("password").equals(request.getParameter("cpword"))) {
			System.out.println("Registration.doPost()");
			String userName = BaseDaoImpl.regCustomer(users);
			if (userName != null) {
				System.out.println("Registration successfull");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
		} else {
			System.out.println("Enter valid password and conform password");
			request.getRequestDispatcher("registration.jsp").include(request, response);
		}
	}
}
