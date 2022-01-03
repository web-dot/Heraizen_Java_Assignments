package com.heraizen.classes;

public class SavingsAccount extends BankAccount {
	
	
	public SavingsAccount(String custName, float balance) {
		this.custName=custName;
		this.balance=balance;
	}
	
	public void deposit(float amt) {
		if(amt<0) {
			throw new NegetiveAmountException("Please check the entered amount");
		}
		else {
			this.balance+=amt;
			System.out.println("balance: " + this.balance);
		}
	}
	public void withdraw(float amt) {
		if(amt<0) {
			throw new NegetiveAmountException("PLease check the entered amount");
		}
		if(this.balance-amt<1000) {
			throw new InsufficientFundsException("Not enough balance");
		}
		else {
			balance-=amt;
			System.out.println("balance: " + balance);
		}
	}
	public void getBalance() {
		System.out.println("balance: " + this.balance);
	}
}
