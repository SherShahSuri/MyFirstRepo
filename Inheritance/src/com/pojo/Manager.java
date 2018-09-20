package com.pojo;

public class Manager extends Employee {
	private double incentive;
	private String department;
	
	public Manager() {
		super();
		System.out.println("Manager invoked");
		incentive=12d;
		department="admin";
		
	}
	
	public Manager(double incentive, String department, int empId, String empname, String com_name) {
		super(empId, empname, com_name);	//invoke the parameterized constructor this way
		this.incentive=incentive;
		this.department=department;
		
	}
	public void display()
	{
		super.display();
		System.out.println("Incentive ="+ incentive+"\n department="+department);
	}
	
}
