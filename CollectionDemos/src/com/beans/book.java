package com.beans;

public class book implements Comparable{
	private String bookName;
	private int ISBN;
	private double price;
	
	public book() {
		// TODO Auto-generated constructor stub
		bookName="story Book";
		ISBN=12;
		price=123d;

	}
	public book(String bookName, int ISBN, double price) {
		super();
		this.bookName=bookName;
		this.ISBN=ISBN;
		this.price=price;
	}
	@Override
	public String toString() {
		//toString is necessary otherwise only the hashcodes will be printed when a print statement is invoked from elsewhere
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
		book b=(book)obj;
		
		return (this.ISBN==b.ISBN)&&(this.bookName.equals(b.bookName));
	}
	
	@Override
	public int hashCode() {
		return bookName.length();
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		book b=(book)o;
		
		return this.bookName.compareTo(b.bookName);
		
	}
	
	
}
