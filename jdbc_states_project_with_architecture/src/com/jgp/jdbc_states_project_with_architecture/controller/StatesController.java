package com.jgp.jdbc_states_project_with_architecture.controller;

import java.util.List;
import java.util.Scanner;

import com.jgp.jdbc_states_project_with_architecture.dto.States;
import com.jgp.jdbc_states_project_with_architecture.service.StatesService;


public class StatesController {
	
	
	Scanner scanner =  new Scanner(System.in);
	States states =  new States();
	
	StatesService statesService =  new StatesService();
	

	public static void main(String[] args) {
		
		System.out.println("main method has started");
		
		Scanner scanner =  new Scanner(System.in);
		States states =  new States();
		StatesService statesService =  new StatesService();
		
		while(true) {
			System.out.println("1.insert\n2.delete\n3.Update name of the  states\n4.displayAll detail\n5.Exit");
			System.out.println("enter the option");
			int  ch=scanner.nextInt();
			
			switch(ch) {
			
			
			case 1:{
				
				System.out.println("enter  the states id");
				int id = scanner.nextInt();
				states.setStatesId(id);
				
				System.out.println("enter the name of the states");
				String name = scanner.next();
				states.setStatesName(name);
				
				System.out.println("enter the capital of the states");
				String capital = scanner.next();
				states.setStatesCapital(capital);
				
				System.out.println("enter the districk no.  of the states" );
				int dis = scanner.nextInt();
				states.setStatesDistrict(dis);
				
				statesService.saveStatesDao(states);
			}break;
			
			case 2:{
				System.out.println("please enter the id of the states");
				int id =scanner.nextInt();
				statesService.deleteStatesById(id);
			}break;
			
			case  3:{
				System.out.println("enter states id where  you want  to update name  of the states");
				int id = scanner.nextInt();
				System.out.println("enter  the  states which name you want to update");
				String name =scanner.next();
				statesService.updateStates(name, id);
			}break;
			
			case 4:{
				
				List<States> statess  = statesService.displayAllStates();
				int count = 0;
				
				System.out.println("statesId\t\tstatesName\t\tstatesCapital\t\tstatesDistrict");
				for (States state2 : statess) {
					count++;
//					System.out.print(state2.getStatesId()+"t\t");
//					System.out.print(state2.getStatesName()+"t\t\t");
//					System.out.print(state2.getStatesCapital()+"t\t\t");
//					System.out.println(state2.getStatesDistrict());
//					System.out.println("");
					System.out.println("StateId==="+state2.getStatesId()+"\t\t"+"State Name =="+state2.getStatesName()+"\t\t"+"State Capital "+state2.getStatesCapital()+"\t\t"+"State district "+state2.getStatesDistrict());
					
				}
				
				System.out.println(count);
			}
			
			}
			
		}

		
	}

}
