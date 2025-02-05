package jdbc_Revise.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayStatementController {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/mydata1";
			String user="root";
			String pass="0786";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			Statement statement = connection.createStatement();
			
			String displayAll = "select * from user";
			ResultSet resultSet = statement.executeQuery(displayAll);
			
			while(resultSet.next()) {
				
				int id=resultSet.getInt("userid");
				String name=resultSet.getString("username");
				String email=resultSet.getString("useremail");
				Long phone=resultSet.getLong("userphone");
				
				System.out.println("user id   :::  "+id);
				System.out.println("user name======= :"+name);
				System.out.println("user email==============="+email);
				System.out.println("user phone===    "+phone);
				
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
