package com.pratice1;

import java.util.ArrayList;
import java.util.Objects;

public class Dept {
	
	private int id;
	private String name;
	ArrayList<Student> stud;
	
	public Dept() {

      stud = new ArrayList<>();
	}

	public Dept(int id, String name, ArrayList<Student> stud) {
		this();
		this.id = id;
		this.name = name;
		this.stud = stud;
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
		
	
	public ArrayList<Student> getStud() {
		return stud;
	}

	public void setStud(ArrayList<Student> stud) {
		this.stud = stud;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, stud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(stud, other.stud);
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", stud=" + stud + "]";
	}
	
	

}
