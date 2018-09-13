import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DemoDate {
	public static void main(String[] args) {
		try {
			Class class1= Class.forName("java.lang.String");
			System.out.println(class1.getName());
			
			LocalDate date=LocalDate.now();
			System.out.println(date);
			
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-dd-yyyy");
			LocalDate date1= LocalDate.parse("2-11-2009",formatter);
			System.out.println(date1);
			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
	}
}
