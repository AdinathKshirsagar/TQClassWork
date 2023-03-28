package com.dynamicbinding;

class Animal{
	void sound() {
		System.out.println("No sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println(" Bark");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println(" Meoww");
	}
}
public class AnimalTest {
	public static void main(String args[]) {
		
		Animal a;
		a= new Dog(); // dynamic method dispatcher
		a.sound();
		
		a= new Cat();
		a.sound();
	}
}
