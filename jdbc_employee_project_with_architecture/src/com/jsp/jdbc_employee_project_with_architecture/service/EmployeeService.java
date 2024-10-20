package com.jsp.jdbc_employee_project_with_architecture.service;

import java.util.List;

import com.jsp.jdbc_employee_project_with_architecture.dao.EmployeeDao;
import com.jsp.jdbc_employee_project_with_architecture.dto.Employee;

public class EmployeeService {

	
	EmployeeDao dao = new EmployeeDao();
	/*
	 * service save method
	 */
	public void saveEmployeeService(Employee employee) {
		
		dao.saveEmployeeDao(employee);
		
	}
	/*
	 * 
	 * delete method
	 */
	
	public void deleteEmployeeService(int employeeId) {
		
		dao.deleteEmployeeDao(employeeId);
	}
	/*
	 * update dao method
	 * 
	 */
	public int updateEmployeeService(int employeeId,String employeeName) {
		
	return	dao.updateEmployeeDao(employeeId, employeeName);
	}
	
	/*
	 * display method
	 * 
	 */
	
	public List<Employee> displayEmployeeService(){
		
		return dao.displayEmployeeDao();
	}
}
