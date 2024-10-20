package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.service.OwnerService;
@WebServlet(value="/verify")
public class AdminVerifyOwnerController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int ownerId = Integer.parseInt(req.getParameter("ownerId"));
//		System.out.println(ownerId);
		
		new OwnerService()
		.verifyOwnerByIdService(ownerId);
		
		req.getRequestDispatcher("verify-owner.jsp").forward(req, resp);
	}
}
