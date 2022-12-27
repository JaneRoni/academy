package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

/*Задание 2. 
Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
Если таких слов несколько, найти первое из них.
 */

public class HW2_Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество слов: ");// размерность массива
		int n = scan.nextInt();

		String arr[] = new String[n]; // массив записи слов

		int i = 0;
		arr[i] = scan.nextLine();

		for (i = 0; i < arr.length; i++) {// по массиву
			System.out.println("Введите слово " + (i + 1) + ": ");
			arr[i] = scan.nextLine();
		}

		scan.close();

		int arr2[] = new int[n];// массив записи индекса
		for (int j = 0; j < n; j++) {
			char[] arr3 = arr[j].toCharArray();
			int counter = 0;
			for (int z = 0; z < arr3.length; z++) {
				for (int c = z + 1; c < arr3.length; c++) {

					if (arr3[z] == arr3[c] && arr3[z] != '\u0000') {
						arr3[c] = '\u0000';
						counter++;
					}
				}

			}
			arr2[j] = arr[j].length() - counter;
		}

		int min = arr2[0];
		int x = 0; // искомое слово

		for (int t = 0; t < arr2.length; t++) {
			if (arr2[t] < min) {
				min = arr2[t];
				x = i;
				break;
			}
		}
		if (x == arr.length) {
			x = x - 1;
		}
		System.out.println("Искомое: " + arr[x]);
	}
}