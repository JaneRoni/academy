package by.academy.lesson3;

import java.util.Scanner;

//5. Ввести с консоли 2 числа, найти большее, меньшее, среднее арифметическое.

public class Task5 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число 1 ");
		int number1 = scan.nextInt();
		
		System.out.print("Введите число 2 ");
		int number2 = scan.nextInt();
		scan.close();
		
		double n3 = (number2+number1)/2;
		
		if (number1>=number2) { 
			System.out.println("Большее число: "+number1+", меньшее число - "+number2+", среднее - "+n3);
		} else {
			System.out.println("Большее число: "+number2+", меньшее число - "+number1+", среднее - "+n3);
		}
		
	}
}
