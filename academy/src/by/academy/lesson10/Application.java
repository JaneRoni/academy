package by.academy.lesson10;

import java.awt.print.Printable;

public class Application {
	public static void main(String... args) {
		Printable [] array = new Printable[5];
		array[0] = new Book ("�������1");
		array[1] = new Book ("�������2");
		array[2] = new Book ("�������3");
		array[3] = new Magazin ("�������4",2000);
		array[4] = new Magazin ("�������5",2010);
		
		for (Printable p : array) {
			p.print();
		}
	}

}
