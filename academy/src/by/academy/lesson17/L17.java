package by.academy.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L17 {

//	1.	Создать статический метод который принимает на вход три параметра: login, password и confirmPassword. 
//	Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20 символов. 
//	Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException. Password должен содержать 
//	только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов. Также password 
//	и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить 
//	WrongPasswordException.  WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
//	 – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception. Обработка исключений проводится
//	  внутри метода. Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае. (Задание с урока)

	private static final Pattern VALIDATION = Pattern.compile("[A-Za-z0-9_]");
//	private static final Pattern VALIDATEPASSWORD = Pattern.compile("[A-Za-z0-9_]{5.20}");

	public static void main(String... strings) {

//		String login;
//		String password;
//		String confirmPassword;

		System.out.println(login("test", "dfsgsgsgsdsd", "dfsgsgsg"));
		System.out.println(login("test", "dfsgsgsgsdsd", "dfsgsgsgsdsd"));

	}

	public static boolean login(String login, String password, String confirmPassword) {
		try {
			return validate(login, password, confirmPassword);
		} catch (WrongLoginException | WrongPasswordException e) {
//			e.printStackTrace();
			System.out.println(e);
			return false;

		}

	}

	public static boolean validate(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {

		Matcher matcherlogin = VALIDATION.matcher(confirmPassword);
		Matcher matcherpassword = VALIDATION.matcher(confirmPassword);

		if (!matcherlogin.matches()) {
			throw new WrongLoginException("����� �� ���������");
		}

		if (!matcherpassword.matches()) {
			throw new WrongPasswordException("������ �� ���������");
		}

		if (password != confirmPassword) {
			throw new WrongLoginException("������ �� ���������");
		}
		return true;
	}

}
