package by.academy.lesson10;

import java.awt.print.Printable;

public class Book implements Printable {

	private String Name;

	public Book() {

	}

	public Book(String name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setName() {
		this.Name = Name;
	}

	public void print() {
		System.out.println("Book " + Name);
	}

	public static void printBook(Printable[] printable) {

		for (Printable p : printable) {

			if (p instanceof Book) {
				// System.out.println("Book "+ Name);
				p.print();
			}
		}
	}
}
