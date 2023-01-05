package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{
	
	private static final Pattern pattern = Pattern.compile("((\\\\+375)|(80))[-\\s]?((29)|(25)|(33)|(44))[-\\s](\\\\d{7})");

	Scanner scanner1 = new Scanner(System.in);

	@Override
	public String validate() {
	System.out.println("Введите номер телефона: ");
	//	Buyer buyer.ph = new Buyer();
		String phone = scanner1.nextLine();
		
		int counterError = 0;
		while (counterError == 0) {
			if (pattern.matcher(phone).matches()) {
				System.out.println("OK");
				counterError = 1;
			} else {
				System.out.println("Номер некорректен, введите еще раз ");
				counterError = 0;
			}
			scanner1.close();
		}

		return phone;
		
	}

}
