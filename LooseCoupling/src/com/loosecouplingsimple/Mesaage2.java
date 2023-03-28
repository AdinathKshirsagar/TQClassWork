package com.loosecouplingsimple;

class Whatsapp2 implements MessageService
{
		
	public void displayMsg(String msg)
	{
		System.out.println("Whatsapp msg:"+msg);
	}

}

class Facebook2 implements MessageService
{
	
	public void displayMsg(String msg)
	{
		System.out.println("Facebook msg:"+msg);
	}

}

class Instagram2 implements MessageService
{
		
	public void displayMsg(String msg)
	{
		System.out.println("Instagram msg:"+msg);
	}

}

public class Mesaage2 {
	
	public void getMessage(MessageService m, String msg)
	{
		m.displayMsg(msg);
	}

	public static void main(String[] args) {


		MessageService mser;

        Mesaage2 m= new Mesaage2();
      
        
        mser= new Whatsapp2();
        m.getMessage(mser, "Hello");
        
        mser= new Facebook2();
        m.getMessage(mser, "Good morning");

	}

}
