package com.jsp.jdbc_employee_project_with_architecture.dto;

/*Mo  sarafraj navaz
 * this is employee bean class where  i have taken
 *  four attributes
 * 
 */


public class Employee {
	
	 private int employeeId;
	 private String employeeName;
	 private String employeeEmail;
	 private long employeePhone;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}
}
