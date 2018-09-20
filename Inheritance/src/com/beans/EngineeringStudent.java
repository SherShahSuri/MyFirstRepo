package com.beans;

public class EngineeringStudent extends Student {
	public int[] marks;
	private String clg_code;
	private String branch_code;
	
	public EngineeringStudent() {
		
	}
	public EngineeringStudent(int [] marks, String clg_code, String branch_code, int rollNo, String name, int std) {
		super(rollNo, name, std);
		this.marks=marks;
		this.clg_code=clg_code;
		this.branch_code=branch_code;
		
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getClg_code() {
		return clg_code;
	}
	public void setClg_code(String clg_code) {
		this.clg_code = clg_code;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
}
