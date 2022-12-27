package by.academy.lesson10;

import java.awt.print.Printable;

public class Magazine implements Printable {

	@Override
	public void print() {
		System.out.println("Print magazine");

	}

	public static void printMagazines(Printable[] printable) {
		for (Printable help : printable) {
			if (help instanceof Magazine) {
				help.print();
			}

		}
	}

}
