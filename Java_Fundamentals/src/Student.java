public class Student {
	private int rollnumber;
	private String name;
	private int standard;
	private String address;
	private int age;
	public Student() {
		rollnumber=12;
		name="Ankita";
		standard=10;
		address="101 Marvel Pune";
		age=16;
	}
	public Student(int rollnumber, String name, int standard, String address, int age) {
		//DISCLAIMER
		//make constructor private if you want a set number of predefined objects
		//used especially when the object creation is an especially lengthy or memory heavy process
		//only functions inside the class will be able to create such objects 
		//functions in other classes will not be able to create this
		//
		this.rollnumber=rollnumber;
		this.name=name;
		this.standard=standard;
		this.address=address;
		this.age=age;
	}
	public void show() {
		System.out.println("Roll number ="+rollnumber+"\n Student name = "+name+"\n Standard = "+standard+
				"\n Address = "+address+"\n age = "+age);
	}
}
