package com.SortingMap;

import java.util.Objects;

public class Course implements Comparable<Course>{
	private int cid;
	private String cname;
	private double fees;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname, double fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid, cname, fees);
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
		return cid == other.cid && Objects.equals(cname, other.cname)
				&& Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees);
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		return cname.compareTo(o.cname);
	}
	
	
}
