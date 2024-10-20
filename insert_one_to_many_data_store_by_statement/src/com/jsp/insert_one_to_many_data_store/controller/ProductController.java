package com.jsp.insert_one_to_many_data_store.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.insert_one_to_many_data_store.dto.Product;
import com.jsp.insert_one_to_many_data_store.service.ProductService;

public class ProductController {

	public static void main(String[] args) {

		Product product = null;

		ProductService productService = new ProductService();

		Scanner sc = new Scanner(System.in);

		

		while (true) {
			System.out.println("enter the choice of the operation");
			System.out.println("1.Insert\n 2.Display\n 3.displayAll where name is same \n 4.delete\n 5.update");
			int choice = sc.nextInt();
			
			switch (choice) {

			case 1: {
				
              for(int i=1;i<3;i++) {
  				product = new Product();
  				System.out.println("enter the id");
  				int id = sc.nextInt();
  				product.setProductId(id);
  				
  				System.out.println("enter the name");
  				String name = sc.next();
  				product.setProductName(name);
  				   
  				
  				productService.saveProductService(product);
  				
  				System.out.println(i+"Time");
            	  
              }
              System.out.println("you have stored  your maximum data at the time");
             
			}
				break;
			case 2:{
				
				List<Product> products = productService.displayAllService();
				
				for (Product product2 : products) {
					
					System.out.print(product2.getProductId()+"\t\t");
					System.out.print(product2.getProductName());
					
					System.out.println(" ");
					
				}
				
			}break;
			
			case 3:{
				
				System.out.println("enter the name ");
				
				String name =sc.next();
				
				List<Product> productOnly= productService.displayOnlyService(name);
				
				for (Product product2 : productOnly) {
					
					System.out.print(product2.getProductId()+"\t\t\t");
		            System.out.print(product2.getProductName());
		            
		            System.out.println(" ");
				}
				
			} break;
			
			case 4:{
				System.out.println("enter the id");
				int id=sc.nextInt();
				
				productService.deleteDao(id);
			}
			case 5 :{
				System.out.println("enter the id");
				int id=sc.nextInt();
				
				System.out.println("enter the String");
				String name =sc.next();
				
				int id1= productService.updateService(id, name);
				if(id1 != 0) {
					System.out.println("data has been updated");
				}
				else {
					System.out.println("please check your id");
				}
			}break;
			default: {
				System.out.println("please check id operation");
			}
			}

		}

	}

}
