package test_final;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringValidatorTestTask1 implements ValidatorTestTask1 {

	private static final Pattern patternString = Pattern.compile("[a-zA-Z]{1,}+");
	Scanner scan = new Scanner(System.in);
	public int counter = 0;

	@Override
	public String validate(String str) {
		int counter = 0;
		while (counter == 0) {

			if (patternString.matcher(str).matches()) {
				System.out.println("Вы ввели: " + str);
				counter = 1;
				return str;

			} else {
				System.out.println("Введите заново");
				counter = 0;
				str = scan.nextLine();
			}

		}
		return str;

	}

}
