package com.lambda;

public class MyException extends Exception{
	private String message="not defined";
	public MyException() {
		// TODO Auto-generated constructor stub
		System.out.println("You caught an exception");
	}
	
	public MyException(String message) {
		super(message);
		this.message=message;
	}
	
	public void display() {
		System.out.println("Cause of failure is "+ message);
	}
}


