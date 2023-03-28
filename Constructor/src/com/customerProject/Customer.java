package com.customerProject;

public class Customer {
	
	private int cid;
	private String name;
	private String itemName;
	private float price;
	private String status; 
	private String phoneNumber;
	
	//default constructor
	public Customer()
	{
		System.out.println("In default constructor");
		this.itemName=null;
		this.status="unknown";
		this.price=0.0f;
		
	}
	
	public Customer(int cid, String name, String phoneNumber)
	{
		this();
		System.out.println("In param constructor 1");
		this.cid=cid;
		this.name=name;
		this.phoneNumber=phoneNumber;
		
	}
	
	public Customer(int cid, String name, String phoneNumber, String itemName,  float price,String status)
	{
		this(cid,name,phoneNumber);		// constructor chaining
		System.out.println("In param constructor 2");
		this.itemName=itemName;
		this.status=status;
		this.price=price;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString()
	{
		return "Customer Details:"+cid+"  "+name+"  "+phoneNumber+"\t Item Details:"+itemName+"  "+price+"  "+status;
	}
	

}