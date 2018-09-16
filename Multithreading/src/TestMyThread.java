
public class TestMyThread {
	public static void main(String[] args) {
		System.out.println("Start inside main with name as " + Thread.currentThread().getName());
		Thread t = new MyThread();
		t.run();
		Thread t1 = new MyThread();
		t1.run();

		System.out.println("End: inside main with name as " + Thread.currentThread().getName());
	}
}
