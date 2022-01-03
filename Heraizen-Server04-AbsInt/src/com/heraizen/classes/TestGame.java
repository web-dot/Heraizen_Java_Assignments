package com.heraizen.classes;

public class TestGame {
	
	
	public static int radInt(int min, int max) {
		return (int)(Math.random()*(max-min)+min);
	}
	

	public static void main(String[] args) {
		

		Game[] gamesArr = new Game[10];
		
		for(int i=0; i<10; i++) {
			int random = radInt(1,3);
			switch(random) 
			{
				case 1: 
					gamesArr[i] = new Car();
					break;
				case 2:
					gamesArr[i] = new Bike();
					break;
				case 3:
					gamesArr[i] = new Bicycle();
					break;
			}
		}

	}

}
