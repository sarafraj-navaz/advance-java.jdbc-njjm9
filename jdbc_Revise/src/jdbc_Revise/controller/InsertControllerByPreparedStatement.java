package jdbc_Revise.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertControllerByPreparedStatement {
	
	public static void main(String args[]) {
		
		Connection connection=null;
		
		//step1  load the registered the driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// we are creating url;
			
			String url="jdbc:mysql://localhost:3306/mydata1";
			String user="root";
			String pass="0786";
			
			connection=DriverManager.getConnection(url, user, pass);
			
			// prepared statement
			
			String insertQuery="insert into user(userid,username,useremail,userphone)" +"value(?,?,?,?)";
			
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			
			preparedStatement.setInt(1,22);
			preparedStatement.setString(2, "Nehal");
			preparedStatement.setString(3,"nehal@gmail.com");
			preparedStatement.setLong(4,812772283);
			
			preparedStatement.execute();
			System.out.println("data has been stored successfully");
			
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
