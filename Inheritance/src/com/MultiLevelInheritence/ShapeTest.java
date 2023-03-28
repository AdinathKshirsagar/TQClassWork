package com.MultiLevelInheritence;

class Shape{
	private String name;
	private String shapetype;
	
	public Shape() {
		
	}
	public Shape(String name, String shapetype) {
		this.name=name;
		this.shapetype=shapetype;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShapetype() {
		return shapetype;
	}
	public void setShapetype(String shapetype) {
		this.shapetype = shapetype;
	}
	public String toString() {
		return " Name :"+name+" shapetype :"+shapetype;
	}
}
class Rectangle extends Shape
{
	private int length;
	private int breadth;
	
	public Rectangle () {
		
	}
	public Rectangle(String name, String shapetype,int length,int breadth) {
		super(name,shapetype);
		this.length=length;
		this.breadth=breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println(" Area of Rectangle : "+(length*breadth));
	}
	@Override
	public String toString() {
		return super.toString()+" Length : "+length+" Breadth "+breadth;
	}
}
class Cuboid  extends Rectangle{
	private int height;
	
	public Cuboid() {
		
	}
	public Cuboid(String name, String shapetype,int length, int breadth,int height) {
		super(name,shapetype,length,breadth);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void area() {
		float areaCuboid = 2*(getLength()+getBreadth()+height);
		System.out.println(" Area of cuboid :"+areaCuboid);
	}
	
	public void volume() {
		float vol= getLength()*getBreadth()*height;
		System.out.println(" Volume of cuboid :"+vol);
	}
	
	@Override
	public String toString() {
		return super.toString()+" height " + height + " ";
	}
	
}
public class ShapeTest {
	public static void main (String args[]) {
		Cuboid c1 = new Cuboid("cuboid","3D",7,6,7);
		c1.area();
		c1.volume();
		System.out.println(c1);
		
		/*
		Rectangle r1 = new Rectangle("Rect","2D",2,7);
		System.out.println(r1);
		*/
	}
}
