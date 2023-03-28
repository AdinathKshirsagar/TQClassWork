package com.WrapperCovarient;
class Demo
{
	Object showMsg(Object ob) 
	{
		System.out.println("Hii");
		return this;
	}
}
public class WrapperDemo extends Demo 
{
	WrapperDemo showMsg(Object ob) 
	{
		System.out.println("Hello");
		return this;
	}
	public static void main(String[] args) {
		WrapperDemo w1 = new WrapperDemo();
		w1.showMsg(w1);
	}

}
