package com.demo;

public class Department {
	private int did;
	private String dname;
	private String location;
	
	public Department(){
		
	}
	public Department(int did, String dname, String location) {
		this.did=did;
		this.dname=dname;
		this.location=location;
	}
	
	public int getDid() {
		return this.did;
	}
	public void setDid(int did) {
		this.did=did;
	}
	public String getDname() {
		return this.dname;
	}
	public void setDname(String dname) {
		this.dname=dname;
	}
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String toString() {
		return "Department : "+did+" "+dname+" "+location+" ";
	}
}
