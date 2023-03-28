package com.abstractExample2;

public class PersonTest {

	public static void main(String[] args) {

      Person p1;
      
      p1= new PartTimeWorkWoman();
      p1.showPerson();
      
      Woman w1= new HouseWife();
      w1.showPerson();
      w1.showStatus();
     
      
      w1= new FullTimeWorkWomen();
      w1.showPerson();
      w1.showStatus();
      w1.show();
      
      
      HouseWife h1= new HouseWife();
      h1.showPerson();
      h1.showStatus();
      h1.display();
      h1.show();

	}

}

