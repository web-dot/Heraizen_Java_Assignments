package com.heraizen.classes;

public class CurrentAccount extends BankAccount {
	
	
	public CurrentAccount(String custName, int balance) {
		this.custName=custName;
		this.balance=balance;
	}
	
	public void deposit(float amt) {
		if(amt<0) {
			throw new NegetiveAmountException("PLease check entered amount");
		}
		else {
			this.balance+=amt;
			System.out.println("balance: " + this.balance);
		}
	}
	public void withdraw(float amt) {
		if(amt<0) {
			throw new NegetiveAmountException("Please check entered amount");
		}
		if(balance-amt<5000) {
			throw new InsufficientFundsException("Not enough balance");
		}
		else {
			this.balance-=amt;
			System.out.println("balance: " + this.balance);
		}
	}
	public void getBalance() {
		System.out.println(this.balance);
	}
}
