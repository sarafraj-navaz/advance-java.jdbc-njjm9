package com.jsp.jdbc_simple__project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertStudentController {
	public static void main(String[] args) {
		Connection connection=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String  url="jdbc:mysql://localhost:3306/jdbs-njjm9";
			String user="root";
			String pass="0786";
			connection=DriverManager.getConnection(url, user, pass);
			// step-3 create the statement
			Statement statement=connection.createStatement();
			
			//step-4 create the Query
			String insertQuery="insert into  student value(121,'raj1','raj@gmail.com')";
			statement.execute(insertQuery);
			System.out.println("deta added");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
