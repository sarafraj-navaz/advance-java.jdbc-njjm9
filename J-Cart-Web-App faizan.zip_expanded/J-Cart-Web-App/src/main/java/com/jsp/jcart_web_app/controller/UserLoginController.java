package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.User;
import com.jsp.jcart_web_app.service.UserService;

@WebServlet (value="/userLogin")
public class UserLoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		
		UserService service = new UserService();
		User user = service.loginWithUserService(email);
		
		if(user != null) {
			if(user.getUserPassword().equals(password)) {
				req.getRequestDispatcher("user-home.jsp").forward(req, resp);
			}else {
				req.setAttribute("incorrectPassword", "Entered password is incorrect");
				req.getRequestDispatcher("user-login.jsp").forward(req, resp);
			}
		}else {
			req.setAttribute("incorrectEmail", "Entered email is incorrect");
			req.getRequestDispatcher("user-login.jsp").forward(req, resp);
		}
	}

}
