package com.example;

//POJO class

public class BankAccount {
	
	private int acid;
	private long accountNumber;
	private String name;
	private double balance;
	private long debitCard;
	
	// getters and setters
	
	public void setAcid(int acid)
	{
		this.acid= acid;
		//refers to current instance: this 
	}
	
	public int getAcid()
	{
		return this.acid;
		//return acid-> instance 
		
	}
	
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public long getAccountNumber()
	{
		return this.accountNumber;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setBalance(double balance)
	{
		this.balance= balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}

	public void setDebitCard(long debitCard)
	{
		this.debitCard=debitCard;
	}
	
	public long getDebitCard()
	{
		return this.debitCard;
	}
	
	
	
}