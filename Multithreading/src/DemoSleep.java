
public class DemoSleep extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
		}
	}
	
	public static void main(String[] args) {
		
		Thread t=new DemoSleep();
		t.start();
		
	}
}
