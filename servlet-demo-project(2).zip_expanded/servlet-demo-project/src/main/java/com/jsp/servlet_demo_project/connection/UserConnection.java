package com.jsp.servlet_demo_project.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserConnection {
	
	public static Connection userConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			  String url ="jdbc:mysql://localhost:3306/raj";
			  String user ="root";
			  String pass ="0786";
			  
			  return DriverManager.getConnection(url, user, pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
