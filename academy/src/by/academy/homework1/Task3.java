package by.academy.homework1;

import java.util.Scanner;

/*Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).*/

public class Task3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число от 1 до 10: ");
		int x = scan.nextInt();
		scan.close();
		
		for (int i=1;i<=10;i++) {
			System.out.println(x*i);
		}
	}
}
