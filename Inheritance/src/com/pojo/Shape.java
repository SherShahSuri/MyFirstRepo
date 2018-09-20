package com.pojo;

abstract public class Shape {
	private String name;
	
	public Shape() {
		name="NoNameSpecified";
		
	}
	
	public Shape(String name) {
		this.name=name;
	}
	abstract public double area();
	
	
}
