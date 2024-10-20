package jdbc_employee_project_architecture_Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc_employee_project_architecture_dto.Employee;

public class EmployeeDao {

	/*
	 * 
	 * here we will be written database related code
	 */

	/*
	 * 
	 * i am creating a method where i will pass employeeid,employeename,
	 * employemail,employphone
	 */
	
	
	public void saveEmployeeDao(Employee employee) {
		
		Connection connection = null;
		
		try {
			
			//step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/raj";
			String user = "root";
			String pass = "0786";
			
			//step-2 create the Connection
			connection =  DriverManager.getConnection(url, user, pass);
			
			//step-3 create the statement
			 Statement statement = connection.createStatement();
			 
			 
			 //step-4 execute the Query
			 String insertQuery ="insert into student value("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"','"+employee.getEmployeeEmail()+"',"+employee.getEmployeePhone()+")";
			  statement.execute(insertQuery);
			  System.out.println(insertQuery);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				//step-5 close the  connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	

	}
	
	/*
	 *  i am making this method becouse wheneven i need 
	 *  database sid then we can  call this method 
	 *  then it will me id of the tables ; 
	 * 
	 * 
	 */
	
	public int getById1(Employee employeeId) {
		
		Connection connection =  null;
		
		try {
			
			//step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/raj";
			String user = "root";
			String pass = "0786";
			
			//step -2  create the connection
			connection = DriverManager.getConnection(url, user, pass);
			
			//step-3 create the statement
			Statement statement = connection.createStatement();
			
			//step-4 execute the Query and in the Query i am writting delete Query by id
			String deleteQuery =  "delete from student sid="+employeeId;
			ResultSet resultset = statement.executeQuery(deleteQuery);
			 
			
			if(resultset.next())
			{
				int id=resultset.getInt("sid");
						
						return  id;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}

