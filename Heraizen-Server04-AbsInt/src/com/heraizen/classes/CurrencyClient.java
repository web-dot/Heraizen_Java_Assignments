package com.heraizen.classes;

import java.util.Scanner;

public class CurrencyClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Country name");
		String name = sc.nextLine();
		
		switch(name) 
		{
		case "India": 
			System.out.println(CurrencyContainer.getCurrency(name).getCurrency());
			break;
		case "USA":
			System.out.println(CurrencyContainer.getCurrency(name).getCurrency());
			break;
		case "UK":
			System.out.println(CurrencyContainer.getCurrency(name).getCurrency());
			break;
		default:
			System.out.println(CurrencyContainer.getCurrency(name).getCurrency());
		}

	}

}
