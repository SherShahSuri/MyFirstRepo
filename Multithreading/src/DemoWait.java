
public class DemoWait {
	public static void main(String[] args) {
		DemoNotify t1=new DemoNotify();
		t1.start();
		System.out.println("Sum is "+t1.sum);
	}
}
