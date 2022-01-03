package com.heraizen.classes;

public class InsufficientFundsException extends RuntimeException {
	
	public InsufficientFundsException() {
		
	}
	
	public InsufficientFundsException(String s) {
		super(s);
	}
}
