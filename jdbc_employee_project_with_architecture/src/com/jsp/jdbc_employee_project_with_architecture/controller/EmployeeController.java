package com.jsp.jdbc_employee_project_with_architecture.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc_employee_project_with_architecture.dto.Employee;
import com.jsp.jdbc_employee_project_with_architecture.service.EmployeeService;

public class EmployeeController {


	public static void main(String[] args) {
		
		
		Employee employee = null;
		
		EmployeeService employeeService = new EmployeeService();
		
		Scanner sc =new Scanner(System.in);
        
		while(true) {
			
			System.out.println("choise the option");
			System.out.println(" ");
			System.out.println("1.insert\n 2.delete\n 3.update\n 4.display");
			int choise =sc.nextInt();
			switch (choise) {
			case 1:{
				employee=new Employee();
				System.out.println("enter the id");
				int id=sc.nextInt();
				employee.setEmployeeId(id);
				
				System.out.println("enter the name ");
				String name =sc.next();
				employee.setEmployeeName(name);
				
				System.out.println("enter the email");
				String email =sc.next();
				employee.setEmployeeEmail(email);
				
				System.out.println("enter  the phone number");
				long phone =sc.nextLong();
				employee.setEmployeePhone(phone);
				
				employeeService.saveEmployeeService(employee);
				
				
				
			}
				break;
				
			case 2 :{
				System.out.println("enter the id");
				int id =sc.nextInt();
				
				employeeService.deleteEmployeeService(id);
				
			}break;
			
			case 3:{
				
				System.out.println("enter the id");
				int id=sc.nextInt();
				
				System.out.println("enter  the  employeename");
				String name =sc.next();
				
			int id1 =	employeeService.updateEmployeeService(id, name);
			
			if(id1 != 0) {
				System.out.println("data has been updated");
			}
			else {
				System.out.println("please check the code and ");
			}
				
			}break;
			
			case 4:{
				
				List<Employee> employees= employeeService.displayEmployeeService();
				
				for (Employee employee2 : employees) {
					
					System.out.print(employee2.getEmployeeId()+"\t\t\t");
					System.out.print(employee2.getEmployeeName()+"\t\t\t");
					System.out.print(employee2.getEmployeeEmail()+"\t\t\t");
					System.out.print(employee2.getEmployeePhone());
					System.out.println(" ");
					
				}
				
			}break;

			default:
				break;
			}
			
		}
	}

}
