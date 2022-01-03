package com.tests;

import java.util.Arrays;

public class StringTest {
	
	/*
	 * 1. Write a program to accept a String from user and display the length of the string. Also display
		the string in uppercase and lowercase and check whether it is a palindrome or not.
	 */
	public static void isPalindrome(String str) {
		
		int len = str.length();
		String toUp = str.toUpperCase();
		String toLow = str.toLowerCase();
		Boolean isPal = false;
		
		//checking if palindrome
		if(str.length()%2==0) {
			String s1 = str.substring(0, len/2);
			String s2 = str.substring(len/2, len);
			String rev = new StringBuilder(s2).reverse().toString();
			if(s1.equals(rev)) {
				isPal = true;
			}
		}
		if(str.length()%2!=0) {
			String s1 = str.substring(0, len/2+1);
			String s2 = str.substring(len/2, len);
			String rev = new StringBuilder(s2).reverse().toString();
			if(s1.equals(rev)) {
				isPal = true;
			}
		}
		else {
			isPal = false;
		}
		
		if(isPal) {
			System.out.println(str + " [length:" + len + ", uppercase:" + toUp + ", lowercase:" + toLow + ", plaindrome:"+ isPal +  "]");
		}
		else {
			System.out.println(str + " [length:" + len + ", uppercase:" + toUp + ", lowercase:" + toLow + ", plaindrome:"+ isPal +  "]");
		}
	}
	
	
	/*
	 * 2. Write a program to accept the string from the user and count the number of vowels and
		consonants in the given string?
	 * */
	public static void countVowelsAndConsonants(String str) {
		
		char[] carr = str.toCharArray();
		int vowCount = 0;
		int conCount = 0;
		for(int i=0; i<carr.length; i++) {
			if(carr[i]=='a' || carr[i]=='e' || carr[i]=='i' || carr[i]=='o' || carr[i]=='u') {
				vowCount++;
			}
		}
		conCount = str.length()- vowCount;
		
		System.out.println(str + " has " + vowCount + " vowels and " + conCount + " consonants");
	}
	
	
	/*
	 * Write a program to search for a string in a given group of strings?
	 * */
	public static void searchString(String str, String searchString) {
		
		String[] sa = str.split(",");
		boolean isFound = false;
		int pos = 0;
		
		for(int i=0; i<sa.length; i++) {
			if(sa[i].equals(searchString)) {
				isFound = true;
				pos = i;
				break;
			}
			else {
				isFound = false;
			}
		}
		if(isFound) {
			System.out.println(searchString + " is found at position " + pos);
		}
		else {
			System.out.println(searchString + " not found");
		}
	}
	
	/*
	 * 5. Write a program to find the
		1. No. of letters
		2. No. of digits
		3. No. of whitespaces in the following input
	 * */
	public static void stringStats(String str) {
		
		int letterCount = 0;
		int digitCount = 0;
		int whiteCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				digitCount++;
			}
			if(Character.isWhitespace(c)) {
				whiteCount++;
			}
		}
		letterCount = str.length() - (digitCount + whiteCount);
		System.out.println("No of letters:" + letterCount + ", No of Digits:" + digitCount + ", No of whitespace:" + whiteCount);
	}

	public static void main(String[] args) {
		
		isPalindrome("hello");
		countVowelsAndConsonants("programmer");
		searchString("miani,lakshman,java,malli,narayana", "java");
		stringStats("hello 123");
		
	}

}
