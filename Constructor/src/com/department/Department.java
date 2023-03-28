package com.department;

public class Department {
	
	private int deptId;
	private String dname;
	private String location;
	
	//default constructor
	public Department()
	{
		System.out.println("In default");
		
	}
	
	// param constr 1
	public Department(int deptId,String dname,String location)
	{
		System.out.println("In param constr 1");
		this.deptId=deptId;
		this.dname=dname;
		this.location=location;
	}
	
	// param constr 2
	public Department(int deptId,String dname)
	{
		System.out.println("In param constr 2");
		this.deptId=deptId;
		this.dname=dname;
		this.location="New Delhi";
	}
	
	
	
	public void setDeptId(int deptId) 
	{
		this.deptId=deptId;
	}
	
    public int getDeptId() {
    	return deptId;
    } 
    
    public void setDname(String dname) {
    	this.dname=dname;
    }
    
    public String getDname() {
    	
    	return dname;
    }
    
    public void setLocation(String location) {
    	this.location=location;
    }
    
    public String getLocation() {
    	
    	return location;
    }
    
    public String toString()
    {
    	return "Department details: "+deptId+"  "+dname+"  "+"  "+location;
    }

}