package com.city.pojo;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int find=s.nextInt();
		int [] ref= {5,10,43,33,20};
		for(int i=0; i<5; i++) {
			if(find==ref[i]) {
				System.out.println("Number found");
			}
			else {
				System.out.println("Number not found in reference array");
			}
		}
	}
}
