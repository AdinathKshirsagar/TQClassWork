package com.single;

class One
{
	protected int data;
	
	public One() {
		
	}
	
	public One (int data) {
		this.data=data;
	}
	
	protected void setData(int data) {
		this.data=data;
	}
	
	public int getData() {
		return this.data;
	}
	public String toString() {
		return "Data "+data;
	}
	
}
class Two extends One{
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void display() {
		System.out.println("Name : "+name+ "Data :"+data);
	}
}
public class DemoTest {

	public static void main(String[] args) {
			One o1 = new One();
			o1.setData(24);;
			o1.getData();
			
			Two t1= new Two();
			t1.setData(55);
			t1.setName("Adi");
			
			System.out.println(o1.getData());
			System.out.println(t1.getData()+" "+t1.getName());
			
	}

}
