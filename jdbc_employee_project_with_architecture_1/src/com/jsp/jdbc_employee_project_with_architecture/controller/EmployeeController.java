package com.jsp.jdbc_employee_project_with_architecture.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc_employee_project_with_architecture.daocom.jsp.jdbc_employee_project_with_architecture.service.EmployeeService;

import jdbc_employee_project_with_architecturecom.jsp.jdbc_employee_project_with_architecture.dto.Employee;

public class EmployeeController {

	public static void main(String[] args) {
		
			System.out.println("Main-Method-Started.....");
			Scanner scanner = new Scanner(System.in);
			Employee employee  = new Employee();
			
			EmployeeService employeeService = new EmployeeService();
			while(true) {
				
				System.out.println("1.insert\n2.Delete\n3.Update\n4.Display\n5.getEmployeeById\n6.Exit");
				System.out.println("Enter your option...");
				int ch = scanner.nextInt();
				
				switch(ch) {
				
				case 1:{
						System.out.println("Case-1 Started");
						System.out.println("please enter your id");
						int id = scanner.nextInt();
						employee.setEmployeeId(id);
						
						System.out.println("please enter your name");
						String name = scanner.next();
						employee.setEmployeeName(name);
						
						System.out.println("please enter your email");
						String email = scanner.next();
						employee.setEmployeeEmail(email);
						
						System.out.println("please enter your phone");
						long phone = scanner.nextLong();
						employee.setEmployeePhone(phone);
						
						employeeService.saveEmployeeService(employee);
						
						System.out.println("Case-1 Ended");
				}break;
				
				case 2:{
					System.out.println("please enter your id to delete yourself");
					int id = scanner.nextInt();
					employeeService.deleteEmployeeById(id);
				}break;
				
				case 3:{
					System.out.println("please enter your id to update yourname");
					int id = scanner.nextInt();
					System.out.println("please enter your new name");
					String name = scanner.next();
					employeeService.updateEmployee(name, id);
				}break;
				
				case 4:{
					
					List<Employee>  employees=employeeService.displayAllEmployees();
					int count = 0;
					
					System.out.println("1.employeeId\t2.employeeName\t3.employeeEmail\t4.employeePhone");
					for (Employee employee2 : employees) {
						count++;
						
						System.out.print(employee2.getEmployeeId()+" \t\t");
						System.out.print(employee2.getEmployeeName()+"\t\t\t");
						System.out.print(employee2.getEmployeeEmail()+"\t\t\t");
						System.out.print(employee2.getEmployeePhone());
						System.out.println("");
					}
					
					System.out.println(count);
					
				}break;
				
				case 5:{
					
					System.out.println("it will be display one row data of the Table what do you want to display");
					System.out.println("enter the id of the Table which table row data you want to  display");
					int id = scanner.nextInt();
					
					Employee employee1=employeeService.getEmployeeById(id);
					
					if(employee1!=null) {
						System.out.println(employee1.getEmployeeId());
						System.out.println(employee1.getEmployeeName());
						System.out.println(employee1.getEmployeeEmail());
						System.out.println(employee1.getEmployeePhone());
					}
					
				}break;
				
				case 6:{
						System.exit(0);
				}break;
				
				default:System.err.println("Invalid option given by user ...please provide the valid option");
				}
			}
		}
	}


