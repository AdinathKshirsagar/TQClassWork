package com.CompiletimeCustomcException;

import java.util.Scanner;

public class InvalidPasswordException extends Exception{

	public InvalidPasswordException()
	{
		
	}
	public InvalidPasswordException(String msg)
	{
		super(msg);
	}

}
