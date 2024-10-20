package com.jsp.servlet_demo_project.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.servlet_demo_project.service.UserService;

public class DeleteUserController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int userId = Integer.parseInt(req.getParameter("id"));
		
		UserService service = new UserService();
		
		service.deleteUserByIdService(userId);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		dispatcher.forward(req, res);
	}

}
