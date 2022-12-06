package by.academy.lesson5;

import java.util.Scanner;

public class StrTaskL5 {
	public static void main(String[] args) {
		
		/*1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. 
Вывести найденные строки и их длину.*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Введите число строк: ");
	
		int n = sc.nextInt();
		String smin = sc.next();
		
		for(int i=1;i<n;i++) {
			String s2 = sc.next();
			if (smin.length()>s2.length()) {
				
			}
			
		}
		System.out.println (smin);
		sc.close();
		
		/*2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) 
		значений их длины.*/
		
		
		
		
	}

}
