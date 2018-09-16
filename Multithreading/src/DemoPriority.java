
public class DemoPriority extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running =-"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("Main starts "+Thread.currentThread().getName());
		
		Thread t=new DemoPriority();
//		t.setPriority(MAX_PRIORITY);
//		t.start();
		
		try {
			t.start();
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main ends "+Thread.currentThread().getName());
	}
}
