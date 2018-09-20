package com.lambda;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

import com.lambda.book;

public class DemoStream {
	public static void main(String[] args) {
		List<book> books =new ArrayList<>();
		books.add(new book());
		books.add(new book("Core Java", 2345, 789d));
		books.add(new book("Complete Reference", 1900, 800d));
		books.add(new book("Black book", 780, 600d));
		books.add(3, new book("Spring 5.0", 45, 1000d));
		books.add(new book("Hibernate in action", 34, 900d));
		books.add(new book("Complete reference ", 1910, 800d));

		//		books.forEach((b)->{System.out.println(b.getBookName()+"\t"+b.getISBN());});

		//		
		//		System.out.println("\n\n\n\n\nbooks according to prices");
		//		Stream<book> stream=books.stream();
		//		Stream s1=stream.filter((b)->{return b.getPrice()>800;});
		//		s1.forEach(System.out::println);

		//		books.stream().filter((b)->{return b.getBookName().startsWith("C");}).collect(Collectors.toList());
		//		books.forEach((b)->{System.out.println(b.getBookName().startsWith("C"));});
		books.stream().filter((b)->{return b.getBookName().startsWith("C");}).forEach(System.out::println);


		books.stream().filter((b)->{
			return b.getBookName().startsWith("C");
		}).sorted((b1,b2)->{
			return (int) (b1.getPrice()-b2.getPrice());
		}).forEach(System.out::println);

	}

}
