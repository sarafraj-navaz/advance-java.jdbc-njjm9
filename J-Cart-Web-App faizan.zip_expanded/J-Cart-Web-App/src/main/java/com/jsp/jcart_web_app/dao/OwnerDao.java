package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.Owner;
import com.mysql.cj.xdevapi.Result;

public class OwnerDao {

	Connection connection = UserConnection.getUserConnection();

	// save()
	public Owner saveOwnerDao(Owner owner) {
		String save = "INSERT INTO owner(name, email, password, phone, verify) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(save);
			preparedStatement.setString(1, owner.getOwnerName());
			preparedStatement.setString(2, owner.getOwnerEmail());
			preparedStatement.setString(3, owner.getOwnerPassword());
			preparedStatement.setLong(4, owner.getOwnerPhone());
			preparedStatement.setString(5, "no");
			preparedStatement.execute();

			return owner;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Owner loginWithEmailPassword(String email) {
		String selectEmailQuery = "SELECT * FROM owner WHERE email=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(selectEmailQuery);
			preparedStatement.setString(1, email);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return new Owner(resultSet.getString("email"), resultSet.getString("password"),
						resultSet.getString("verify"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Owner> displayAllOwner(){
		String displayAll = "SELECT * FROM owner";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayAll);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			List<Owner> owners = new ArrayList<Owner>();
			while(resultSet.next()) {
				owners.add(new Owner(
						resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getString("email"),
						resultSet.getString("password"),
						resultSet.getLong("phone"),
						resultSet.getString("verify")
						));
			}
			return owners;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * verify owner from no to yes
	 */
	public int verifyOwnerById(int ownerId) {
		try {
			return connection.createStatement()
					.executeUpdate("UPDATE owner SET verify = 'yes' WHERE id="+ownerId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
