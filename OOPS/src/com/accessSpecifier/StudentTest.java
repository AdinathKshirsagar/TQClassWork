package com.accessSpecifier;
// Same package but different pages of java(Non sub Class)
public class StudentTest {

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
		//t.doPrivate();  //method allow in subclass
	}

}
