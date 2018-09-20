package com.beans;

import java.util.HashSet;
import java.util.Set;

import com.lambda.book;

public class BookSet {
	public static void main(String[] args) {
		Set<book>books =new HashSet<>();
		books.add(new book());
		books.add(new book("Core Java", 1234,800));
		books.add(new book("Complete Reference", 89, 400d));
		books.add(new book());
		
		System.out.println("Size of the set is :"+books.size());
//		//the objects must have different hashcode for further member based comparison to take place.
//		//For example, when we always return the hashcode 10, only then is the further comparison done.
//		//then the two objects are found to be with the same hashcode and also the same contents.
//		//otherwise the hashcodes would have been different and the duplicates considered as separate.
		
		
	}
}
