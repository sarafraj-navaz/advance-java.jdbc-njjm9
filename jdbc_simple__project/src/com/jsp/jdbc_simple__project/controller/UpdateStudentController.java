package com.jsp.jdbc_simple__project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudentController {

	public static void main(String[] args) {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbs-njjm9";
			String user="root";
			String pass= "0786";
			
			connection=DriverManager.getConnection(url, user, pass);
			
			Statement statement=connection.createStatement();
			
			
			String updateQuery="Update student set name='nnnnnn' where id=1213";
			//String UpdateQuery="Update student set name='raj','raj1' where id=1213";
			int id=statement.executeUpdate(updateQuery);
			System.out.println("done");
			System.out.println("id = "+id);
			
			if(id!=0)
			{
				System.out.println("Data Deleted");
			}
			else
			{
				System.out.println("id is not present please check");
			}
			
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
