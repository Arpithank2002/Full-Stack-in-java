package com.pes;

public class A {
	 private int a;
	 private String message;
	 
	public A() {
		System.out.println("A container is executed");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		System.out.println("A class setter for a");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		System.out.println("A class setter for message");
	}
	 public void show()
	 {
		 System.out.println("A show methods ");
		 System.out.println(a);
		 System.out.println(message);
	 }
	
}
