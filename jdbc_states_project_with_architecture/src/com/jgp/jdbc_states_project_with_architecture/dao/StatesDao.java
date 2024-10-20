package com.jgp.jdbc_states_project_with_architecture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jgp.jdbc_states_project_with_architecture.dto.States;

public class StatesDao {

	/*
	 * 
	 * save method right here;
	 * 
	 */
	public void saveStatesDao(States states) {

		Connection connection = null;

		try {
			// step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user = "root";
			String pass = "0786";

			// step-2 create the connection
			connection = DriverManager.getConnection(url, user, pass);

			// step-3 create the statement;
			Statement statement = connection.createStatement();

			// step-4 execute the Query
			String insertQuery = "insert into states values(" + states.getStatesId() + ",'"
					+ states.getStatesName() + "','" + states.getStatesCapital() + "'," + states.getStatesDistrict() + ")";

			statement.execute(insertQuery);
			System.out.println("Data stored ");
			System.err.println(insertQuery);

		} catch (ClassNotFoundException | SQLException e) {
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

	}
	
	/**
	 * 
	 * getById
	 * 
	 * 
	 */
	public int  getById(int statesId) {
		  
		Connection connection= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user =  "root";
			String pass = "0786";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			Statement statement  = connection.createStatement();
			
			String selectQuery = "SELECT * FROM STATES WHERE id="+statesId;
			
			ResultSet resultSet=statement.executeQuery(selectQuery);
			 
			 while(resultSet.next()) {
				 
				 int id = resultSet.getInt(1);
				 
				 return id;
			 }
			    
			    
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	/*
	 * delete method for states;
	 * 
	 * 
	 */
	public void deleteStatesById(int statesId) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user = "root";
			String pass = "0786";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			Statement statement= connection.createStatement();
			
			String deleteQuery = "DELETE  FROM STATES WHERE id="+statesId;
			statement.executeUpdate(deleteQuery);
			System.out.println("Data deleted successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
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
	}
	
	/*
	 * update method for states;
	 * 
	 * 
	 */
	
	public int updateStates(String statesName,int statesId) {
		Connection connection =  null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url =  "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user = "root";
			String pass = "0786";
			
		    connection = DriverManager.getConnection(url, user, pass);
		    
		    Statement statement= connection.createStatement();
		   
		    String updateQuery ="UPDATE  STATES SET name ='"+statesName+"' WHERE id="+statesId;
		     return statement.executeUpdate(updateQuery);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/*
	 * 
	 * display method 
	 * 
	 */
	public List<States>displayAllStates(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url  = "jdbc:mysql://localhost:3306/jdbc-njjm9";
			String user =  "root";
			String pass =  "0786";
			
			 connection = DriverManager.getConnection(url, user, pass);
			 
			 Statement statement= connection.createStatement();
			 
			 String displayAll ="SELECT * FROM STATES";
			ResultSet resultSet = statement.executeQuery(displayAll);
			
			
			List<States> statess  = new ArrayList<States>();
			
			while(resultSet.next()) {
				
				States state =  new States();
				
				int id = resultSet.getInt("id");
				String name  =resultSet.getString("name");
				String capital1 =resultSet.getString("capital");
				int dis   = resultSet.getInt("district");
				
				
				state.setStatesId(id);
				state.setStatesName(name);
				state.setStatesCapital(capital1);
				state.setStatesDistrict(dis);
				
				statess.add(state);
				
			}
			
			return  statess;
		} catch (ClassNotFoundException | SQLException e) {
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
		return null;
	}
}
