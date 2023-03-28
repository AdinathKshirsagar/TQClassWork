package com.CustomMap;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private float age;
	private Course course;
	public Student() {
	}
	public Student(int id, String name, float age,Course course) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.course=course;
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
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, course, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(age) == Float.floatToIntBits(other.age) && Objects.equals(course, other.course)
				&& id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	
	
}
