package com.MethodOverriding;

class Person{
	void display() {
		System.out.println("I am a person");
	}
}
class Employee extends Person{
	@Override
	protected void display() {
		System.out.println("I am a Employee");
	}
}

class HomePerson extends Person{
	@Override
	void display() {
		System.out.println("I am a Home Person");
	}
}
public class OverrideDemo {
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.display();
		
		HomePerson h1 = new HomePerson();
		h1.display();
	}
}
