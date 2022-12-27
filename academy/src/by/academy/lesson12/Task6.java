package by.academy.lesson12;

import by.academy.homework3.Cheese;

public class Task6 {
	
	public static void main (String ...args) {
		
		ThreeGeneric <String, Cheese, Double> threegeneric = new ThreeGeneric<>("Cheese", new Cheese, 2.0);
	
		threegeneric.Name();
	}

}
