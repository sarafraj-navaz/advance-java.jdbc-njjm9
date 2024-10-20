package com.jsp.jdbc_prepared_statement_crud_operation.dto;

public class Country {
	
	private int countryId;
	private String countryName;
	private String countryCapital;
	private int contryStates;
	
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	public int getContryStates() {
		return contryStates;
	}
	public void setContryStates(int contryStates) {
		this.contryStates = contryStates;
	}

}
