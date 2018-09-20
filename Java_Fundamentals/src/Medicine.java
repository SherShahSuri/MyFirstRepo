
public class Medicine {
	private String medicine_name;
	private int medicine_price;
	public String getMedicine_name() {
		return medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		this.medicine_name=medicine_name;
	}
	public int getMedicine_price() {
		return medicine_price;
	}
	public void setMedicine_price(int medicine_price) {
		this.medicine_price=medicine_price;
	}
	public void displayMedicine() {
		System.out.println("Medicine = "+ medicine_name+"\n medicine price is ="+medicine_price);
	}
	public Medicine() {
		medicine_name="medicine";
		medicine_price=0;
	
	}
	public Medicine(String name, int price) {
		medicine_name=name;
		medicine_price=price;
	}
}
