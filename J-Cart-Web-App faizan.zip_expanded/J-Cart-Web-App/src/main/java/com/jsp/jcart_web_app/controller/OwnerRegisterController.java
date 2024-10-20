package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.Owner;
import com.jsp.jcart_web_app.service.OwnerService;

@WebServlet(value="/ownerRegister")
public class OwnerRegisterController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("ownerName");
		String email = req.getParameter("ownerEmail");
		String password = req.getParameter("ownerPassword");
		long phone = Long.parseLong(req.getParameter("ownerPhone"));
		
//		OwnerService service = new OwnerService();
//		Owner owner = service.saveOwnerDao(new Owner(name, email, password, password));
		
		Owner owner = new OwnerService()
				.saveOwnerService(
						new Owner(name, email, password, phone));
		
		if(owner != null) {
			req.getRequestDispatcher("owner-login.jsp").forward(req, resp);
		}else {
			req.setAttribute("passwordMessage", 
					"Password length must be between 8 to 15 character, "
					+ "atleast one uppercase Character, "
					+ "atleast one digit and atleast one special character.");
			req.getRequestDispatcher("owner-register.jsp").forward(req, resp);
		}		
	}
	
}
