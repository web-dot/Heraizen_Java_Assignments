package com.heraizen.classes;

public class CurrencyContainer {
	
	
	public static Currency getCurrency(String country) {
		
		if(country.equals("India")) {
			return new India();
		}
		if(country.equals("USA")) {
			return new USA();
		}
		if(country.equals("UK")) {
			return new UK();
		}
		else {
			throw new IllegalArgumentException();
		}
		
	}
}
