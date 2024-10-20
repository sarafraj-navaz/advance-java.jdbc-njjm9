package com.jsp.jcart_web_app.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jsp.jcart_web_app.dao.OwnerDao;
import com.jsp.jcart_web_app.dto.Owner;

public class OwnerService {

	OwnerDao dao = new OwnerDao();
	
	public Owner saveOwnerService(Owner owner) {
//		return dao.saveOwnerDao(owner);
		if((owner.getOwnerPassword().length()>=8) && (owner.getOwnerPassword().length()<=15)) {
			
			Matcher alphabet = Pattern.compile("[a-zA-Z]").matcher(owner.getOwnerPassword());
			Matcher number = Pattern.compile("[0-9]").matcher(owner.getOwnerPassword());
			Matcher special = Pattern.compile("[!@#$%^&*()_/]").matcher(owner.getOwnerPassword());
			//matcher return true
			if ((alphabet.find()) && (number.find()) && (special.find())) {
				return dao.saveOwnerDao(owner);
			}else {
				return null;
			}
			
		}else {
			return null;
		}
	}
	
	public Owner loginWithEmailPassword(String email) {
		return dao.loginWithEmailPassword(email);
	}
	/**
	 * verify owner from no to yes
	 */
	public int verifyOwnerByIdService(int ownerId) {
		return dao.verifyOwnerById(ownerId);
	}
}
