package com.city.pojo;
import java.util.Scanner;
public class NamesArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] names= new String[5];
		for(int i=0; i<5; i++) {
			names[i]=s.nextLine();
		}
		
		
		System.out.println("The names of your friends are: \n");
		for(String j:names) {
			System.out.println("\n"+j);
		}
	}
}
