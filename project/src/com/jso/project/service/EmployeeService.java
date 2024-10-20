package com.jso.project.service;

import java.util.List;

import com.jso.project.dao.EmployeeDao;
import com.jso.project.dto.Employee;

public class EmployeeService {
	
	EmployeeDao employeeDao=new EmployeeDao();
	
	public void saveMethodService(Employee employee) {
		
		 employeeDao.saveMethodDao(employee);
	}
	public void deleteDao(int employeeId) {
		employeeDao.deleteDao(employeeId);
	}
	
	public int updateService(String name,int id) {

		return employeeDao.updateDao(name, id);
	}
	public List<Employee> displayAll(){
	   return	employeeDao.displayAll();
	}
}
