
package com.jsp.jdbc_prepared_statement_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.jdbc_prepared_statement_crud_operation.connection.CountryConnection;
import com.jsp.jdbc_prepared_statement_crud_operation.dto.Country;

public class CountryDao {
	
	
	Connection connection =CountryConnection.getCountryConnection();
	
	/*
	 * 
	 * save method
	 */
	public Country saveCountry(Country country) {
		
		String insertCountryQuery = "insert into country values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCountryQuery);
		
			preparedStatement.setInt(1, country.getCountryId());
			preparedStatement.setString(2, country.getCountryName());
			preparedStatement.setString(3,country.getCountryCapital());
			preparedStatement.setInt(4, country.getContryStates());
			
			preparedStatement.execute();
			System.out.println("Data stored");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return country;
	}
	
	
	/*
	 * 
	 * 
	 * delete method
	 */

	public int deleteCountryById(int countryId) {
		
		String deleteQuery ="delete from country where id=?";
		
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(deleteQuery);
			preparedStatement.setInt(1, countryId);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	/*
	 *getById 
	 * 
	 */
	public Country getById(int countryId) {
		
		String selectQuery ="SELECT * FROM country where id=?"; 
		
		PreparedStatement preparedStatement;
		try {
			
			
			preparedStatement =connection.prepareStatement(selectQuery);
			preparedStatement.setInt(1, countryId);
			
			
		    ResultSet resultSet = preparedStatement.executeQuery();
		    
		    if(resultSet.next()) {
		    	Country  country = new Country();
		    	
		    	country.setCountryId(resultSet.getInt("id"));
		    	country.setCountryName(resultSet.getString("name"));
		    	country.setCountryCapital(resultSet.getString("capital"));
		    	country.setContryStates(resultSet.getInt("states"));
		    	
		    	return country;
		    }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/*
	 * 
	 * update method
	 * 
	 */

	public int updateStates(String countryNam,int  countryId) {
		
		 String updateQuery ="UPDATE  COUNTRY SET name = ? WHERE id= ? ";
		 
		 PreparedStatement preparedStatement;
		 
		   
		return 0;
		
	}
}




