package com.impl;

public interface MathOperation {
	int add(int x,int y);
	double div(int x,int y);
	default double area(int radius) {
		return 100; //default methods within the interfaces were not allowed before java 1.8
	}
	default String greeting() {
		return "hello";
	}
}





class MyImpl implements MathOperation{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double div(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return MathOperation.super.greeting();
	}
	
}