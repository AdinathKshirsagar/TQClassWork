package com.RuntimeCustomcException;

import java.util.Scanner;

public class InvalidPasswordException extends RuntimeException{

	public InvalidPasswordException()
	{
		
	}
	public InvalidPasswordException(String msg)
	{
		super(msg);
	}

}
