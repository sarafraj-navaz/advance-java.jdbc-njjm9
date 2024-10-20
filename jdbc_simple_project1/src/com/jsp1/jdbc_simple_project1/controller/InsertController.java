package com.jsp1.jdbc_simple_project1.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertController {

	public static void main(String[] args) {
		
		Connection connection =  null;
		
		try {
			
			
			//step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String url = "jdbc:mysql://localhost:3306/jdbs-njjm9";
			String user =  "root";
			String pass = "0786";
			
			//step-2 create the Connection
		   connection = DriverManager.getConnection(url, user, pass);
		   
		   
		   
		   //step-3 create the Statement
		     Statement statement = connection.createStatement();
		     
		     
		     //step-4 execute the Query
		     String insertQuery =  "insert into mytable value(2001,'s','s@gmail.com')";
			  statement.execute(insertQuery);
			  
			  // 
			System.out.println("data stored");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		finally {
			
			try {
				
				//step-5 close the Connection;
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
