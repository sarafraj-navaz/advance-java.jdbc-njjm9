package com.jso.project.controller;

import java.util.List;
import java.util.Scanner;

import com.jso.project.dto.Employee;
import com.jso.project.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		EmployeeService employees=new EmployeeService();
		
		System.out.println("you have enterd in main method");
		
        while(true) {
    		System.out.println("chose the option");

    		Scanner sc=new Scanner(System.in);
    		System.out.println("1.insert the data \n 2.delete the data\n3.update\n4.display\n5.exit");
    		switch(sc.nextInt()) {
    		case 1:{
    			System.out.println("enter the id");
    			int id=sc.nextInt();
    			employee.setEmployeeId(id);
    			
    			System.out.println("enter the name");
    			String name=sc.next();
    			employee.setEmployeeName(name);
    			
    			System.out.println("enter the  email");
    			String email=sc.next();
    			employee.setEmployeeEmail(email);
    			
    			System.out.println("enter the age");
    			int age=sc.nextInt();
    			employee.setAge(age);
    			
    			employees.saveMethodService(employee);
    			
    		}break;
    		case 2:{
    			
    			System.out.println("we are going to update the table");
    			
    			System.out.println("enter the id");
    			int id=sc.nextInt();
    			employee.setEmployeeId(id);
    			
    			employees.deleteDao(id);
    			
    			
    			
    		}break;
    		
    		case 3:{
    			System.out.println("update method");
    			
    			System.out.println("enter the name");
    			String name = sc.next();
    			employee.setEmployeeName(name);
    			
    			System.out.println("enter the id");
    			int id=sc.nextInt();
    			employee.setEmployeeId(id);
    			
    			
    			employees.updateService(name, id);
    		}break;
    		
    		case 4:{
    
    			
    			List<Employee> employee1=employees.displayAll();
				
				System.out.println("1.employeeId\t2.employeeName\t3.employeeEmail\t4.employeeAge");
				for (Employee employee2 : employee1) {
					
					System.out.print(employee2.getEmployeeId()+" \t\t");
					System.out.print(employee2.getEmployeeName()+" \t\t\t");
					System.out.print(employee2.getEmployeeEmail()+" \t\t\t");
					System.out.print(employee2.getAge()+" \t\t\t");
					System.out.print("");
				}
    			
    		}break;
    		
    		case 5:{
    			System.exit(0);
    		}break;
    		default :{
    			   System.out.println("it is default caseof the switch");
    		   }
    	
    		
    		}
        }
	}

}
