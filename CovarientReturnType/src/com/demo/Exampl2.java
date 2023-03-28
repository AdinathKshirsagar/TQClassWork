package com.demo;

class Colour
{
	Colour get()
	{
		return this;
	}
	
}

class RedColour extends Colour
{
	RedColour get()
	{
		System.out.println("Red");
		return this;
	}

}

public class Exampl2 {

	public static void main(String[] args) {


		RedColour rd= new RedColour();
		//rd=(RedColour)rd.get();
		rd=rd.get();

	}

}

