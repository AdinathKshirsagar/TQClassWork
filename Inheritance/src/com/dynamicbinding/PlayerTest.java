package com.dynamicbinding;

class Player{
	void display() {
		System.out.println("I am a Player");
	}
}
class HockeyPlayer extends Player{
	void display() {
		System.out.println("I am a HockeyPlayer");
	}
}
class FootBallPlayer extends Player{
	void display() {
		System.out.println("I am a FootBallPlayer");
	}
}
public class PlayerTest {

	public static void main(String[] args) {
		Player p;
		p= new HockeyPlayer();
		p.display();
		
		p= new FootBallPlayer();
		p.display();
		
	}

}
