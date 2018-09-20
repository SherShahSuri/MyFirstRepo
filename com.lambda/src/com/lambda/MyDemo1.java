package com.lambda;

public class MyDemo1 {
	public static void main(String[] args) {
		MyInterface m=()->{System.out.println("Hello");};
		m.greeting();
	}
}
