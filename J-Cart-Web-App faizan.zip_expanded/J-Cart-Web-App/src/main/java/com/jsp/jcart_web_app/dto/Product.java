package com.jsp.jcart_web_app.dto;

import java.io.InputStream;
import java.sql.Blob;

public class Product {

	private int productId;
	private String productName;
	private String producttype;
	private String productWearType;
	private double productPrice;
	private String productVerify;
	private InputStream image;
	
	public Product() {
		super();
	}
		
	
	
	public Product(String productName, String producttype, String productWearType, double productPrice,
			InputStream image) {
		super();
		this.productName = productName;
		this.producttype = producttype;
		this.productWearType = productWearType;
		this.productPrice = productPrice;
		this.image = image;
	}



	public Product(int productId, String productName, String producttype, String productWearType, double productPrice,
			String productVerify) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.producttype = producttype;
		this.productWearType = productWearType;
		this.productPrice = productPrice;
		this.productVerify = productVerify;
	}




	public Product(String productName, String producttype, String productWearType, double productPrice) {
		super();
		this.productName = productName;
		this.producttype = producttype;
		this.productWearType = productWearType;
		this.productPrice = productPrice;
	}



	public Product(int productId, String productName, String producttype, String productWearType, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.producttype = producttype;
		this.productWearType = productWearType;
		this.productPrice = productPrice;
	}



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



	public String getProducttype() {
		return producttype;
	}



	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}



	public String getProductWearType() {
		return productWearType;
	}



	public void setProductWearType(String productWearType) {
		this.productWearType = productWearType;
	}



	public double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}



	public String getProductVerify() {
		return productVerify;
	}



	public void setProductVerify(String productVerify) {
		this.productVerify = productVerify;
	}



	public InputStream getImage() {
		return image;
	}



	public void setImage(InputStream image) {
		this.image = image;
	}	
	
}
