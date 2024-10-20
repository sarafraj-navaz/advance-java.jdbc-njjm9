package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.Product;

public class ProductDao {

	Connection connection = UserConnection.getUserConnection();
	
	//save method
	public Product saveProductDao(Product product) {
		String productRegister = "INSERT INTO products(name, type, weartype, price, verify, image) VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(productRegister);
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setString(2, product.getProducttype());
			preparedStatement.setString(3, product.getProductWearType());
			preparedStatement.setDouble(4, product.getProductPrice());
			preparedStatement.setString(5, "no");
			preparedStatement.setBlob(6, product.getImage());
			
			preparedStatement.execute();
			
			return product;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	//displayAllProduct
	public List<Product> displayAllProduct(){
		String displayAll = "SELECT * FROM products";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayAll);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<Product> products = new ArrayList<Product>();
			while(resultSet.next()) {
//				Product product = new Product();
//				product.setProductId(resultSet.getInt("id"));
				
				products.add(new Product(
						resultSet.getInt("id"), 
						resultSet.getString("name"), 
						resultSet.getString("type"), 
						resultSet.getString("weartype"),
						resultSet.getDouble("price"),
						resultSet.getString("verify")
						));
			}
			return products;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	//verify product no to yes
	public int verifyProduct(int productId) {
//		String verify = "UPDATE products SET verify = 'yes' WHERE id="+productId;
				
		try {
//			 Statement statement =  connection.createStatement();
//			 statement.executeUpdate(verify);
			
			return connection.createStatement()
					.executeUpdate("UPDATE products SET verify = 'yes' WHERE id="+productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	//verify product yes to no
	public int unverifyProduct(int productId) {
		try {
			return connection.createStatement()
					.executeUpdate("UPDATE products SET verify = 'no' WHERE id="+productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
