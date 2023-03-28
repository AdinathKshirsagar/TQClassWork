package com.demo;

public class Employee {
	private int eid;
	private String ename;
	private float salary;
	private Department dept;
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, float salary, Department dept) {
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.dept = dept;
		
	}
	public int getEid() {
		return this.eid;
	}
	public void setEid(int eid) {
		this.eid= eid;
	}
	public String getEname() {
		return this.ename;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public float getSalary() {
		return this.salary;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public Department getDept() {
		return this.dept;
	}
	public void setDept(Department dept) {
		this.dept=dept;
	}
	public String toString() {
		return "Employee id "+eid+" "+ename+" "+salary+" "+dept;
	}
}
