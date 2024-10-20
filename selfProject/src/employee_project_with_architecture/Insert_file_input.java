package employee_project_with_architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_file_input {
	
/*
 * 
 * insert file input program
 * 	
 */
	public void insertProgram() {
		Connection  connection =null;
		
		try {
			
			//step-1  load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url  = "jdbc:mysql://localhost:3306/raj";
			String user = "root";
			String pass =  "0786";
			
			//step-2 create the connection
			connection = DriverManager.getConnection(url, user, pass);
			
			//step-3 create the statment
		   Statement statement =	connection.createStatement();
		   
		   //step-4 execute the Query
		   String insertQuery = "insert into student value(3,'a','a@gmail.com')";
			statement.execute(insertQuery);
			System.out.println(insertQuery);
			
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
