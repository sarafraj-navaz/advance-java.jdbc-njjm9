package com.jsp.jdbc_my_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.jdbc_my_project.connection.MyConnection;
import com.jsp.jdbc_my_project.dto.MyProject;

public class MyprojectDao {
	
	Connection connection=MyConnection.getMyConnection();
	
	MyProject project=new MyProject();
	
	public  void savaByDao(MyProject myproject) {
		
		String insertQuery="insert into user value(?,?,?,?)";
		
		try {
			PreparedStatement pre=connection.prepareStatement(insertQuery);
			
		     pre.setInt(1, myproject.getId());
		     pre.setString(2, myproject.getName());
		     pre.setString(3, myproject.getEmail());
		     pre.setLong(4, myproject.getPhoneNumber());
			
		     pre.execute();
		     
		     System.out.println("data has been stored in the table");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
