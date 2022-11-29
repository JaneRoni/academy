package by.academy.homework1;

import java.util.Scanner;

/*Скидки:
	1) Сумма до 100 рублей -> 5%
	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
	5) Сумма покупки больше 400 рублей включая -> 20%

В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая) 
и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%. */


public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите сумму покупки: ");
		double summa = scan.nextLong();
		
		System.out.print("Введите возраст: ");
		int old = scan.nextInt();
		scan.close();
		
		if (summa < 100) { //Сумма до 100 рублей -> 5%
			double skidka = (5*summa)/100;
			System.out.println ("Сумма = " + (summa-skidka));
		}else {
				
			}
		
		}
}
