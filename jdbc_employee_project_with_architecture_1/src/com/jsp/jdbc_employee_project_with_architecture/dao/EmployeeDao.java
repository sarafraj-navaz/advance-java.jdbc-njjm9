package com.jsp.jdbc_employee_project_with_architecture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc_employee_project_with_architecturecom.jsp.jdbc_employee_project_with_architecture.dto.Employee;

public class EmployeeDao {
	/*
	 * employee save method where i can pass employee name,email,phone,id where id
	 * is a primary key
	 * 
	 * SAVE----METHOD
	 */
	public void saveEmployeeDao(Employee employee) {
		System.out.println("EmployeeDao Save method started");
		Connection connection = null;
		try {
			// step-1 load/register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user = "root";
			String pass = "0786";

			// step-2 create the connection
			connection = DriverManager.getConnection(url, user, pass);

			// step-3 create the statement
			Statement statement = connection.createStatement();

			// step-4 execute Query
			String insertQuery = "insert into employee value("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"','"+employee.getEmployeeEmail()+"',"+employee.getEmployeePhone()+")";
			
			statement.execute(insertQuery);

			System.out.println("Data-Stored");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// step-5 close the connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("EmployeeDao Save method ended");
	}
	
	/*
	 * getById method which return type will be int once the given id is present method will return 1
	 * once the id is not present method will return 0
	 */
	public int getById(int emoployeeId) {
			Connection connection = null;
			try {
				//step-1 load/register driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
				String user = "root";
				String pass = "0786";
				
				// step-2 create the connection
				connection = DriverManager.getConnection(url, user, pass);
				
				// step-3 create the statement
				Statement statement = connection.createStatement();
				
				// step-4 execute Query
				String selectQuery = "SELECT * FROM EMPLOYEE WHERE employeeid="+emoployeeId;
				
				ResultSet resultSet=statement.executeQuery(selectQuery);
				
				if(resultSet.next()) {
					
					int id = resultSet.getInt(1);
					
					System.out.println("Dao ka getbyid"+id);
					return id;
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					// step-5 close the connection
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return 0;
	}
	
	/*
	 * delete method for employee
	 */
	public void deleteEmployeeById(int employeeId) {
		Connection connection = null;
		try {
			//step-1 load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user = "root";
			String pass = "0786";
			
			// step-2 create the connection
			connection = DriverManager.getConnection(url, user, pass);
			
			// step-3 create the statement
			Statement statement = connection.createStatement();
			
			// step-4 execute Query
			String deleteQuery = "DELETE  FROM EMPLOYEE WHERE employeeid="+employeeId;
			
			statement.executeUpdate(deleteQuery);
			
			System.out.println("Data deleted....");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				// step-5 close the connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * update method for employee
	 */
	public int updateEmployee(String employeeName,int employeeId) {
		
		Connection connection = null;
		try {
			//step-1 load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user = "root";
			String pass = "root";
			
			// step-2 create the connection
			connection = DriverManager.getConnection(url, user, pass);
			
			// step-3 create the statement
			Statement statement = connection.createStatement();
			
			// step-4 execute Query
			String updateQuery = "UPDATE EMPLOYEE SET employeename='"+employeeName+"' WHERE employeeid="+employeeId;
			
		 return statement.executeUpdate(updateQuery);
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				// step-5 close the connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	/*
	 * display method for employee
	 */
	public List<Employee> displayAllEmployees(){
		
		Connection connection = null;
		try {
			//step-1 load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user = "root";
			String pass = "0786";
			
			// step-2 create the connection
			connection = DriverManager.getConnection(url, user, pass);
			
			// step-3 create the statement
			Statement statement = connection.createStatement();
			
			// step-4 execute Query
			String selectQuery = "SELECT * FROM EMPLOYEE";
			
	
			ResultSet resultSet=statement.executeQuery(selectQuery);
			
			List<Employee> employees = new ArrayList<Employee>();
			
			while(resultSet.next()) {
				
				Employee employee = new Employee();
				
				int id = resultSet.getInt("employeeid");
				String name = resultSet.getString("employeename");
				String email = resultSet.getString("employeeemail");
				long phone = resultSet.getLong("employeephone");
				
				employee.setEmployeeId(id);
				employee.setEmployeeName(name);
				employee.setEmployeePhone(phone);
				employee.setEmployeeEmail(email);
				
				employees.add(employee);
				
			}
			
			return employees;
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				// step-5 close the connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/*
	 * getById method which return type will be int once the given id is present method will return 1
	 * once the id is not present method will return 0
	 */
	public Employee getEmployeeById(int emoployeeId) {
			Connection connection = null;
			try {
				//step-1 load/register driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
				String user = "root";
				String pass = "0786";
				
				// step-2 create the connection
				connection = DriverManager.getConnection(url, user, pass);
				
				// step-3 create the statement
				Statement statement = connection.createStatement();
				
				// step-4 execute Query
				String selectQuery = "SELECT * FROM EMPLOYEE WHERE employeeid="+emoployeeId;
				
				ResultSet resultSet=statement.executeQuery(selectQuery);
				
				if(resultSet.next()) {
					
					Employee employee = new Employee();
					
					int id = resultSet.getInt("employeeid");
					String name = resultSet.getString("employeename");
					String email = resultSet.getString("employeeemail");
					long phone = resultSet.getLong("employeephone");
					
					employee.setEmployeeId(id);
					employee.setEmployeeName(name);
					employee.setEmployeePhone(phone);
					employee.setEmployeeEmail(email);
					
					System.out.println("get employeeId method"+employee);
					return employee;
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					// step-5 close the connection
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return null;
	}
	


}
