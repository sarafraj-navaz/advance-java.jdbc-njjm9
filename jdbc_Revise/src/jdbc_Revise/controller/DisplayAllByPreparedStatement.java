package jdbc_Revise.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayAllByPreparedStatement {
	
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/mydata1";
			String user="root";
			String pass="0786";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			String displayAllData = "select * from user";
			
			PreparedStatement preparedStatement =connection.prepareStatement(displayAllData);
			
			 ResultSet resultSet = preparedStatement.executeQuery();
			 
			 while(resultSet.next()) {
				 
				 int id = resultSet.getInt("userid");
				String name = resultSet.getString("username");
			    String email = resultSet.getString("useremail");
			    Long phone = resultSet.getLong("userphone");
				 
			    
			    System.out.println("userid   :"+id);
			    System.out.println("username  :"+name);
			    System.out.println("useremail  :"+email);
			    System.out.println("userphone   :"+phone);
			 }
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
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
