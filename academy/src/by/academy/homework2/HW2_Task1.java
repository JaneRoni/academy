package by.academy.homework2;

import java.util.Scanner;

/*Задание 1. 
Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки. 
Учитываем регистр. Не использовать сортировку :) 
Например: 
1.	“hello” и “hlleo” -> true
2.	“hello” и “art” -> false */

public class HW2_Task1 {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите первую строку: ");
	String str1 = scan.nextLine();
	System.out.println("Введите вторую строку: ");
	String str2 = scan.nextLine();
	scan.close();

	char array[] = new char [26]; //массив из букв
	char x = 'a';
	
	for (int q=0;q<array.length;q++) {
		array [q]=x;
		x++;
	}
	
	int arr[] = new int [26]; //массив численный
	int y = 0;
	
	for (int z=0;z<arr.length;z++) {//нули в массив
		arr[z]=0;
	}

	int arr2[] = new int [16];
	
	
	for (int u=0;u<str1.length();u++) {//hello
		for (int n=0;n<array.length;n++) {
			if (array[n]==str1.charAt(u)) {//индекс буквы в массиве букв h-h
				//System.out.println("in ar "+array[n]);//h
				//System.out.println("in "+str1.charAt(u));//h
				//System.out.println("n bef "+n);//7
				//System.out.println("arr2 [u] bef "+arr2 [u]);//0
				arr2 [u] = n;
				
				//System.out.println("arr2 [u] "+arr2 [u]); //7
				//arr2 [u]=ind;
				System.out.println("2: "+arr2[0]+""+arr2[1]+""+arr2[2]+""+arr2[3]+""+arr2[4]); //0
			}
		//int sravn = str1.charAt(u);
		//System.out.println(u);
		//System.out.println(sravn);
		}	
	}
	
	//System.out.println("2: "+arr2[0]+""+arr2[1]+""+arr2[2]+""+arr2[3]+""+arr2[4]);//+
	
	int count3 = 0;
	for (int m=0;m<arr2.length;m++) {
		//System.out.println(arr2.length);
		//System.out.println(arr2 [0]);//7
		//System.out.println("m "+arr2 [m]);//7+
		while(arr2 [m]>0) {
			if(arr2 [m]==arr2 [m+1]) {
				//System.out.println("+");//7
				count3++;
			}else {
				//System.out.println("-");//7
			}
		break;
		}
		
		/*if (m==0) {
			System.out.println("0 ");
		}else {
			if (arr2[m]==arr[m+1]) {
				System.out.println("arr2[m] "+arr2[m]);
				System.out.println("arr[m-1] "+arr[m-1]);
				count3++;
				System.out.println("cou3 "+count3);
			}else {
				//System.out.println("cou3 "+count3);
			}
		}*/
	}
	//System.out.println(count3);//1
	//if (array[d]==str1.charAt(i)) {
		
	//}
	
	int counter = 0;
	for (int i=0;i<str1.length();i++) { //первая строка
		for (int j=0;j<str2.length();j++) { //вторая строка
			if (str1.charAt(i) == str2.charAt(j)) {
				char l1= str1.charAt(i); //букву по индексу
				
				for (int d=0;d<array.length;d++) {
					
					if (array[d]==str1.charAt(i)) {//индекс буквы в массиве букв
						int foun =d;
						//System.out.println(foun);
						//System.out.println(arr [foun]);
						arr [foun] = arr [foun]+1; 
					}
				}
				
				counter++;
			}else{
				//System.out.println("не"+i+j);
			}
		}			
	}
	

	int countTr = count3+1;
	int uni = str1.length()-countTr;
	int povtor = countTr*countTr;
	int length = povtor + uni;
	int sum = 0;
	
	
	for (int t=0;t<arr.length;t++) { 
		sum = sum+arr[t];
		
	}
	
	
	
	
	System.out.println("счетчик "+counter);
	System.out.println("сумма массива"+sum);
	if (sum==counter && sum==length && counter>0) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}

	
	//System.out.println("массив"+arr2);
	
	}
}
