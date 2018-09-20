//declare a list - done
//add 5 book objects from accepting data from the user - done
//display the list using iterator - done
//ask the user to enter isbn number. find the book with said isbn number
//accept the index number from user to display the book details
//ask the user for isbn and update price. if book found with isbn change the price of the book
//ask the user to enter isbn whose data client wants to remove.
//display the modified list using enhanced for loop

package com.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.lambda.book;

public class BookListTest {
	public static void main(String[] args) {
		String name=null;
		String isbn=null;
		String price=null;
		List<book> books =new ArrayList();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			
			for(int i=0; i<5; i++) {
				System.out.println("Please enter the "+(i+1)+"th book details in the order : NAME, ISBN, PRICE");
				
				name=br.readLine();
				isbn=br.readLine();
				price=br.readLine();
				books.add(new book(name, Integer.parseInt(isbn), Double.parseDouble(price)));
			}
		}
		catch (IOException e) {
			e.getStackTrace();
		}
		
		Iterator<book> it=books.iterator();
		while(it.hasNext()) {
			book data=it.next();
			System.out.println(data);
		}
		
		System.out.println("Please enter the isbn number you want to search for:");
		try {
			isbn=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		book b=new book();
		b.setISBN(Integer.parseInt(isbn));
		boolean found=books.contains(b);
		if(found) {
			System.out.println("the book is available. Displaying its details....");
			Iterator<book> it1=books.iterator();
			while(it1.hasNext()) {
				book data=it1.next();
//				data.contains
				System.out.println(data);
			}
		}
		else {
			System.out.println("Sorry we dont have a copy of this book");
		}
	}
}
