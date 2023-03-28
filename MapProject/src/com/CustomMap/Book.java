package com.CustomMap;

import java.util.Objects;

public class Book {

	private int bid;
	private String name;
	private float price;
	private Author author;
	
	public Book() {
		
	}
	public Book(int bid, String name, float price,Author author) {
		this.bid = bid;
		this.name = name;
		this.price = price;
		this.author=author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, bid, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bid == other.bid && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
}
