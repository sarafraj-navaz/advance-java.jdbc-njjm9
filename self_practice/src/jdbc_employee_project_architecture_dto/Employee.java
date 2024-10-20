package jdbc_employee_project_architecture_dto;

public class Employee {
	
	/*
	 * 
	 * 
	 * this is Employee  bean Class
	 * i have  taken 4 variable
	 */

	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private long  employeePhone;
	
	
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
