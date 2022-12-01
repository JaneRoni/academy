package by.academy.lesson5;

import java.util.Arrays;

public class ArrLesson {
	
	public static void main(String[] args) {
		
		//int [] array= {1,2,3,4,5,6,7,8,9,10};
		
		char [] charArray = {'q','w','e','r','t','y','u','i','o','p'};  
		
		/*int temp = array [0];
		array [0] = array [9];
		array [9]=temp;*/
	
		for (char i = 0; i<charArray.length;i++) {
			for (char j =i; j<charArray.length;j++) {
				if (charArray[i]<charArray[j]) {
					char temp = charArray [i];
					charArray [i] = charArray [j];
					charArray [j]= temp;
				}
			}
		}
		
		System.out.print (Arrays.toString(charArray));
	
	}
	
}
	
	/*«адача 1. —оздайте массив из всех чЄтных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
	отдел€€ один элемент от другого пробелом, а затем в столбик (отдел€€ один элемент от другого началом новой строки). 
	ѕеред созданием массива подумайте, какого он будет размера.
	2 4 6 Е 18 20
	2
	4
	6
	Е
	20*/
	
	/*public static void main(String[] args) {
		int arr []= new int [10];
		
		for (int i=0;i<arr.length) {
			
		}
		
		for (int element:arr) {
			System.out.println(element);
		}
		
	}*/

