package com.jsp.jcart_web_app.service;

import com.jsp.jcart_web_app.dao.ProductDao;
import com.jsp.jcart_web_app.dto.Product;

public class ProductService {

	ProductDao dao = new ProductDao();

	// save method
	public Product saveProductService(Product product) {
		return dao.saveProductDao(product);
	}

	// verify product no to yes
	public int verifyProductService(int productId) {
		return dao.verifyProduct(productId);
	}

	// verify product yes to no
	public int unverifyProductService(int productId) {
		return dao.unverifyProduct(productId);
	}
}
