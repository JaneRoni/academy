package by.academy.homework2;

import java.util.Scanner;

/*Задание 2. 
Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
Если таких слов несколько, найти первое из них.
 */

public class HW2_Task2 {
	public static void main(String[] args) {
		String arr [] = new String [10];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество слов: ");
		int n = scan.nextInt();
		
		int counter = 0;
		while (counter < n) {
			System.out.println("Введите слово "+(counter+1)+": ");
			String str = scan.nextLine();
			counter++;
			
			
			for (int i=0;i<counter;i++) {
				arr [i] = str;
				
			}
			
		}
		
		scan.close();
		System.out.println(arr[0]+arr[1]);
	
	
	
	}
	
}
