
public class DemoRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Runnable r=new DemoRunnable();
//		r.start();
		Thread t = new Thread(r);
		t.start();
		
		
	}
}
