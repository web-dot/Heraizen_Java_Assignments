package com.heraizen.classes;

/*
 * 1. Write a program to create class Student with id, name, address , display(),Student(id,name). Create
several objects and initialize them. Display the details of each student and finally display the number of
student objects that are created.
 * */

public class Student {
	int id;
	String name;
	String address;
	public static int count = 0;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		count++;
	}
	
	public void display() {
		System.out.println("Details: " + " id:" + this.id + ", name:" + this.name);
	}
}
