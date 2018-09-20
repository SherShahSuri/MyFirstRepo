package com.city.pojo;
import java.util.Scanner;
public class LessEven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=2; i<=num; i++) {
			System.out.println("one of the even numbers less than or equal to "+num+" is "+ i);
		}
	}
}
