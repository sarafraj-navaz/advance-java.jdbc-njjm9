package com.jgp.jdbc_states_project_with_architecture.service;

import java.util.List;

import com.jgp.jdbc_states_project_with_architecture.dao.StatesDao;
import com.jgp.jdbc_states_project_with_architecture.dto.States;

public class StatesService {
	
	
	
	StatesDao statesDao = new StatesDao();
	
	
	// save method 
	
	public void saveStatesDao(States states) {

       statesDao.saveStatesDao(states);
		
	}
	
	/*
	 * delete method for states;
	 * 
	 * 
	 */
	public void deleteStatesById(int statesId) {
	
		int tableId = statesDao.getById(statesId);
		if(tableId ==statesId)
		{
			statesDao.deleteStatesById(tableId);
		}
		else {
			System.err.println("given id is not present in  the table of the database");
		}
	}
	
	/*
	 * 
	 * UPDATE METHOD FOR STATES
	 * 
	 */	
	public int updateStates(String statesName,int statesId) {
		int tableId = statesDao.getById(statesId);
		
		if(tableId == statesId) {
			return statesDao.updateStates(statesName, statesId);
		}
		else {
			System.err.println("Idiot given id is not present please check once....");
			return 0;
		}
		
	}
	
	
	/*
	 * 
	 * display method 
	 * 
	 */
	public List<States>displayAllStates(){
		return statesDao.displayAllStates();
	}

}
