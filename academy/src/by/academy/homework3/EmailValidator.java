package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

class EmailValidator implements Validator {

	
	private static final Pattern patternBefore = Pattern
			.compile("(\\w{1,}[\\-]{0,1}\\w{1,}[\\.]{0,1}\\w{1,})+");
	private static final Pattern patternAfter = Pattern
			.compile("(\\w{1,}[\\-]{0,1}\\w{1,}[\\.]{0,1}\\w{1,})+[\\.]{1}[a-z]{2,4}");

	@Override
	public String validate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите email: "); // janeroni93 @gmail.com
		String email = scan.nextLine();
		int index = email.indexOf('@');
		String strAfter = email.substring(index + 1);// c
		String strBefore = email.substring(0, index);// до, не включая @
		int counterError = 0;
		while (counterError == 0) {
			if (patternBefore.matcher(strBefore).matches() && patternAfter.matcher(strAfter).matches()) {
				System.out.println("True");
				counterError = 1;
			} else {
				System.out.println("email некорректен, введите еще раз ");
				counterError = 0;
			}
		}

		return email;
	}

}
