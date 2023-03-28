package com.varags;
class Demo
{
	void display(Integer ...ar)
	{
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
	}
}
class child extends Demo
{
	void display(Integer ...ar)
	{
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
	}
}
public class OverridingVarags {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
