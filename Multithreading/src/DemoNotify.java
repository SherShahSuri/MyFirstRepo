
public class DemoNotify {
	public static int sum = 0;

	
	private void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
			synchronized (this) {
				notify();
			}
		}
	}
}
