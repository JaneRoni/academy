package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

/*Задание 4. 
Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер. 
Программа получает число n, задаваемое с консоли пользователем, 
и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды. 
Разделяйте пять карт, выданных каждому игроку, пустой строкой.
*/

public class HW2_Task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число игроков: ");
		int n = scan.nextInt();
		scan.close();

		String arr[] = new String[37];// массив карт

		arr[0] = "пустой";
		arr[1] = "6 крести";
		arr[2] = "7 крести";
		arr[3] = "8 крести";
		arr[4] = "9 крести";
		arr[5] = "10 крести";
		arr[6] = "валет крести";
		arr[7] = "дама крести";
		arr[8] = "король крести";
		arr[9] = "туз крести";

		arr[10] = "6 бубны";
		arr[11] = "7 бубны";
		arr[12] = "8 бубны";
		arr[13] = "9 бубны";
		arr[14] = "10 бубны";
		arr[15] = "валет бубны";
		arr[16] = "дама бубны";
		arr[17] = "король бубны";
		arr[18] = "туз бубны";

		arr[19] = "6 червы";
		arr[20] = "7 червы";
		arr[21] = "8 червы";
		arr[22] = "9 червы";
		arr[23] = "10 червы";
		arr[24] = "валет червы";
		arr[25] = "дама червы";
		arr[26] = "король червы";
		arr[27] = "туз червы";

		arr[28] = "6 пики";
		arr[29] = "7 пики";
		arr[30] = "8 пики";
		arr[31] = "9 пики";
		arr[32] = "10 пики";
		arr[33] = "валет пики";
		arr[34] = "дама пики";
		arr[35] = "король пики";
		arr[36] = "туз пики";

		int arr2[] = new int[arr.length]; // массив для записи карт

		int a = 1;
		int b = 36;
		int counterAll = 0; // счетчик карт

		int counterPerson = 0; // счетчик игроков
		while (counterPerson < n) {
			int random1 = a + (int) (Math.random() * (b - a + 1) + a); // 1карта

			for (int t = 0; t < arr2.length; t++) {// перебор массива записи
				while (random1 == arr2[t]) {
					random1 = a + (int) (Math.random() * (b - a + 1) + a);
				}
			}

			arr2[(counterAll + 1)] = random1;// записать карту в массив
			counterAll++;// 1

			int random2 = a + (int) (Math.random() * (b - a + 1) + a);// 2

			for (int q = 0; q < arr2.length; q++) {// перебор массива записи
				while (random2 == arr2[q]) {
					random2 = a + (int) (Math.random() * (b - a + 1) + a);
				}
			}

			arr2[(counterAll + 1)] = random2;
			counterAll++;// 2

			int random3 = a + (int) (Math.random() * (b - a + 1) + a);// 3

			for (int w = 0; w < arr2.length; w++) {// перебор массива записи
				while (random3 == arr2[w]) {
					random3 = a + (int) (Math.random() * (b - a + 1) + a);
				}
			}

			arr2[(counterAll + 1)] = random3;
			counterAll++;// 3

			int random4 = a + (int) (Math.random() * (b - a + 1) + a);// 4

			for (int e = 0; e < arr2.length; e++) {// перебор массива записи
				while (random4 == arr2[e]) {
					random4 = a + (int) (Math.random() * (b - a + 1) + a);
				}
			}

			arr2[(counterAll + 1)] = random4;
			counterAll++;// 4

			int random5 = a + (int) (Math.random() * (b - a + 1) + a);// 5

			for (int r = 0; r < arr2.length; r++) {// перебор массива записи
				while (random5 == arr2[r]) {
					random5 = a + (int) (Math.random() * (b - a + 1) + a);
				}
			}

			arr2[(counterAll + 1)] = random5;
			counterAll++;// 5

			counterPerson++;

		}

		// System.out.println(Arrays.toString(arr2));//проверка массива

		// вывод на экран
		int counterSOP = 0;

		for (int i = 0; i < arr.length; i++) {// по картам
			for (int j = 1; j < arr2.length; j++) {// записанные числа

				if (arr2[j] == arr.length) {
					String st1 = arr[arr2[j - 1]];
					System.out.println(st1);
					counterSOP++;
				} else {
					String st1 = arr[arr2[j]];
					System.out.println(st1);
					counterSOP++;
				}

				if (counterSOP == 5) {
					System.out.println("\n");
					counterSOP = 0;
				}

				if (j == (5 * n)) {
					break;
				}
			}
			break;
		}

	}
}
