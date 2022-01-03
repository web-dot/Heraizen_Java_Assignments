package com.heraizen.classes;

import java.util.Scanner;

public class UserInput {
	
	public static void getInput() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s1.nextInt();
		System.out.println("Enter a choice: 1[Factorial] 2[Table] 3[Prime or not]");
		int choice = s1.nextInt();
		
		switch(choice) 
		{
			case 1: 
				int factorial = 1;
				for(int i=1; i<=num; i++) {
					factorial = factorial*i;
				}
				System.out.println("Factorial:" + factorial);
				break;
			case 2:
				for(int i=1; i<=10; i++) {
					System.out.println(num + " * " + i + " = " + num*i);
				}
				break;
			case 3:
				boolean isPrime = false;
				int pot = 0;
				int top = 0;
				
				if(num==1) {
					isPrime=false;
				}
				for(int i=2; i<num; i++) {
					if(num%i==0) {
						isPrime=false;
						pot = i;
						top = num/pot;
						break;
					}
					else {
						isPrime=true;
					}
				}
				if(isPrime) {
					System.out.println("is prime");
				}
				else {
					System.out.println("not prime, it is " + top + " * " + pot);
				}
		}
	}
}
