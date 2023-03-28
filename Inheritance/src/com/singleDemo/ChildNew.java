package com.singleDemo;

import com.single.Parent;

public class ChildNew extends Parent {
	private int standard;
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getStandard() {
		return standard;
	}
	public static void main(String[] args) {
		
		ChildNew c1 = new ChildNew();
		c1.setMarks(88); // protected  access
		c1.setName("sdf");
	}

}
