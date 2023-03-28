package com.CustomTreeMap;

public class Order implements Comparable<Order>{
	private int orderid;
	private String name;
	private float price;
	public Order() {
	}
	public Order(int orderid, String name, float price) {
		super();
		this.orderid = orderid;
		this.name = name;
		this.price = price;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
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
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Order o) {
		if(this.price<o.price)
			return -1;
		else if(this.price>o.price)
			return 1;
		else 
			return 0;
	}
	
}
