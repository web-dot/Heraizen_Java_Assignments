package com.heraizen.classes;

public class Product {
	int pid;
	String pname;
	int price;
	
	public static Product[] arr = new Product[10];
	
	public Product(int pid, String pname, int price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	public static void display(Product[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("pid:" + arr[i].pid + ", pname:" + arr[i].pname + ", price:" + arr[i].price);
		}
	}
}
