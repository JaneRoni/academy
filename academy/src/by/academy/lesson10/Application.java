package by.academy.lesson10;

import java.awt.print.Printable;

public class Application {
	public static void main(String... args) {
		Printable [] array = new Printable[5];
		array[0] = new Book ("Колобок1");
		array[1] = new Book ("Колобок2");
		array[2] = new Book ("Колобок3");
		array[3] = new Magazin ("Колобок4",2000);
		array[4] = new Magazin ("Колобок5",2010);
		
		for (Printable p : array) {
			p.print();
		}
	}

}
