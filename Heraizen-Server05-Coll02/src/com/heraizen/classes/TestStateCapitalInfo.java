package com.heraizen.classes;

public class TestStateCapitalInfo {

	public static void main(String[] args) {
		
		StateCapitalInfo stateInfo = new StateCapitalInfo();
		
		stateInfo.addStateCapital("state1", "capital1");
		stateInfo.addStateCapital("state2", "capital2");
		
		stateInfo.viewCapital("state3");
		

	}

}
