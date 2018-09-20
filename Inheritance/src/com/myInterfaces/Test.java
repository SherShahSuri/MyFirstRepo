package com.myInterfaces;

import com.beans.EngineeringStudent;
import com.beans.Student;
import com.myInterfaces.*;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Student[] s=new EngineeringStudent[2];
		int []arr= {1,2,3,4};
		for(int i=0; i<2; i++) {
			Scanner sc=new Scanner(System.in);
			
			String b=sc.nextLine();
			String c=sc.nextLine();
			s[i]=new com.beans.EngineeringStudent(arr, b,c,1,"sedrft",67);
			
		}
		MyCalculation e=new calculation_impl();
		e.addition(s[0]);
		double d=e.percentage(20);
		String var=e.showGrade(d);
		System.out.println(var);
	}
}
