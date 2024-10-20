package com.jsp.jcart_web_app.dao;

import java.sql.Connection;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.OrderProduct;

public class ProductOrderDao {

	
	Connection connection = UserConnection.getUserConnection();
	
	public OrderProduct saveOrderProductDao(OrderProduct orderProduct) {
		
		
		
		
		return orderProduct;
	}
}
