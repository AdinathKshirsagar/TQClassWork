package com.Practice2;

import java.util.ArrayList;
import java.util.Objects;

public class Supplier {
	private int regNo;
	private String sName;
	ArrayList<Item> item;
	public Supplier() {
		item = new ArrayList<>();
	}
	public Supplier(int regNo, String sName, ArrayList<Item> item) {
		this();
		this.regNo = regNo;
		this.sName = sName;
		this.item = item;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public ArrayList<Item> getItem() {
		return item;
	}
	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(item, regNo, sName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supplier other = (Supplier) obj;
		return Objects.equals(item, other.item) && regNo == other.regNo && Objects.equals(sName, other.sName);
	}
	@Override
	public String toString() {
		return "Supplier [regNo=" + regNo + ", sName=" + sName + ", item=" + item + "]";
	}
	
}
