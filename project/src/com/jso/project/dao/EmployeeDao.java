package com.jso.project.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jso.project.connection.ProjectConnection;
import com.jso.project.dto.Employee;

public class EmployeeDao {
	
    Connection con=ProjectConnection.getConnection();
	
	public void saveMethodDao(Employee employee) {
		
		
		try {
			Statement statement=con.createStatement();
			String insertQuery="insert into user value("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"','"+employee.getEmployeeEmail()+"',"+employee.getAge()+")";
			
			 statement.execute(insertQuery);
			System.out.println("data has been stored");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void deleteDao(int employeeId) {
		
		try {
			Statement statement=con.createStatement();
			
			
			String deleteQuery="delete from user where myid="+employeeId;
			int id =statement.executeUpdate(deleteQuery);
			
			if(id != 0) {
				System.out.println("data has been deleted from the table");
				
			}
			else {
				System.out.println("please check  your id");
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	/*
	 * update method
	 * 	
	 */
	}
    
	
	public int updateDao(String name,int id) {
		
		try {
		   Statement statement=con.createStatement();
		   
		   String updateQuery="update user set myname='"+name+"' where myid="+id;
		   
		   return statement.executeUpdate(updateQuery);
		   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id;
	}
	
	public List<Employee> displayAll(){
		
		try {
		  	Statement statement =con.createStatement();
		  	
		  	String displayQuery="select * from user ";
		  	ResultSet  rs=statement.executeQuery(displayQuery);
		  	
		  	List<Employee> employees = new ArrayList<Employee>();
		  	
		  	while(rs.next()) {
		  		
		  		Employee employee=new Employee();
		  		
		  		int id=rs.getInt("myid");
		  		String name=rs.getString("myname");
		  		String email=rs.getString("myname");
		  		int age=rs.getInt("myage");
		  		
		  		employee.setEmployeeId(id);
		  		employee.setEmployeeName(name);
		  		employee.setEmployeeEmail(email);
		  		employee.setAge(age);
		  		
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
