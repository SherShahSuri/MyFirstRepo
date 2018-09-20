package com.myInterfaces;

import com.beans.EngineeringStudent;
import com.beans.Student;

public class calculation_impl implements MyCalculation {

	@Override
	public int addition(Student s) {
		// TODO Auto-generated method stub
		EngineeringStudent m=(EngineeringStudent)s;
		System.out.println(m);
		System.out.println(((EngineeringStudent)s).marks[0]);
		System.out.println("lasya");
		return 64;
	}

	@Override
	public double percentage(int add) {
		// TODO Auto-generated method stub
		System.out.println("lasya2");
		return (add/5);
	}

	@Override
	public String showGrade(double percentage) {
		// TODO Auto-generated method stub
		return "G";
	}
//	public static void main(String[] args) {
//		Student s=new EngineeringStudent();
//		calculations_impl c=new calculation_impl();
//		System.out.println(c.addition());
//	}
}

