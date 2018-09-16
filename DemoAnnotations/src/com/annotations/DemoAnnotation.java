package com.annotations;

public class DemoAnnotation {
	@MyAnnotations(value1 = 10, name = "MyDemo")
	public void display() {
		
		System.out.println("using my annotation in this function");
	}

	public static void main(String[] args) {

	}
}
