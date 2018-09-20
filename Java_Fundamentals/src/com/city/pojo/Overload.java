package com.city.pojo;

public class Overload {
	public static void main(String[] args) {
		System.out.println("The area of a rect with size 5x10 is"+ OverloadProgram.area(5, 10));
		System.out.println("The area of a square with side 5 is"+ OverloadProgram.area(5, 5));
		System.out.println("The area of a circle with radius 7 is"+ OverloadProgram.area(7));
		System.out.println("The area of a rect with sides 5,6 and 7is"+ OverloadProgram.area(5, 6,7));
		
	}
}
