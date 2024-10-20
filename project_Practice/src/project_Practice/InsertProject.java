package project_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertProject {

	public static void main(String[] args) {
		  
		Connection connection = null;
		
		
		try {
			
			// step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String url = "jdbc:mysql://localhost:3306/jdbs-njjm9";
			String user =  "root";
			String pass = "0786";
			
			
			// step 2 create the  Connection
			connection = DriverManager.getConnection(url, user, pass);
			
			
			// step-3 create the statement
			 Statement  statement = connection.createStatement();
			
			 //step 4 execute the  Query
			 String insertQuery =  "insert into mytable value(7860786,'raj','raj@gmail.com')";
			 statement.execute(insertQuery);
			 
			 
			 // print the detail on the console which data user input 
			 System.out.println(insertQuery);
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				
				//step-5 close the Connection
				connection.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
