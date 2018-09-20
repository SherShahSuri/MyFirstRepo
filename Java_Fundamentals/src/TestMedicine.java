
public class TestMedicine {
	public static void main(String[] args) {
		Medicine med1=new Medicine();
		med1.displayMedicine();
		
		Medicine med2=new Medicine("shitr", 20);
		med2.displayMedicine();
		
		med2.setMedicine_name("pfizer");
		med2.setMedicine_price(50);
		med2.displayMedicine();
		
	}
}
