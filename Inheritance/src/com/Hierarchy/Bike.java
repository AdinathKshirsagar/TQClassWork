package com.Hierarchy;

public class Bike {
	private int modelno;
	private String brand;
	private float price;
	
	public Bike() {
		
	}
	public Bike(int modelno, String brand, float price) {
		this.modelno=modelno;
		this.brand=brand;
		this.price=price;
	}
	
	public void setModelno(int modelno) {
		this.modelno=modelno;
	}
	public int getModelno() {
		return modelno;
	}
	public void setBrand(String brand) {
		this.brand= brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public float getPrice() {
		return price;
	}
	
	
	public String toString() {
		return " Modelno : "+modelno+" Brand : "+brand+" Price : "+price;
	}
	
}
