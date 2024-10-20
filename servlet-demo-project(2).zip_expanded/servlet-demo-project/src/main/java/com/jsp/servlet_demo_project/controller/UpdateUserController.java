package com.jsp.servlet_demo_project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet_demo_project.dto.User;
import com.jsp.servlet_demo_project.service.UserService;

@WebServlet(value = "/myNewData")
public class UpdateUserController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int userId  = Integer.parseInt(req.getParameter("myId"));
		
		String myName = req.getParameter("myName");

		String myEmail = req.getParameter("myEmail");

		long phone = Long.parseLong(req.getParameter("myPhone"));

		String gender = req.getParameter("myGender");

		String address = req.getParameter("myAddress");

		User user = new User(userId,myName, myEmail, phone, gender, address);
		
		new UserService().updateUserByIdService(user);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		dispatcher.forward(req, resp);
	}
}
