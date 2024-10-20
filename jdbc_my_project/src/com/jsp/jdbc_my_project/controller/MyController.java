package com.jsp.jdbc_my_project.controller;

import java.util.Scanner;

public class MyController {

	public static void main(String[] args) {
		
		System.out.println("you have enterd main method");
		Scanner sc=new Scanner(System.in);
		
		int choise=sc.nextInt();
		switch (choise) {
		case 1:
			System.out.println("you have enterd for inserting data in the table");
			
			
			break;

		default:
			break;
		}
	}

}
