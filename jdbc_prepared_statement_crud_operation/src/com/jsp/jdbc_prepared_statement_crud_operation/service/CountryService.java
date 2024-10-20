package com.jsp.jdbc_prepared_statement_crud_operation.service;

import com.jsp.jdbc_prepared_statement_crud_operation.dao.CountryDao;
import com.jsp.jdbc_prepared_statement_crud_operation.dto.Country;

public class CountryService {
	
	  
	CountryDao countryDao = new CountryDao();
	
	/*
	 * 
	 * 
	 * save method 
	 */
	public Country saveCountry(Country country) {
		
		if((country.getContryStates()>=5 && (country.getContryStates()<=30)) && (country.getCountryCapital().length()<=5)) {
			return countryDao.saveCountry(country);	
		}
		else
		{
			System.err.println("please enter the validation details");
			return null;
		}
		
	}	
		
		
	/*
	 * 
	 * deleted maoves
	 * 
	 */

	public int deleteCountryById(int countryId) {
		
		Country country =  countryDao.getById(countryId);
		
		if(country != null) {
			return countryDao.deleteCountryById(countryId);
		}
		else {
			System.out.println("id not found");
			return 0;
		}
		
	}
		
	

}

