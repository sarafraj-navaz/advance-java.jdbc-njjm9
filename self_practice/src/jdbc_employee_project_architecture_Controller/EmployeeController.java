package jdbc_employee_project_architecture_Controller;

import java.util.Scanner;

import jdbc_employee_project_architecture_Service.EmployeeService;
import jdbc_employee_project_architecture_dto.Employee;

public class EmployeeController {

	public static void main(String[] args) {
	
		System.out.println("this is main method");
		Scanner sc = new Scanner(System.in);
		
		
		// Object of the Employee Dto
		Employee employee = new Employee();
		
		// Object of the Service Class;
		EmployeeService  employeeService = new EmployeeService();
		
	   
		while(true) {
			
			System.out.println("chose the option");
			System.out.println("1- insert the data");
			int  ch=sc.nextInt();
			
			switch(ch) {
		

			case 1:{
				
				System.out.println("system has ready to take data by user");
				
				System.out.println("please enter the id ");
				int  id = sc.nextInt();
				employee.setEmployeeId(id);
				
				System.out.println("please enter  the name ");
				String name =sc.next();
				employee.setEmployeeName(name);
				
				
				System.out.println("please enter the email");
				String email = sc.next();
				employee.setEmployeeEmail(email);
				
				
				System.out.println("please enter the phone number");
				long phone = sc.nextLong();
				employee.setEmployeePhone(phone);
				
				employeeService.saveEmployeeService(employee);
				
				System.out.println("stop case 1");
				
			}break;

			}
		}
		
		

	}

}
