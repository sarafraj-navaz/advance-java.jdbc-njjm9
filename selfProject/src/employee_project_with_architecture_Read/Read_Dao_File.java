package employee_project_with_architecture_Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read_Dao_File {
	
	
	/*
	 * 
	 * 
	 * At the this time i am creating one method then which will  communicate to the databases as will as 
	 * it will the data
	 */
	public int readDao()
	{
		Connection connection = null;
		
		try {
			
			//step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String url = "jdbc:mysql://localhost:3306/raj";
			String user =  "root";
			String pass = "0786";
			
			//step-2 create the Connection
			connection = DriverManager.getConnection(url, user, pass);
			
			
			//step-3 create the Statement
		    Statement statement  =	connection.createStatement();
			
		    //step-4 execute the Query 
		    String displayAll = "select * from student";
		      ResultSet result =  statement.executeQuery(displayAll);
			 while(result.next())
			 {
				 int id =result.getInt("sid");
				 String name =result.getString("sname");
				 String email = result.getString("semail");
				 
				 System.out.print(" id is     "+id);
				 System.out.print("name is    "+name);
				 System.out.print("email is   "+email);
				 System.out.println("    ");
				 
			 }
			
			
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
