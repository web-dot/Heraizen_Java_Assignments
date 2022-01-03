package com.heraizen.classes;

public abstract class BankAccount {
	
	int accNo;
	String custName;
	//String accType;
	float balance;
	
	public abstract void deposit(float amt);
	public abstract void withdraw(float amt);
	public abstract void getBalance();
	
}
