package by.academy.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L17 {

//	1.	������� ����������� ����� ������� ��������� �� ���� ��� ���������: 
//		login, password � confirmPassword. Login ������ ��������� ������ ��������� �����, 
//		����� � ���� �������������. ����� login ������ ���� ������ 20 ��������. 
//		���� login �� ������������� ���� �����������, ���������� ��������� WrongLoginException. 
//		Password ������ ��������� ������ ��������� �����, ����� � ���� �������������. ����� password ������ ���� ������ 20 ��������. 
//		����� password � confirmPassword ������ ���� �����. ���� password �� ������������� ���� �����������, 
//		���������� ��������� WrongPasswordException.  WrongPasswordException � WrongLoginException - ���������������� ������ ���������� 
//		� ����� �������������� � ���� �� ���������, ������ ��������� ��������� ���������� � �������� ��� � ����������� ������ Exception. 
//		��������� ���������� ���������� ������ ������. ���������� multi-catch block. ����� ���������� true, ���� �������� ����� ��� false � ������ ������. (������� � �����)

	private static final Pattern VALIDATION = Pattern.compile("[A-Za-z0-9_]");
//	private static final Pattern VALIDATEPASSWORD = Pattern.compile("[A-Za-z0-9_]{5.20}");

	public static void main(String... strings) {

//		String login;
//		String password;
//		String confirmPassword;
		
		System.out.println(login("test","dfsgsgsgsdsd","dfsgsgsg"));
		System.out.println(login("test","dfsgsgsgsdsd","dfsgsgsgsdsd"));
		

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
