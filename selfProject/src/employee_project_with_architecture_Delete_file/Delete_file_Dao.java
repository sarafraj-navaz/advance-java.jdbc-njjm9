package employee_project_with_architecture_Delete_file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_file_Dao {

	/*
	 * 
	 * Dao delete method
	 * 
	 */
	public int deleteDao()
	{
		Connection connection = null;
		
		
		try {
			//step-1 Load /register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/raj";
			String user = "root";
			String pass =  "0786";
			
			//step-2 create the connection
			connection = DriverManager.getConnection(url, user, pass);
			
			//step-3 create the statement
			 Statement statement = connection.createStatement();
			
			//execute the Query 
			 String deleteQuery =  "delete from  student where sid =1";
			return  statement.executeUpdate(deleteQuery);
			 
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				
				//step-5 close  the connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
		
		
	}
	
}
