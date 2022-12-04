package by.academy.homework1;

import java.util.Scanner;

/*Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную, вывести на экран:
	a) если тип данных int, вывести остаток от деления на 2
	b) если double, вывести 70% от числа 
	c) если float, возвести в квадрат
	d) если char, вывести код символа (charAt(0))
	e) String, вывести на экран строку в виде ("Hello " + переменная)
	f) во всех остальных случаях вывести на экран ("Unsupported type");*/


public class Task2 {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите тип данных: ");
		String x = scan.nextLine();
		
		System.out.println("Введите переменную: ");
		int y = scan.nextInt();
		scan.close();
		
		switch (x) {
		case "int": 
			System.out.println(y%2);
		break;
		case "double": 
			System.out.println((70*y)/100);
		break;
		case "float":
			System.out.println(y*y);
		break;
		case "char":
			System.out.println(x.charAt(0));
		break;
		case "String":
			System.out.println("Hello "+y);
		break;
		default:
			System.out.println("Unsupported type");
		
		}
	}
}
