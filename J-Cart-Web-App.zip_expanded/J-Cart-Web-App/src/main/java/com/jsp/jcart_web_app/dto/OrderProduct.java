package com.jsp.jcart_web_app.dto;

public class OrderProduct {

	private int orderId;
	private String userAddress;
	private String userPhone;
	private String productColor;
	private int productSize;
	private int productQuantity;
	private double finalPrice;
	
	private Product product;
	
	private User user;
	
	

	public OrderProduct() {
		super();
	}



	public OrderProduct(int orderId, String userAddress, String userPhone, String productColor, int productSize,
			int productQuantity, double finalPrice, Product product, User user) {
		super();
		this.orderId = orderId;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.productColor = productColor;
		this.productSize = productSize;
		this.productQuantity = productQuantity;
		this.finalPrice = finalPrice;
		this.product = product;
		this.user = user;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public String getUserAddress() {
		return userAddress;
	}



	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}



	public String getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}



	public String getProductColor() {
		return productColor;
	}



	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}



	public int getProductSize() {
		return productSize;
	}



	public void setProductSize(int productSize) {
		this.productSize = productSize;
	}



	public int getProductQuantity() {
		return productQuantity;
	}



	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}



	public double getFinalPrice() {
		return finalPrice;
	}



	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	
	
}
