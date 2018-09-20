package com.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.connections.book;
import com.dao.BookDAO;
import com.connections.MyConnection;

public class BookDAOImpl implements BookDAO {

	@Override
	public int addBook(book Book) {
		// TODO Auto-generated method stub
		int rowsAdded = 0;
		String ADDBOOK = "Insert into book values(?,?,?,?,?)";

		try {
			Connection con = MyConnection.openConnection();

			PreparedStatement ps = con.prepareStatement(ADDBOOK);
			ps.setInt(1, Book.getISBN());
			ps.setString(2, Book.getBookName());
			ps.setString(3, Book.getPublication());
			ps.setString(4, Book.getAuthor());
			ps.setDouble(5, Book.getPrice());
			rowsAdded = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return rowsAdded;
	}

	@Override
	public boolean updateBook(int ISBN, book Book) {
		// TODO Auto-generated method stub
		boolean isUpdated = false;
		String UPDATE_BOOK = "update book set price=? where ISBN=?";
		try (Connection con = MyConnection.openConnection();) {
			PreparedStatement ps = con.prepareStatement(UPDATE_BOOK);
			ps.setDouble(1, Book.getPrice());
			ps.setInt(2, ISBN);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				isUpdated = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return isUpdated;
	}

	@Override
	public book findBookByISBN(int ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<book> findAllBooksbyPrice(double price) {
		// TODO Auto-generated method stub
		List<book> books = new ArrayList<>();
		String FIND_BY_PRICE = "SELECT * FROM BOOK WHERE PRICE=?";
		try (Connection con = MyConnection.openConnection();) {
			PreparedStatement ps = con.prepareStatement(FIND_BY_PRICE);
			ps.setDouble(1, price);
			ResultSet set = ps.executeQuery();
			while (set.next()) {
				int ISBN = set.getInt(1);
				String bookname = set.getString("bookname");
				String author = set.getString("author");
				String publication = set.getString("publication");
				float price1 = set.getFloat("price");
				book Book = new book(ISBN, bookname, author, publication, price1);
				books.add(Book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;

	}

	@Override
	public int deleteBook(int ISBN) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public boolean updateBook(int ISBN, book Book) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public book findBookByISBN(int ISBN) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<book> findAllBooks() {
		// TODO Auto-generated method stub
		List<book> books = new ArrayList<>();
		String FIND_BY_PRICE = "SELECT * FROM BOOK";
		try (Connection con = MyConnection.openConnection();) {
			PreparedStatement ps = con.prepareStatement(FIND_BY_PRICE);
//			ps.setDouble(1, price);
			ResultSet set = ps.executeQuery();
			while (set.next()) {
				int ISBN = set.getInt("ISBN");
				String bookname = set.getString("Name");
				String author = set.getString("Author");
				String publication = set.getString("Publication");
				float price1 = set.getFloat("Price");
				book Book = new book(ISBN, bookname, author, publication, price1);
				books.add(Book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;

	}
//
//	@Override
//	public List<book> findAllBooksByPrice(double price) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
