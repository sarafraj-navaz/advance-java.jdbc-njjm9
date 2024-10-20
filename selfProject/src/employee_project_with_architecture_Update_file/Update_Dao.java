package employee_project_with_architecture_Update_file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Dao {

	/*
	 * Update the method
	 * 
	 * 
	 */
	public int updateMethod()
	{
		Connection connection = null;
		
		try {
			
			
			//step-1  load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/raj";
			String user = "root";
			String pass  = "0786";
			
			//step-2 create the connection
	         connection = DriverManager.getConnection(url, user, pass);
	         
	         //step-3 create the statement  
	        Statement statement = connection.createStatement();
	        
	        //step-4 execute the Query
	        String update = "update student set sname ='sarafraj'where sid = 7 ";
	        return  statement.executeUpdate(update);	
			
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
		return 0;
	}
	
}
