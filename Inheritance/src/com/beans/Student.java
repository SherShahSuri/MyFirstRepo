package com.beans;

public class Student {
	private int rollNo;
	private String name;
	private int std;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, int std) {
		this.name=name;
		this.rollNo=rollNo;
		this.std=std;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}
}
