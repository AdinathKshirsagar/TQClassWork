package com.arrayofobjectcontainment;

public class Subject {
	private int sid;
	private String sName;
	private float marks;
	
	public Subject() {
		
	}

	public Subject(int sid, String sName, float marks) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Subject sid=" + sid + ", sName=" + sName + ", marks=" + marks ;
	}
	
}
