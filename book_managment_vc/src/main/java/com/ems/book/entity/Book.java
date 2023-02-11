package com.ems.book.entity;

//import com.testingexample.maven_vcproject.entity.Address;

public class Book {
	private long bookId;
	private String bookName;
	private double bookPrice;
	private String bookAuth;
	
	public Book(long bookId, String bookName, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		//this.address = address;
	}

	public long getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public String getBookAuth() {
		return bookAuth;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	
	
	

}
