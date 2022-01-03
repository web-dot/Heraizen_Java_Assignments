package com.heraizen.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCapitalInfo {
	
	private Map<String, String> state_capital=new HashMap<String, String>();
	
	public void addStateCapital(String state, String capital) {
		
		state_capital.put(state, capital);
	}
	
	public void viewCapital(String stateName) {
		
		Set<String> set = state_capital.keySet();
		boolean found = false;
		String capital="";
		
		for(String key : set) {
			String state=key;
			if(state.equals(stateName)) {
				capital=state_capital.get(stateName);
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println(capital);
		}
		else {
			System.out.println("State not found");
		}
	}
}
