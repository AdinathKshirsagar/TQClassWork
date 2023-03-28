package com.containment;

public class Author {
	private int aid;
	private String aName;
	private String qualification;
	private String dob;
	
	public Author() {
		
	}
	public Author(int aid, String aName, String qualification, String dob) {
		
		this.aid = aid;
		this.aName = aName;
		this.qualification = qualification;
		this.dob = dob;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aName=" + aName + ", qualification=" + qualification + ", dob=" + dob + "]";
	}
	
}
