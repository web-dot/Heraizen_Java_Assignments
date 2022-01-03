package com.heraizen.classes;

public class CalculateSum {
	
	
	public int sum(int ... num) {
		int sum=0;
		for(int i=0; i<num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}
	
}
