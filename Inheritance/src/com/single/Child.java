package com.single;

public class Child extends Parent{
	private String school;
	
	public void setSchool(String school) {
		this.school= school;
	}
	public String getSchool() {
		return this.school;
	}
	public static void main(String[] args) {
		
		Child c1= new Child();
		// private id cannot access
		c1.setName("Megha"); // public access
		c1.setMarks(66.6f); // protected access
		c1.setAge(14);  // default access
		c1.setSchool("Mary School");
		
		System.out.println(c1.getName()+" "+c1.getMarks()+" "+c1.getAge()+" "+c1.getSchool());
		
	}

}
