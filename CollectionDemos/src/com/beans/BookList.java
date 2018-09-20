package com.beans;

import java.util.ArrayList;
import java.util.List;

import com.beans.book;

public class BookList {
	public static void main(String[] args) {
		List<book> books=new ArrayList();
		
		books.add(new book());
		books.add(new book("Core Java", 2345, 789d));
		books.add(new book("Complete Reference", 1900, 800d));
		books.add(new book("Black book", 780, 600d));
		
		System.out.println("No of books is "+ books.size());
		
		books.add(3,new book());
//		System.out.println("Book details are "+ books);
		
		book b=books.get(2);
		System.out.println("Bookname at second position is "+b.getBookName());
		
		boolean found=books.contains(new book());
		if(found) {
			System.out.println("the book is available.");
		}
		else {
			System.out.println("Sorry we dont have a copy of this book");
		}
	}
}
