package com.city.pojo;

public class StudentDetails {
	private long rollNo;
	private String name;
	private static String institute;
	
	
	public StudentDetails(int roll, String n) {
		this.name=n;
		this.rollNo=roll;
	}
	
	public void display() {
		System.out.println("the values are: \n"+this.rollNo+"\n"+this.name+"\n"+this.institute);
	}
	
	public static void main(String[] args) {
		StudentDetails s= new StudentDetails(55343, "Randfomn name");
		s.display();
	}
}
