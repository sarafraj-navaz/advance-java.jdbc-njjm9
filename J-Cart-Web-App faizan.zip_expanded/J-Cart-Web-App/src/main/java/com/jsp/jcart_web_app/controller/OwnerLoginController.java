package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.Owner;
import com.jsp.jcart_web_app.service.OwnerService;

@WebServlet("/ownerLogin")
public class OwnerLoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("ownerEmail");
		String password = req.getParameter("ownerPassword");
		
		Owner owner = new OwnerService().loginWithEmailPassword(email);
		if(owner != null) {
			
			if(owner.getOwnerPassword().equals(password)) {
				
				if(owner.getVerify().equals("yes")) {
					req.getRequestDispatcher("owner-home.jsp").forward(req, resp);
				}else {
					req.setAttribute("unverify", "your are not verified, contact to admin");
					req.getRequestDispatcher("owner-login.jsp").forward(req, resp);
				}
			}else {
				req.setAttribute("incorrectOwnerPass", "Enter correct owner password");
				req.getRequestDispatcher("owner-login.jsp").forward(req, resp);
			}
		}else {
			req.setAttribute("incorrectOwnerEmail", "Enter correct Owner Email");
			req.getRequestDispatcher("owner-login.jsp").forward(req, resp);
		}
	}
}
