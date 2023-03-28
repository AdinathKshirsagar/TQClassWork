package com.BookAuthorContainment;

public class Book {
	private int bId;
	private String bName;
	private float prize;
	private Author author;
	
	public Book()
	{
		
	}
	public Book(int bId,String bName,float prize,Author author)
	{
		this.bId=bId;
		this.bName=bName;
		this.prize=prize;
		this.author=author;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public float getPrize() {
		return prize;
	}
	public void setPrize(float prize) {
		this.prize = prize;
	}
	public void setAuthor(Author author)
	{
		this.author=author;
	}
	public Author getAuthor()
	{
		return author;
	}
	public String toString() {
		return "Book bId=" + bId + ", bName=" + bName + ", prize=" + prize+" Author "+author;
	}
	
}
