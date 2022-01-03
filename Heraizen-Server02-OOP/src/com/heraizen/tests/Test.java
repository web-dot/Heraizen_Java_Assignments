package com.heraizen.tests;

import com.heraizen.classes.CalculateSum;
import com.heraizen.classes.Employee;
import com.heraizen.classes.Product;
import com.heraizen.classes.Student;
import com.heraizen.classes.UserInput;

public class Test {

	public static void main(String[] args) {
		
		
		//Student
		Student s1 = new Student(10, "ramu");
		Student s2 = new Student(11, "shamu");
		Student s3 = new Student(12, "bhimu");
		Student s4 = new Student(13, "gomu");
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		System.out.println("Total number of students: " + Student.count);
		
		
		
		//Calculate Sum
		CalculateSum c1 = new CalculateSum();
		System.out.println(c1.sum(10,20,30));
		System.out.println(c1.sum(10,20));
		
		
		//userinput
		UserInput u1 = new UserInput();
		//u1.getInput();
		
		//Product
		
		Product p0 = new Product(10, "product0", 0);
		Product p1 = new Product(11, "product1", 1);
		Product p2 = new Product(12, "product2", 2);
		Product p3 = new Product(13, "product3", 3);
		Product p4 = new Product(14, "product4", 4);
		Product p5 = new Product(15, "product5", 5);
		Product p6 = new Product(16, "product6", 6);
		Product p7 = new Product(17, "product7", 7);
		Product p8 = new Product(18, "product8", 8);
		Product p9 = new Product(19, "product9", 9);
		
		Product[] arr = new Product[10];
		
		arr[0] = p0;
		arr[1] = p1;
		arr[2] = p2;
		arr[3] = p3;
		arr[4] = p4;
		arr[5] = p5;
		arr[6] = p6;
		arr[7] = p7;
		arr[8] = p8;
		arr[9] = p9;
		
		Product.display(arr);

		
		//Employee
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Ramu");
		e1.setSalary(1000);
		
		System.out.println(e1.toString());
		
	}

}
