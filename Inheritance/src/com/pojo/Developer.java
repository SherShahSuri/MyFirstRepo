package com.pojo;

public class Developer extends Employee {
	String[] project_names;
	
	public Developer() {
		this.project_names= {"projk1", "wert","wsedrftg","sderftg"};
		System.out.println("default dev constructor invoked");
	}
	
	public Developer(String[] names) {
		System.out.println("parametrixed constructor invoked");
		this.project_names=project_names;
	}
	
	public void display() {
		for(String i:this.project_names) {
			System.out.println(i);
		}
	}
}
