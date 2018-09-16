
public class TestMyThread {
	public static void main(String[] args) {
		System.out.println("Start inside main");
		Thread t=new MyThread();
		t.start();
		
		
		System.out.println("End: inside main");
	}
}
