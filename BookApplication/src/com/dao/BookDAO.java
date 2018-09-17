package com.dao;

import java.util.List;

import com.connections.book;

public interface BookDAO {
	int addBook(book Book);

	boolean updateBook(int ISBN, book Book);

	book findBookByISBN(int ISBN);

	List<book> findAllBooks();

//	List<book> findAllBooksByPrice(double price);

	int deleteBook(int ISBN);

	List<book> findAllBooksbyPrice(double price);

}