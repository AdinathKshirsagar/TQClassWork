package com.demo3;

import java.util.Scanner;

public class GuessNumberGame {
	public static void guessNumber()
	{
		int myNum=36;
		int numOfAttempt=0;
		int guessNum;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter the number i have guess (Between 1 to 50)");
			guessNum= sc.nextInt();
			numOfAttempt++;
			if(guessNum==myNum)
			{
				System.out.println("Congratulation....!! You have guessed.");
			}
			else
			{
				if(guessNum>myNum)
				{
					System.out.println("Number is greater than my number... Try again..");
				}
				else
				{
					System.out.println("Number is smaller than my number... Try again..");
				}
			}
			
			
		}while(guessNum!=myNum);
		System.out.println("Number of attempt is "+numOfAttempt);
	}
	public static void main(String[] args) {
		
		guessNumber();
	}

}
