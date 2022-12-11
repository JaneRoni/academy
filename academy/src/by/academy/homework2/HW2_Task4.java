package by.academy.homework2;

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
		System.out.println("Введите число: ");
		int n = scan.nextInt();
		scan.close();
		
		String arr [] = new String [36];
		
		arr [0] = "6 крести";
		arr [1] = "7 крести";
		arr [2] = "8 крести";
		arr [3] ="9 крести";
		arr [4] ="10 крести";
		arr [5] ="валет крести";
		arr [6] ="дама крести";
		arr [7] ="король крести";
		arr [8] ="туз крести";
		
		arr [9] ="6 бубны";
		arr [10] ="7 бубны";
		arr [11] ="8 бубны";
		arr [12] ="9 бубны";
		arr [13] ="10 бубны";
		arr [14] ="валет бубны";
		arr [15] ="дама бубны";
		arr [16] ="король бубны";
		arr [17] ="туз бубны";
		
		arr [18] ="6 червы";
		arr [19] ="7 червы";
		arr [20] ="8 червы";
		arr [21] ="9 червы";
		arr [22] ="10 червы";
		arr [23] ="валет червы";
		arr [24] ="дама червы";
		arr [25] ="король червы";
		arr [26] ="туз червы";
		
		arr [27] ="6 пики";
		arr [28] ="7 пики";
		arr [29] ="8 пики";
		arr [30] ="9 пики";
		arr [31] ="10 пики";
		arr [32] ="валет пики";
		arr [33] ="дама пики";
		arr [34] ="король пики";
		arr [35] ="туз пики";
		
		int counter = 0;
		while (counter<n){
			int a = 0;
			int b = 35;
			int random1 = a + (int)(Math.random()*b);
			int random2 = a + (int)(Math.random()*b);
			int random3 = a + (int)(Math.random()*b);
			int random4 = a + (int)(Math.random()*b);
			int random5 = a + (int)(Math.random()*b);
			counter++;

			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<counter;j++) {
					String c1 = arr [random1];
					String c2 = arr [random2];
					String c3 = arr [random3];
					String c4 = arr [random4];
					String c5 = arr [random5];
					
					System.out.println("Игрок "+counter+": "+c1+", "+c2+", "+c3+", "+c4+", "+c5);
					System.out.println("\n");
				}
				break;
			}
		}
	}
}
