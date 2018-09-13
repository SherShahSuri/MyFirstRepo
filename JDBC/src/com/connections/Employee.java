package com.connections;

import java.sql.Date;

public class Employee {
	public int empID;
	public String empName;
	public double salary;
	public int age;
	public Date joiningDate;
	public Employee(int empID, String empName, double salary, int age, Date joiningDate) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.joiningDate = joiningDate;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
		this.empID=0;
		this.empName="NULL";
		this.salary=0d;
		this.age=0;
		this.joiningDate=new Date(0);
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
}
