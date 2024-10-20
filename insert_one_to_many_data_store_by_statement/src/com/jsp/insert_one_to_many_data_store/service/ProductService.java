package com.jsp.insert_one_to_many_data_store.service;

import java.util.List;

import com.jsp.insert_one_to_many_data_store.dao.ProductDao;
import com.jsp.insert_one_to_many_data_store.dto.Product;

public class ProductService {
	
	ProductDao productDao=new ProductDao();
	
	public void saveProductService(Product product) {
		
		productDao.saveProductDao(product);
		
	}
	
	/*
	 * 
	 * display 
	 */
	public List<Product> displayAllService(){
		
		return productDao.displayAllDao();
	}

	/*
	 * 
	 * display only where is name same
	 */
	public List<Product> displayOnlyService(String productname){
		
	return	productDao.displayOnlyDao(productname);
	}
	
	/*
	 * 
	 * deleteService
	 */
	
	public void deleteDao(int productId) {
		
		productDao.deleteDao(productId);
	}
	
	/*
	 * update 
	 * 
	 */
	public int updateService(int productId,String productName) {
		
		return productDao.updateDao(productId, productName);
	}
}
