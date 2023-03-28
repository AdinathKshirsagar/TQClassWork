package com.QueueDemo;

class MyQueue
{
   
  int front,rear;
  int size;
  int []ar;

	public MyQueue() {
	}
  
  public MyQueue(int size)
  {
	  rear=0;
	  front=0;
	  this.size=size;
	  ar= new int[size];
  }
  
  public void insert(int data)
  {
	  if(rear<size)
	  {
		  ar[rear]=data;
		  rear++;
		  System.out.println("Element inserted");
	  }
	  
	  else
	  {
		  System.out.println("Queue is full");
	  }
	  
  }
  
  public void delete()
  {
	  int tmp;
	  if(rear>front)
	  {
		  System.out.println("Element deleted :"+ar[front]);
		  for(tmp=front;tmp<rear-1;tmp++)
		  {
			  ar[tmp]=ar[tmp+1];
		  }
		  
		  ar[--rear]=0;
	  }
	  else
		  System.out.println("Queue is empty");
		  
	  }
	  
  public void show()
  {
	  if(rear>front)
	  {
		  for(int i=front;i<rear;i++)
		  {
			  System.out.println(ar[i]);
		  }
	  }
	  else
	  {
		  System.out.println("Queue is empty");
	  }
  }


}

public class QueueAsArray {

	public static void main(String[] args) {

     MyQueue q1= new MyQueue(5);
     
     q1.insert(45);
     q1.insert(67);
     q1.insert(78);
     
     q1.show();
     q1.delete();
     
     q1.show();
     

	}

}
