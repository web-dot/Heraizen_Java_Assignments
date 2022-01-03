package com.heraizen.classes;

import java.util.Scanner;

public class TestMyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a");
		int firstNum = sc.nextInt();
		System.out.println("Enter number b");
		int secNum = sc.nextInt();
		
		MyNumber myNumber = new MyNumber(firstNum, secNum);
		
		System.out.println("Enter 1 to add");
		System.out.println("Enter 2 to sub");
		System.out.println("Enter 3 to mul");
		System.out.println("Enter 4 to div");
		
		int option = sc.nextInt();
		
		switch(option) 
		{
			case 1:
				myNumber.add();
				System.out.println(myNumber.result);
				break;
			case 2:
				myNumber.sub();
				System.out.println(myNumber.result);
				break;
			case 3:
				myNumber.mul();
				System.out.println(myNumber.result);
				break;
			case 4:
				myNumber.div();
				System.out.println(myNumber.result);
				break;
		}
		
		
		
		
		

	}

}
