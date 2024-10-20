package com.jsp.jdbc_prepared_statement_crud_operation.controller;

import java.util.Scanner;

import com.jsp.jdbc_prepared_statement_crud_operation.dto.Country;
import com.jsp.jdbc_prepared_statement_crud_operation.service.CountryService;

public class CountryController {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("main method has started");
		
		// we have to make object of the country Dto Class
		Country  country =  new Country();
		
		//we have to make service object of the Class 
		CountryService countryService = new CountryService();
		
		
		while(true) {
			System.out.println("1.insert\n2.Delete\n3.Update\n4.Display\n6. iiii\n7.Exit");
			System.err.println("chose the  option");

			int ch =scanner.nextInt();
			switch(ch) {
			
			case 1:{
				System.out.println("case 1 is start");
				
				System.out.println("please enter the countryid");
				int id =scanner.nextInt();
				country.setCountryId(id);
				
				System.out.println("please enter the name of the country");
				String name =scanner.next();
				
				name =  name+scanner.nextLine();
				country.setCountryName(name);
				
				System.out.println("please enter the capital of the country");
				String capital = scanner.next();
				country.setCountryCapital(capital);
				
				
				System.out.println("please enter the states of the country");
				int statesName = scanner.nextInt();
				country.setContryStates(statesName);
				
				countryService.saveCountry(country);
				
			}break;
			
			case  2:{
				System.out.println("please enter the id to delete your country");
				int id =  scanner.nextInt();
				countryService.deleteCountryById(id);
			} break;
			
			case 3:{
				
			}break;
			
			case 4:{
				
			}break;
			
			case 5:  {
				
			}break;
			}
		}
		
		
	}

}
