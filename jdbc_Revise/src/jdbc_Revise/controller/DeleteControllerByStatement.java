package jdbc_Revise.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteControllerByStatement {

	public static void main(String[] args) {
		
		Connection connection =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url =  "jdbc:mysql://localhost:3306/mydata1";
			String user = "root";
			String pass =  "0786";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			Statement statement= connection.createStatement();
			
			String deleteQuery = "delete from user where userid =22";
			 int id = statement.executeUpdate(deleteQuery);
			 
			 if(id != 0) {
				 System.out.println("it has been removed");
				 
				 String displayAll ="select * from user";
				 
				PreparedStatement preparedStatement= connection.prepareStatement(displayAll);
				ResultSet  rs= preparedStatement.executeQuery();
				
				while(rs.next()) {
					
					int userDataBaseid= rs.getInt("userid");
				    String name= rs.getString("username");
				   String email= rs.getString("useremail");
				     Long phone= rs.getLong("userphone");
					
				     System.out.println("userid     :"+userDataBaseid);
				     System.out.println("username   :"+name);
				     System.out.println("userphone   :"+email);
				     System.out.println("userphone Number  :"+phone);
				     
				}
				 
				 
			 }
			 else {
				 System.out.println("please check your id");
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
