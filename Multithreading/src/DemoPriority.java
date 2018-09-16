
public class DemoPriority extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running =-"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("Main starts "+Thread.currentThread().getName());
		
		System.out.println("Main ends ");
	}
}
