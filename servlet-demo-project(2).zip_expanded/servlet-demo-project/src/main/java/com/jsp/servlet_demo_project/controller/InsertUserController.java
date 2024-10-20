package com.jsp.servlet_demo_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.servlet_demo_project.dto.User;
import com.jsp.servlet_demo_project.service.UserService;

public class InsertUserController implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		UserService service = new UserService();
		
		PrintWriter printWriter=res.getWriter();
		
		String myName = req.getParameter("myName");
		
		String myEmail = req.getParameter("myEmail");
		
		long phone =Long.parseLong(req.getParameter("myPhone"));
		
		String gender = req.getParameter("myGender");
		
		String address = req.getParameter("myAddress");
		
		User user = new User(myName, myEmail, phone, gender, address);
		
		service.saveUserService(user);
		System.out.println("myName = "+myName);
		System.out.println("myEmail = "+myEmail);
		System.out.println("phone = "+phone);
		System.out.println("gender = "+gender);
		System.out.println("address = "+address);
		
		printWriter.write("<html><body>");
		
		printWriter.write("<h3>myName="+myName+"</h3>");
		printWriter.write("<h3>myEmail="+myEmail+"</h3>");
		printWriter.write("<h3>phone="+phone+"</h3>");
		printWriter.write("<h3>gender="+gender+"</h3>");
		printWriter.write("<h3>address="+address+"</h3>");
		
		printWriter.write("</body></html>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.include(req, res);
	}

}
