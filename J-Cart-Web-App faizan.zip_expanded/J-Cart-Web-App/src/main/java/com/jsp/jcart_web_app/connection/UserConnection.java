package com.jsp.jcart_web_app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class UserConnection {

	public static Connection getUserConnection() {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/j-cart-web-app";
			String un = "root";
			String pw = "faizan@SQL#/";
			return DriverManager.getConnection(url, un, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
