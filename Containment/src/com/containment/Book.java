package com.containment;

public class Book {
	private String bookName;
	private float bprice;
	private String btype;
	private Author author;
	
	public Book() {
		
	}
	public Book(String bookName, float bprice, String btype, Author author) {
		
		this.bookName = bookName;
		this.bprice = bprice;
		this.btype = btype;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bprice=" + bprice + ", btype=" + btype + ", author=" + author + "]";
	}
	
	
	
}
