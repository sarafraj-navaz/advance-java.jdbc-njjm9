package com.jsp.servlet_demo_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.servlet_demo_project.connection.UserConnection;
import com.jsp.servlet_demo_project.dto.User;

public class UserDao {

	Connection connection = UserConnection.getUserConnection();

	public User saveUserDao(User user) {

		String insertUserQuery = "insert into user" + "(username,useremail,userphone,usergender,useraddress)"
				+ " values(?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertUserQuery);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getUserEmail());
			preparedStatement.setLong(3, user.getUserPhone());
			preparedStatement.setString(4, user.getUserGender());
			preparedStatement.setString(5, user.getUserAddress());
			preparedStatement.execute();
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * display user details
	 */
	public List<User> displayAllUser() {

		String displayQuery = "SELECT * FROM user";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayQuery);

			ResultSet resultSet = preparedStatement.executeQuery();

			List<User> users = new ArrayList<User>();

			while (resultSet.next()) {
				User user = new User();

				user.setUserId(resultSet.getInt("userid"));
				user.setUserAddress(resultSet.getString("useraddress"));
				user.setUserEmail(resultSet.getString("useremail"));
				user.setUserGender(resultSet.getString("usergender"));
				user.setUserName(resultSet.getString("username"));
				user.setUserPhone(resultSet.getLong("userphone"));
				users.add(user);
			}

			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void deleteUserByIdDao(int userId) {
		String deleteQuery = "delete from user where userid=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
			preparedStatement.setInt(1, userId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public User getUserById(int userId) {
		String displayQuery = "SELECT * FROM user where userid=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayQuery);

			preparedStatement.setInt(1, userId);
			
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				User user = new User();

				user.setUserId(resultSet.getInt("userid"));
				user.setUserAddress(resultSet.getString("useraddress"));
				user.setUserEmail(resultSet.getString("useremail"));
				user.setUserGender(resultSet.getString("usergender"));
				user.setUserName(resultSet.getString("username"));
				user.setUserPhone(resultSet.getLong("userphone"));
				
				return user;
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * update
	 */
	public int updateUserByIdDao(User user) {
		
		String updateQuery = "update user set username=?,useremail=?,"
				+ "usergender=?,useraddress=?,userphone=?  where userid=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getUserEmail());
			preparedStatement.setString(3, user.getUserGender());
			preparedStatement.setString(4, user.getUserAddress());
			preparedStatement.setLong(5, user.getUserPhone());
			preparedStatement.setInt(6, user.getUserId());
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
	}
}
