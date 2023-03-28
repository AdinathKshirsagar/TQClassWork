package com.CustomMap;

import java.util.Objects;

public class Course {
	private int cid;
	private String cName;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cName) {
		super();
		this.cid = cid;
		this.cName = cName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cName, cid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(cName, other.cName) && cid == other.cid;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + "]";
	}
	
	
	
}
