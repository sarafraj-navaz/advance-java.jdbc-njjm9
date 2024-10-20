package insert_File_Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Class_file {

	public void createTable() {
		
		Connection connection =  null;
		
		try {
			
			//step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/raj";
			String user =  "root";
			String pass = "0786";
			
			
			//step-2 create the Connection
			connection = DriverManager.getConnection(url, user, pass);
			
			//step-3 create the statement 
			 Statement statement = connection.createStatement();
			 
			 //step-4 execute the Query
			 String createTable =  "create table student(sid int(6),sname varchar(45),semail varchar(45))";
			 statement.execute(createTable);
			 
			// System.out.println("create table Successsully");
			 
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
