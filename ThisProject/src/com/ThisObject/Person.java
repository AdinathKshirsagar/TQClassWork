package com.ThisObject;

public class Person {
	
	private int pid;
	private String name;
	private int age;
	private String vote;
	
	public Person() {
		
	}

	public Person(int pid, String name, int age) {

		// refer the current instance variable
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.vote=null;
	}
	
	public void getVotingRight()
	{
		// to invoke current class method
		this.checkVote();
		//checkVote() -> OK
		System.out.println(this.name+ "   Vote:"+this.vote);
	}
	
	public void checkVote()
	{
		if(this.age>=18)
			this.vote="Eligible";

		else
			this.vote="Not eligible";
	}
}
