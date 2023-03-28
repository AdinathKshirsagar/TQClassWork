package com.CustomArrayList;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private float marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s)
	{
		if(marks==s.marks)
			return (name.compareTo(s.name));
		if(marks>s.marks)
			return 1;
		else
			return -1;
	}

}
