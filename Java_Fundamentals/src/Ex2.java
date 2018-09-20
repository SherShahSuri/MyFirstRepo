
import java.lang.Math;
public class Ex2 {
	private double num1=532.3d;
	private double num2=45.2d;
	public void ceilVal() {
		System.out.println("Ceiling value of first number"+ Math.ceil(num1));
		System.out.println("Ceiling value of second number"+ Math.ceil(num2));
		
	}
	public void maxVal()
	{
		System.out.println("Max val is "+Math.max(num1, num2));
	
	}
	public void sqrtVal()
	{
		System.out.println("sqrt val of first number is "+Math.sqrt(num1));
		System.out.println("sqrt val of second number is "+Math.sqrt(num2));
		
	}
	
	public static void main(String[] args) {
		Ex2 e2;
		e2=new Ex2();
		e2.ceilVal();
		e2.maxVal();
		e2.sqrtVal();
	}
}
