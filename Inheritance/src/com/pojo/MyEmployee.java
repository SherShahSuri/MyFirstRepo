package com.pojo;

public class MyEmployee {
	private String name;
	private int empId;
	private String comp_name;
	
	public MyEmployee() {
		name="abcd";
		empId=10;
		comp_name="CITI";
		
	}
	public MyEmployee(String name, int empId) {
		this();
		this.name=name;
		this.empId=empId;
		
	}
	@Override
	public String toString() {
		return "MyEmployee [name=" + name + ", empId=" + empId + ", comp_name=" + comp_name + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}



