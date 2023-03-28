package com.accessSpecifier;

public class Test1 {
	public int rollNo;
	protected int admissionNo;
	private int age;
	int courseId;
	
	
	//public
	public void doPublic() {
		System.out.println("This is public method");
	}
	
	//protected
	protected void doProtected() {
		System.out.println("This is protected method");
	}
	
	//private
	private void doPrivate() {
		System.out.println("This is private method");
	}
	
	//Default
	void doDefault() {
		System.out.println("This is Default method");
	}
}
