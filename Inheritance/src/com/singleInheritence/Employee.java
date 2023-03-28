package com.singleInheritence;

public class Employee {
	private int eid;
	private String ename;
	private float salary;
	
	static String company="HCL";
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, float salary) {
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		 
	}
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return this.eid;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public String getEname() {
		return this.ename;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getSalary() {
		return this.salary;
	}
	public static void setCompany(String company) {
		Employee.company=company;
	}
	public static String getCompany () {
		return company;
	}
	
	public String toString () {
		return " Employee : "+eid+" "+ename+" "+salary+" ";
	}
}
