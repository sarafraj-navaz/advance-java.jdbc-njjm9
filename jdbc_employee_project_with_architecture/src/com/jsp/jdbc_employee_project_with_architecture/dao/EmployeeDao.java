package com.jsp.jdbc_employee_project_with_architecture.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jdbc_employee_project_with_architecture.connection.EmployeeConnection;
import com.jsp.jdbc_employee_project_with_architecture.dto.Employee;

/*
 * this is dao where we will  write database
 * related code only
 */

public class EmployeeDao {

     
	
	/*
	 * 
	 * save dao method 
	 * 
	 * 
	 * 
	 */
	
	Connection con= EmployeeConnection.getEmployeeConnection();
	
	public void saveEmployeeDao(Employee employee) {
		
		
		try {
			Statement statement= con.createStatement();
			
			String insertQuery ="insert into employee value("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"','"+employee.getEmployeeEmail()+"',"+employee.getEmployeePhone()+")";
			
			if(statement.execute(insertQuery)) {
				System.out.println("data has been store");
			}
			else {
				System.out.println("please check your connection");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 
	 * delete method
	 */
	
	public void deleteEmployeeDao(int employeeId) {
		
		try {
			Statement statement= con.createStatement();
			
			String deleteQuery ="delete from employee where employeeid ="+employeeId;
			int id=statement.executeUpdate(deleteQuery);
			
			if(id != 0) {
				System.out.println("data has been deleted");
			}
			else {
				System.out.println("please check your id");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * update dao method
	 * 
	 */
	public int updateEmployeeDao(int employeeId,String employeeName) {
		
		try {
			Statement statement = con.createStatement();
			
			String updateQuery = "update employee set employeename='"+employeeName+"' where employeeid ="+employeeId;
			return  statement.executeUpdate(updateQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/*
	 * display method
	 * 
	 */
	
	public List<Employee> displayEmployeeDao(){
		
		try {
			
			Statement statement = con.createStatement();
			String displayQuery = "select * from employee";
			ResultSet rs = statement.executeQuery(displayQuery);
			
			List<Employee> employees = new ArrayList<Employee>();
			 
			while(rs.next()) {
				
				Employee employee = new Employee(); 
				
				int id = rs.getInt("employeeid");
				String name = rs.getString("employeename");
				String email= rs.getString("employeeemail");
				Long phone = rs.getLong("employeephone");
				 
				employee.setEmployeeId(id);
				employee.setEmployeeName(name);
				employee.setEmployeeEmail(email);
				employee.setEmployeePhone(phone);
				
				employees.add(employee);
			}
			
			return employees;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
