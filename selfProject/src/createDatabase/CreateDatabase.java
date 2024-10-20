package createDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

	
	public void createDatabase()
	{
		Connection connection = null;
		
		
		try {
			
			//step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//step-2 create the Connection
			
			String url ="jdbc:mysql://localhost:3306";
			String user =  "root";
			String pass = "0786";
			
		  connection =  DriverManager.getConnection(url, user, pass);
		  
		  //step-3 create the statement
		  Statement statement= connection.createStatement();
		  
		  
		  //step-4 execute the Query
		  String createDatabase1 = "create database nawaz";
		  statement.execute(createDatabase1);
		  
		  System.out.println("create database Successfully");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			try {
				
				//step-5 close the connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
