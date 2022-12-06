package by.academy.lesson4;

import java.util.Arrays;

public class ArrTasksL4 {
	public static void main (String [] args) {
	
		/*0. Создать массив типа String с размером 7. 
		Записать в него значения дней недели. 
		Вывести на консоль значение последнего элемента.*/
		
		/*String arr[] = new String [7];
		
		arr [0] = "понедельник";
		arr [1] = "вторник";
		arr [2] = "среда";
		arr [3] = "четверг";
		arr [4] = "пятница";
		arr [5] = "суббота";
		arr [6] = "воскресенье";
		
		System.out.println(arr [6]);*/
		
		
		/*1. Создать массив типа double с размером 4.
		 Записать в него любые значения с помощью блока для инициализации. 
		 Вывести на консоль значение первого элемента. .*/
		
		/*Double [] arr = {0.1,0.2,0.3,0.4};
		System.out.println(arr [0]);*/
		
		/*2. Создать массив типа String размером 3х6. И записать в него значения:
			a1  a2  a3  a4  a5  a6
			b1  b2  b3  b4  b5  b6
			c1  c2   c3  c4  c5  c6
			И распечатать.*/
			
		/*String[][] arr = new String [3][6];
		
		char c = 'a';
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length;j++) {
			arr[i][j] = ""+c+(j+1);
			}
			c++;
		}
		System.out.println(Arrays.deepToString(arr));*/
		
		
		/*3. Создать двумерный массив типа char размером 4х2. 
		И записать туда значения с помощью блока для инициализации. 
		Распечатать значения массива.*/ 
		
		char [][] arr = new char [4][2];
		arr = {{'1','2','3','4'},{'1','2'}};
		
		System.out.println(arr);
		
		
	}
}
