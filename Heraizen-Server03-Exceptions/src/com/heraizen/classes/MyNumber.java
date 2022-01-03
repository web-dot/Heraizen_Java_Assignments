package com.heraizen.classes;

public class MyNumber {
	
	int a;
	int b;
	double result;
	
	public MyNumber(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void setA(int a) {
		this.a=a;
	}
	public void setB(int b) {
		this.b=b;
	}
	
	public void add() {
		this.result=this.a+this.b;
	}
	
	public void sub() {
		this.result=Math.abs(this.a-this.b);
	}
	
	public void mul() {
		this.result=this.a*this.b;
	}
	
	public void div() {
		if(b==0) {
			throw new IllegalArgumentException("b cannot be 0");
		}
		else {
			this.result=this.a/this.b;
		}
	}
}
