package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.Product;

public class ProductDao {

	Connection connection = UserConnection.getUserConnection();

	public Product saveProductDao(Product product) {

		String productRegisterQuery = "insert into products(name,type,weartype,price,verify,image) values(?,?,?,?,?,?)";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(productRegisterQuery);
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setString(2, product.getProductType());
			preparedStatement.setString(3, product.getProductWearType());
			preparedStatement.setDouble(4, product.getProductPrice());
			preparedStatement.setString(5, "no");
			preparedStatement.setBlob(6, product.getInputStream());
			preparedStatement.execute();
			return product;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Product> getAllProductData() {

		String displayProductDataQuery = "SELECT * FROM products";

		try {
			ResultSet resultSet = connection.prepareStatement(displayProductDataQuery).executeQuery();

			List<Product> products = new ArrayList<Product>();

			while (resultSet.next()) {
				products.add(new Product(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getString("type"), resultSet.getString("weartype"), resultSet.getDouble("price"),
						resultSet.getString("verify")));
			}

			return products;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Product> getAllMenProductsDao() {

		List<Product> products = getAllProductData();

		List<Product> mens = new ArrayList<Product>();

		for (Product product : products) {

			if (product.getProductType().equalsIgnoreCase("men")) {

				mens.add(product);
			}
		}

		return mens;
	}

	public List<Product> getAllWomenProductsDao() {

		List<Product> products = getAllProductData();

		List<Product> womens = new ArrayList<Product>();

		for (Product product : products) {

			if (product.getProductType().equalsIgnoreCase("women")) {

				womens.add(product);
			}
		}

		return womens;
	}
	
	public Product getProductByIdDao(int productId) {
		
		String selectQuery = "SELECT * FROM products WHERE id=?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			
			preparedStatement.setInt(1, productId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			Product product=null;
			if (resultSet.next()) {
				product=new Product(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getString("type"), resultSet.getString("weartype"), resultSet.getDouble("price"),
						resultSet.getString("verify"));
			}

			return product;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
