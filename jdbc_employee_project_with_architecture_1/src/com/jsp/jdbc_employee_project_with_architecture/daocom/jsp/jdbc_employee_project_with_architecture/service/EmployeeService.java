package com.jsp.jdbc_employee_project_with_architecture.daocom.jsp.jdbc_employee_project_with_architecture.service;

import java.util.List;

import com.jsp.jdbc_employee_project_with_architecture.dao.EmployeeDao;

import jdbc_employee_project_with_architecturecom.jsp.jdbc_employee_project_with_architecture.dto.Employee;

public class EmployeeService {
	


	/*
	 * We create the object of Dao class to call save method of dao inside the
	 * service saveMethod
	 */

	EmployeeDao employeeDao = new EmployeeDao();

	/*
	 * employee save method where i can pass employee name,email,phone,id where id
	 * is a primary key
	 * 
	 * SAVE----METHOD
	 */
	public void saveEmployeeService(Employee employee) {

		System.out.println("EmployeeService Save method started");

		int id = employee.getEmployeeId();
		int count = 0;
		while (id != 0) {
			count++;
			id /= 10;// id = id/10;
		}

		if ((count >= 2) && (count <= 5)) {
			employeeDao.saveEmployeeDao(employee);
		} else {
			System.err.println("Please provide your id between 2 to 5 digit only");
		}
		System.out.println("EmployeeService Save method ended");
	}

	/*
	 * delete method for employee
	 */
	public void deleteEmployeeById(int employeeId) {

		int tableId = employeeDao.getById(employeeId);

		if (tableId == employeeId) {
			employeeDao.deleteEmployeeById(employeeId);
		} else {
			System.err.println("Idiot given id is not present please check once");
		}
	}

	/*
	 * update method for employee
	 */
	public int updateEmployee(String employeeName, int employeeId) {

		int tableId = employeeDao.getById(employeeId);

		if (tableId == employeeId) {
			int tablefechedId=employeeDao.updateEmployee(employeeName,employeeId);
			System.out.println("Given New Name  "+employeeName+"  Updated-Successfully......");
			return tablefechedId;
		} else {

			System.err.println("Idiot given id is not present please check once....");
			
			return 0;
		}
	}
	
	/*
	 * display method for employee
	 */
	public List<Employee> displayAllEmployees(){
		
		return employeeDao.displayAllEmployees();
	}
	
	/*
	 * getEmployeeById method
	 */
	public Employee getEmployeeById(int emoployeeId) {
		
		int tableId = employeeDao.getById(emoployeeId);
         System.out.println("tableid service  "+tableId);
         
		if (tableId == emoployeeId) {
			return employeeDao.getEmployeeById(emoployeeId);
		} else {
			System.err.println("Idiot given id is not present please check once");
			return null;
		}
		
	}


}
