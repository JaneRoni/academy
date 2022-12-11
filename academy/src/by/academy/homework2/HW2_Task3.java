package by.academy.homework2;

import java.util.Scanner;

/*Задание 3. 
Условие здачи: ввести 2 слова, состоящие из четного числа букв. 
Получить слово состоящее из первой половины первого слова и второй половины второго слова.
 */

public class HW2_Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое слово: ");
		String str1 = scan.nextLine();
		System.out.println("Введите второе слово: ");
		String str2 = scan.nextLine();
		scan.close();
		
		int len1 = str1.length()/2;
		int len2 = str2.length()/2;
		String cut1 = str1.substring(0,len1);
		String cut2 = str2.substring(len2);
		
		String total = cut1 + cut2;
		System.out.println(total);	
	}

}
