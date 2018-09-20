package com.lambda;

public class MyDemo implements MyInterface {
	public static void main(String[] args) {
		MyInterface m= new MyInterface() {
			@Override
			public void greeting() {
				// TODO Auto-generated method stub
				System.out.println("Welcome to inner classes");
			}
		};	
		m.greeting();
	}
	@Override
	public void greeting() {
		// TODO Auto-generated method stub	
	}
}