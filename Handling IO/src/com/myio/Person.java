package com.myio;

public class Person {
	public int perID;
	public String personName;
	public String personAddress;
	public int personAge;
	public int getPerID() {
		return perID;
	}
	public void setPerID(int perID) {
		this.perID = perID;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
//	public Person(int i, int j, String string, String string2) {
//		// TODO Auto-generated constructor stub
//		this.perID=((i));
//		this.personAge=((j));
//		this.personAddress=string;
//		this.personName=string2;
//		
//	}
	public Person(int perID, String personName, String personAddress, int personAge) {
		super();
		this.perID = perID;
		this.personName = personName;
		this.personAddress = personAddress;
		this.personAge = personAge;
	}
	
	public Person() {
		super();
		this.perID=0;
		this.personName="NULL";
		this.personAddress="NULL";
		this.personAge=0;
	}
	
}
	
