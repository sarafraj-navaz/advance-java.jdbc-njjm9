package com.jsp.insert_one_to_many_data_store.dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.insert_one_to_many_data_store.connection.ProductConnection;
import com.jsp.insert_one_to_many_data_store.dto.Product;

public class ProductDao {
	
	
	Connection con= ProductConnection.getConnection();
	
	public void saveProductDao(Product product) {
		
	    try {
			Statement statement= con.createStatement();
			
			String insertQuery ="insert into product value("+product.getProductId()+",'"+product.getProductName()+"')";
			statement.execute(insertQuery);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}   
		/*
		 * 
		 * display method 
		 */
	    
	public List<Product> displayAllDao(){
		
		try {
			Statement statement= con.createStatement();
			
			String displayQuery = "select * from product";
			
			ResultSet rs= statement.executeQuery(displayQuery);
			
			List<Product> products = new ArrayList<Product>();
			
			while(rs.next()) {
				
				Product product = new Product();
				
				int id = rs.getInt("productid");
				String name = rs.getString("productname");
				
				product.setProductId(id);
				product.setProductName(name);
				
				products.add(product);
				
			}
			
			return products;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/*
	 * display onle where name is same 
	 * 
	 */
	
	public List<Product> displayOnlyDao(String productname){
		
		try {
			Statement statement = con.createStatement();
			
			String displayQuery = "select *  from product where productname ="+"productname";
			
			ResultSet rs = statement.executeQuery(displayQuery);
			
			List<Product> products1 = new ArrayList<Product>();
			
			while(rs.next()) {
				
				Product product = new Product();
				
			int id = rs.getInt("productid");
			String name = rs.getString("productname");
			
			product.setProductId(id);
			product.setProductName(productname);
			
			products1.add(product);
			
			}
			return products1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;	
	}
	
	
	/*
	 * delete method
	 * 
	 */
	public void deleteDao(int productId) {
		
		try {
			Statement statement= con.createStatement();
			String deleteQuery = "delete from product where productid ="+productId;
			
			int id = statement.executeUpdate(deleteQuery);
			
			if(id != 0) {
				
				System.out.println("data have been deleted");
			}
			else {
				System.out.println("please check id whatever you have given");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/*
	 * update method
	 * 
	 */
	public int updateDao(int productId,String productName) {
		
		try {
			 Statement statement  = con.createStatement();
			 String updateQuery =  "update product set productname ='"+productName+"' where productid ="+productId;
			   
			int id= statement.executeUpdate(updateQuery);
			return id;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
