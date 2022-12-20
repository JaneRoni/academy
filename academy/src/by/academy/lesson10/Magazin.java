package by.academy.lesson10;

import java.awt.print.Printable;

public class Magazin implements Printable{
	private String Name;
	int year;

	public Magazin() {

	}

	public Magazin(String Name, int year) {
		super();
		this.Name = Name;
		this.year = year;

	}

	@Override
	public void print() {
		System.out.println("Magazin " + Name);
	}

public static void printMagazine(Printable[]printable) {
	
	for (Printable p : printable) {
	if (p instanceof Magazin) {
		//System.out.println("Magazine "+ Name);
		p.print();
	}
	
	}
}

}
