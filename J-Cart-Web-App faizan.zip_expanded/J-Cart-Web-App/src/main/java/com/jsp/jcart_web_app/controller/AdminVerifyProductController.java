package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.service.ProductService;

@WebServlet(value = "/verifyProduct")
public class AdminVerifyProductController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("productId"));

		new ProductService().verifyProductService(id);
		
		req.getRequestDispatcher("verified-product.jsp").forward(req, resp);
	}
}
