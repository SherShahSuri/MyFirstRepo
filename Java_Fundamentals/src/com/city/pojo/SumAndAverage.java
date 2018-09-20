package com.city.pojo;
import java.util.Scanner;
public class SumAndAverage {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double [] arr=new double[10];
		double sum=0;
		int count=0;
		for(int i=0; i<10; i++) {
			arr[i]=s.nextDouble();
			sum=sum + arr[i];
			count=count+1;
		}
		double avg=sum/count;
		count=0;
		System.out.println("Sum of the given 10 numbers is : "+ sum + " average of the 10 numbers is "+(sum/count));
		for(int i=0; i<10; i++) {
			if (arr[i]<avg) {
				count=count+1;
			}
		}
		System.out.println("The number of numbers less than the average were : "+count);
	}
}
