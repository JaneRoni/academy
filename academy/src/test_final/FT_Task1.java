package test_final;

import java.util.Scanner;

public class FT_Task1 {

	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите строку для сжатия: ");

		StringValidatorTestTask1 Validator = new StringValidatorTestTask1();
		String str = scan.nextLine();
		str = Validator.validate(str);
		scan.close();

		stringCompression(str);

	}

	public static void stringCompression(String str) {

		String strInStr[] = new String[str.length()];// запись итог счетч сим+кол
		char strInCharCounter[] = new char[str.length()];// счет симв букв j
		int strInStrCounter[] = new int[str.length()];// счет симв кол i
		String resultStr[] = new String[str.length()];// [str.length()];// массив итога

		// бежим по массиву+запись с сч
		int stringCounter = 0;
		char charString = ' ';

		for (int k = 0; k < str.length(); k++) {// по строке
			if (k == 0) {

//				System.out.println("Зашел в ноль");
				charString = str.charAt(k);
				stringCounter++;

				strInCharCounter[k] = charString;
				strInStrCounter[k] = stringCounter;

				String strIn = charString + " " + stringCounter;
//				System.out.println(strIn);
				strInStr[k] = strIn;

			} else {
				if (str.charAt(k) != str.charAt(k - 1)) {

					stringCounter = 0;
//					System.out.println("не равны");
					charString = str.charAt(k);
					stringCounter++;
					strInCharCounter[k] = charString;
					strInStrCounter[k] = stringCounter;

					String strIn = charString + " " + stringCounter;
//					System.out.println(strIn);
					strInStr[k] = strIn;

				} else {
//					System.out.println("равны");
					charString = str.charAt(k);
					stringCounter++;
					String strIn = charString + " " + stringCounter;
//					System.out.println(strIn);
					strInStr[k] = strIn;
					strInCharCounter[k] = charString;
					strInStrCounter[k] = stringCounter;

				}
			}

		}

//		System.out.println(Arrays.toString(strInStr));
		// [q 1, w 1, w 2, e 1, e 2, r 1, r 2]

//		System.out.println(Arrays.toString(strInCharCounter));// i
		// [q, w, w, e, e, r, r]
//		System.out.println(Arrays.toString(strInStrCounter));// j
		// [1, 1, 2, 1, 2, 1, 2]

		// записываем в resultStr[] буква+кол с null
		for (int i = 0; i < strInStrCounter.length; i++) {// кол
			if (i == (strInStrCounter.length - 1)) {
//				System.out.println("хвост" + "i" + i + "  " + strInStrCounter[i]);
				String resultCou = "" + strInCharCounter[i] + strInStrCounter[i] + "";
//				System.out.println(resultCou);
				resultStr[i] = resultCou;
			} else {

				if (strInStrCounter[i] < strInStrCounter[i + 1]) {
//					System.out.println("меньше" + "i" + i + " " + strInStrCounter[i]);

				} else {

//					System.out.println("больше равно" + " i " + i + " " + strInStrCounter[i]);
					String resultCou = "" + strInCharCounter[i] + strInStrCounter[i] + "";
//					System.out.println(resultCou);
					resultStr[i] = resultCou;
				}
			}
		}

//		System.out.println(Arrays.toString(resultStr));// результат в виде массива с налами
		// [q1, null, w2, null, e2, null, r2]

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < resultStr.length; i++) { // бежим по мас рез-а, достаем знач
			if (resultStr[i] == null) {
//				System.out.println("Пропущен null");
			} else {
//				System.out.println("Текущий" + i);
				sb.append(resultStr[i]);
			}
		}

		String string = sb.toString();
//			System.out.println(string);

		System.out.println("Длина новой строки: " + string.length());
		System.out.println("Длина старой строки: " + str.length());

		if (string.length() >= str.length()) {
			System.out.println("Итог, возврат старой строки: " + str);
		} else {
			System.out.println("Итог, возврат новой строки: " + string);
		}

	}

}
