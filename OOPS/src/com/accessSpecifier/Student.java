package com.accessSpecifier;
//  Same package Different class  
public class Student {
	// sub class
	public static void main(String[] args) {
		Test t = new Test();
		// ===========All Access Specifier Variable=========== 
		t.rollNo=101; 			// public
		t.admissionNo=8474847; // protected
		// t.age=23;			// private not allow
		t.courseId=21212;		// Default
	
		// ===========All Access Specifier Method===========
		t.doPublic();
		t.doProtected();
		t.doDefault();
		// t.doPrivate(); // method not allow in subclass 
	}
}

//Same package same class 
class Test{
	//same class
	public static void main(String[] args) {
		Test t = new Test();
		// ===========All Access Specifier Variable=========== 
		t.rollNo=101; 			// public
		t.admissionNo=8474847; // protected
		t.age=23;			// private
		t.courseId=21212;		// Default
		
		// ===========All Access Specifier Method===========
		t.doPublic();
		t.doProtected();
		t.doDefault();
		t.doPrivate();   
	}
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