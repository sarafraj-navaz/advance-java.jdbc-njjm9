package com.jsp.jcart_web_app.dto;

public class Owner {

	private int ownerId;
	private String ownerName;
	private String ownerEmail;
	private String ownerPassword;
	private long ownerPhone;
	private String verify;
	
	public Owner() {
		super();
	}
	
	
	
	public Owner(String ownerName, String ownerEmail, String ownerPassword, long ownerPhone) {
		super();
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.ownerPassword = ownerPassword;
		this.ownerPhone = ownerPhone;
	}



	public Owner(String ownerEmail, String ownerPassword, String verify) {
		super();
		this.ownerEmail = ownerEmail;
		this.ownerPassword = ownerPassword;
		this.verify = verify;
	}



	public Owner(int ownerId, String ownerName, String ownerEmail, String ownerPassword, long ownerPhone,
			String verify) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.ownerPassword = ownerPassword;
		this.ownerPhone = ownerPhone;
		this.verify = verify;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getOwnerPassword() {
		return ownerPassword;
	}

	public void setOwnerPassword(String ownerPassword) {
		this.ownerPassword = ownerPassword;
	}

	public long getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(long ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}
	
	
	
}
