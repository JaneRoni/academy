package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);

		Buyer buyer = new Buyer();
		buyer.name = "Покупатель";
		buyer.money = 50.00;
		buyer.phone = "+375291235694";
		buyer.email = "buyer@gmail.com";

		DateClass date = new DateClass();
		buyer.dateOfBirth = date.getDate();
		
		System.out.println("Deadline: " + Deal.getDeadlineDate()); // дедлайн

		Seller seller = new Seller("Евроторг", 00.00);// продавец

		Product productDeal[] = new Product[100]; // создать массив
		Deal deal = new Deal(buyer, seller, productDeal); // создать сделку

		deal.AddProductToStore(); // реализовать метод добавления продуктов

		Validator number = new BelarusPhoneValidator();//создать валидатор номера
		Validator eMail = new EmailValidator();//создать валидатор номера ящика
		buyer.phone = number.validate();
		String email = eMail.validate();
		
		scan.close();
	}

}
