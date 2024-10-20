package jdbc_employee_project_architecture_Service;

import jdbc_employee_project_architecture_Dao.EmployeeDao;
import jdbc_employee_project_architecture_dto.Employee;

public class EmployeeService {

	
	/*
	 * 
	 * i am creating one object to  take properties of the employeeDao class
	 */
	
	 EmployeeDao employeeDao = new EmployeeDao();
	
	public void saveEmployeeService(Employee employee) {
		
		System.out.println("this is service class");

		employeeDao.saveEmployeeDao(employee);
		
	}
}
