
public class DemoStatic {
	private int id;
	private String name;
	private static int counter;
	static {
		counter=0;
		System.out.println("static block invoked");	
	}
	//non static block
	{
		System.out.println("non static block invoked");
	
	}
	public DemoStatic() {
		// TODO Auto-generated constructor stub
		id=10;
		name="citi";
		counter++;
		System.out.println("constructor invoked");
	}
	public void display() {
		System.out.println(" id = "+ id +"\n name = "+name+"\n counter = "+counter);
	}
	public static void show() {
		System.out.println("\n counter = "+counter);
		//static data and static functions are only allowed. non static functions are not allowed
		//in order to invoke a non static method, we have to have an object
	}
	public static void main(String[] args) {
		System.out.println("ghj");
		
//		Class.forName("DemoStatic");
	}
}
