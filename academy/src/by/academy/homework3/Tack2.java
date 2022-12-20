package by.academy.homework3;

import java.util.Scanner;

/*2. Добавить 3 типа продукта, наследоваться от Product, реализовать метод подсчета
цены для каждого продукта. Добавить расчет цены со скидкой. (В каждом продукте 
своя скидка).*/

public class Tack2 {
 public static void main(String...args) {
	 Product Product1 = new Product();
	 Product Product2 = new Product();
	 Product Product3 = new Product();
	 
	 Product1.name = "milk";
	 Product1.price = 2.05;
	 
	 Product2.name = "bread";
	 Product2.price = 1.10;
	 
	 Product3.name = "wine";
	 Product3.price = 10.10;
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Введите количество "+Product1.name+" : ");
	 int quentity1 = scan.nextInt();
	 //String Prod1 = scan.nextLine();
	 
	 System.out.println("Введите количество "+Product2.name+" : ");
	 int quentity2 = scan.nextInt();
	 //String Prod2 = scan.nextLine();
	 
	 System.out.println("Введите количество "+Product3.name+" : ");
	 int quentity3 = scan.nextInt();
	 //String Prod3 = scan.nextLine();
	 
	 
 }
}
