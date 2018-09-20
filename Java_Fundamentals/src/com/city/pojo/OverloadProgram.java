package com.city.pojo;

public class OverloadProgram {
	public static int area(int x, int y) {
		return x*y;
	}
	public static double area(int r) {
		return 3.14*r*r;
	}
	public static double area(int x, int y, int z) {
		int s=(x+y+z)/2;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
}
