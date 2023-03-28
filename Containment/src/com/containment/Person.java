package com.containment;

public class Person {
	private int pid;
	private String pname;
	private int page;
	private String telephone;
	
	Person(int pid, String pname, int page , String telephone)
	{
		this.pid=pid;
		this.pname=pname;
		this.page=page;
		this.telephone=telephone;
	}
	public void setPid(int pid) {
		this.pid=pid;
	}
	public int getPid() {
		return this.pid;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	public String getPname() {
		return this.pname;
	}
	public void setPage(int page) {
		this.page= page;
	}
	public int getPage() {
		return this.page;
	}
	
}
