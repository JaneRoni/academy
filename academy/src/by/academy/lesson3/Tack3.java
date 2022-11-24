package by.academy.lesson3;

import java.util.Scanner;

public class Tack3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter month ");
		String str = scan.nextLine();
		scan.close();

		switch (str) {
		case "январь":
			System.out.println("1");
			break;

		case "февраль":
			System.out.println("2");
			break;
			
		case "март":
			System.out.println("3");
			break;
			
		case "апрель":
			System.out.println("4");
			break;
			
		case "май":
			System.out.println("5");
			break;
			
		case "июнь":
			System.out.println("6");
			break;	
		}

	}
}
