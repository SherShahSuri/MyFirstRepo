import java.util.Scanner;
public class DemoScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
//		int age=Integer.parseInt(sc.nextLine());
		int age=sc.nextInt();
		
		System.out.println("Please enter your percentage");
//		float per=Float.parseFloat(sc.nextLine());
		float per=sc.nextFloat();
		
		System.out.println("Your age = "+age);
		System.out.println("Your percentage = "+per+"%");
		
		if(age>18) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Sorry");
		}
		
	}
}
