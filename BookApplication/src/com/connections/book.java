package com.connections;

public class book implements Comparable {
	private String bookName;
	private int ISBN;
	private double price;
	private String Publication;
	private String Author;

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public void setPublication(String publication) {
		Publication = publication;
	}

	public book(int iSBN, String bookname, String publication, String author, double price) {
		// TODO Auto-generated constructor stub
		bookName = "story Book";
		ISBN = 12;
		price = 123d;
		publication = publication;
		author = author;

	}

	public book(String bookName, int ISBN, double price) {
		super();
		this.bookName = bookName;
		this.ISBN = ISBN;
		this.price = price;
	}

	public book() {
		this.bookName = "sdfg";
		this.ISBN = 11;
		this.price = 0;
		this.Author = "asdf";
		this.Publication = "sdrftert";
	}

	@Override
	public String toString() {
		// toString is necessary otherwise only the hashcodes will be printed when a
		// print statement is invoked from elsewhere
		return "\nbook [bookName=" + bookName + ", ISBN=" + ISBN + ", price=" + price + "]";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		book b = (book) obj;

		return (this.ISBN == b.ISBN) && (this.bookName.equals(b.bookName));
	}

	@Override
	public int hashCode() {
		return bookName.length();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		book b = (book) o;

		return this.bookName.compareTo(b.bookName);

	}

	public String getPublication() {
		// TODO Auto-generated method stub
		return this.Publication;
	}

}
