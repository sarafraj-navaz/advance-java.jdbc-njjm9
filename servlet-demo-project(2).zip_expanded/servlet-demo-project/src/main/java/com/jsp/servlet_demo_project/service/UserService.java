package com.jsp.servlet_demo_project.service;

import com.jsp.servlet_demo_project.dao.UserDao;
import com.jsp.servlet_demo_project.dto.User;

public class UserService {

	UserDao userDao = new UserDao();
	
	public User saveUserService(User user) {
		
		return userDao.saveUserDao(user);
	}
	
	public void deleteUserByIdService(int userId) {
		
		userDao.deleteUserByIdDao(userId);
	}
	
	/*
	 * update
	 */
	public int updateUserByIdService(User user) {
		return userDao.updateUserByIdDao(user);
	}
}
