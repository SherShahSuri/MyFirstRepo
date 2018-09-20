package com.lambda;
import com.lambda.book;
public class MyDemo2 {
	public static void main(String[] args) {
		MyInterface1 m1=(x,y)->{System.out.println("Addition is : "+(x+y));};
		m1.add(123, 90);
		
		MyInterface2 m2=(obj)->{obj.setPrice(200); System.out.println(obj.getBookName()+"\t\t"+obj.getPrice());};
		m2.ShowBook(new book("Spring", 1234,0));
	}
	
}