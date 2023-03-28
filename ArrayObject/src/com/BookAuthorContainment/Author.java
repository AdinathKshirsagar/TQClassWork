package com.BookAuthorContainment;

public class Author {
	private int aId;
	private String aName;
	public Author() {
		
	}
	
	public Author(int aId, String aName) {
		this.aId = aId;
		this.aName = aName;
	}

	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}

	@Override
	public String toString() {
		return "aId= " + aId + ", aName=" + aName;
	}
	
	
}
