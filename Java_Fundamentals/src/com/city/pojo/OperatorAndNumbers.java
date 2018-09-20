package com.city.pojo;
import java.util.Scanner;
public class OperatorAndNumbers {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		float x=s.nextFloat();
		float y=s.nextFloat();
		String z=s.nextLine();
		if(z=="+") {
			System.out.println((x+y));
		}	
		if(z=="-") {
			System.out.println((x-y));
		}
		if(z=="*") {
			System.out.println((x*y));
		}
		if (z=="/") {
			System.out.println((x/y));
		}
		else {
			System.out.println("Please enter a good operator");
		}
	}
}
