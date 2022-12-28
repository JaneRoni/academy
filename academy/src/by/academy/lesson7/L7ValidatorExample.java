package by.academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L7ValidatorExample {

	static Pattern p = Pattern.compile("[a-zA-Z0-9]+\\.[a-z]{3,}");

	public static void main(String[] args) {
	}

	public static boolean validateFileName(String fileName) {
		Matcher m = p.matcher(fileName);
		return true;
	}
	
}
