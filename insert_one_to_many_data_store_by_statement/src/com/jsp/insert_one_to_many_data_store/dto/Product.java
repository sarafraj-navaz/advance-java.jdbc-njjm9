package com.jsp.insert_one_to_many_data_store.dto;

public class Product {

	private int productId;
	private String productName;


	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		
		this.productId = productId;
	}
	
	public String getProductName() {
		
		return productName;
	}
	
	public void setProductName(String productName) {
		
		this.productName = productName;
	}
}
