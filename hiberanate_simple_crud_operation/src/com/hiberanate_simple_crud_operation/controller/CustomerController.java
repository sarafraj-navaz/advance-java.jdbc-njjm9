package com.hiberanate_simple_crud_operation.controller;

public class CustomerController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=
				Persistance.createEntityManageractory("hibernate");
		entityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=  entityManager.getTransaction();
		
		
	}

}
