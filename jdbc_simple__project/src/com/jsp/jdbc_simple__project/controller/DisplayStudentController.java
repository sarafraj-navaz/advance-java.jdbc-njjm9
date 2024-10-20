package com.jsp.jdbc_simple__project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DisplayStudentController {

	public static void main(String[] args) {
		Connection connection = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbs-njjm9";
			String user = "root";
			String pass = "0786";

			connection=DriverManager.getConnection(url, user, pass);

			Statement statement = connection.createStatement();

			String display = "SELECT * FROM student";
			ResultSet set = statement.executeQuery(display);
			/*
			 * 
			 * at the time we are using get method to take data from the data base 
			 * and then we are stroing same type of the data;
			 * 
			 */

			while (set.next()) {
				int id = set.getInt("id");
				String name = set.getString("name");
				String email = set.getString("email");
				
				
				System.out.print("id ===" + id +"  ");
				System.out.print("name ====" + name+"   ");
				System.out.println("email====" + email);
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
