package com.single;

public class Parent {
	private int id;
	public String name;
	protected float marks;
	int age;
	
	private void setId(int id){
		this.id= id;
	}
	private int getId() {
		return this.id;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public String getName() {
		return this.name;
	}
	protected void setMarks(float marks) {
		this.marks=marks;
	}
	protected float getMarks() {
		return this.marks;
	}
	void setAge(int age) {
		this.age= age;
	}
	int getAge() {
		return this.age;
	}
	
	public static void main(String args[]) {
		Parent p = new Parent();
		p.setId(11);
		p.setName("Anand");
		p.setAge(20);
		p.setMarks(76);
		
		System.out.println(p.getId()+" "+p.getName()+" "+p.getAge()+" "+p.getMarks());
	}
}
