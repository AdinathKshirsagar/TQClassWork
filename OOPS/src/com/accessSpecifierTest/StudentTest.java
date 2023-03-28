package com.accessSpecifierTest;

import com.accessSpecifier.Test1;

// Same package but different pages of java(Non sub Class)
public class StudentTest {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		// ===========All Access Specifier Variable=========== 
		System.out.println(t1.rollNo=79);			// public
		//t1.admissionNo=789447; // protected
		//t1.age=23;			// private not allow
		//t1.courseId=5246;		// Default
		
		// ===========All Access Specifier Method===========
		t1.doPublic();
		//t1.doProtected();
		//t1.doDefault();
		//t1.doPrivate();  //method allow in subclass
	}

}
