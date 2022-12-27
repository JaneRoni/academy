package by.academy.lesson10;

import java.awt.print.Printable;

public class Book implements Printable {

	@Override
	public void print() {
		System.out.println("Print books");
	}

	public static void printBooks(Printable[] printable) {
		for (Printable help : printable) {
			if (help instanceof Book) {
				help.print();
			}

		}
	}
}