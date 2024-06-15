package com.pes1;

public class B {
 private int b;
 private String message;
 
public B() {
	System.out.println("Default constructor of B");
}

public B(int b, String message) {
	super();
	this.b = b;
	this.message = message;
}

public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
 public void showB() {
System.out.println("Show b") ;
System.out.println("b=" +b);
System.out.println("message=" +message);
 }

}
