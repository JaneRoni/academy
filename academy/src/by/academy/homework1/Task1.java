package by.academy.homework1;

import java.util.Scanner;

/*Ввести с консоли сумму покупки в магазине и возраст покупателя, 
в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.

	Скидки:
	1) Сумма до 100 рублей -> 5%
	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
	5) Сумма покупки больше 400 рублей включая -> 20%. 
	
	В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая) 
и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%. 
	*/


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
			System.out.println ("Сумма= " + (summa-skidka));
		}else{
			if (summa >= 100 && summa < 200) { //Сумма от 100 рублей включая до 200 рублей не включая -> 7%
				double skidka = (7*summa)/100;
				System.out.println ("Сумма = " + (summa-skidka));
			}else{
				if (summa >= 200 && summa < 300) { //3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
					if (old >= 18) {
						double skidkaSp = (12*summa)/100; //12% 
						double summaSp = summa-skidkaSp;
						double skidkaDop = (4*summaSp)/100; //4%
						System.out.println("Сумма = " + (summaSp-skidkaDop));
					}else {
						double skidkaSp = (12*summa)/100; //12% 
						double summaSp = summa-skidkaSp;
						double skidkaDop = (3*summaSp)/100; //3%
						System.out.println("Сумма = " + (summaSp+skidkaDop));
					}
				}else {
					if (summa >= 300 && summa < 400) { //4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
						double skidka = (15*summa)/100;
						System.out.println ("Сумма = " + (summa-skidka));
					}else {
						double skidka = (20*summa)/100; //5) Сумма покупки больше 400 рублей включая -> 20%.
						System.out.println ("Сумма = " + (summa-skidka));
					}
				}
			}
		}
		
	}
}