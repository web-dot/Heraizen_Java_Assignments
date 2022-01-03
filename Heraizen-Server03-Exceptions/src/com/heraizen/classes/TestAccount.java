package com.heraizen.classes;

public class TestAccount {

	public static void main(String[] args) {
		
		/*
		BankAccount ba1 = new SavingsAccount("Ramu", 10000);
		//ba1.deposit(-1000);
		ba1.deposit(2000);
		//ba1.withdraw(11001);
		ba1.withdraw(5000);
		ba1.deposit(50000);
		ba1.getBalance();
		ba1.withdraw(55000);
		//ba1.withdraw(1500);
		*/
		
		BankAccount ba2 = new CurrentAccount("gomu", 50000);
		//ba2.deposit(-1000);
		ba2.deposit(2000);
		ba2.withdraw(11001);
		ba2.withdraw(5000);
		ba2.deposit(50000);
		ba2.getBalance();
		ba2.withdraw(55000);
		ba2.withdraw(26000);
		
		
	}

}
