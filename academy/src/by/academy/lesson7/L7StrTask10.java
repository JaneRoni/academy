package by.academy.lesson7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*Задание 10. (lesson 6)

Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  
Найти все подстроки "Java <X>" и распечатать их.*/

public class L7StrTask10 {
	
	String str = "";
	static Pattern pattern = Pattern.compile("[Java0-9\\s]+");
	
	public static void main(String[]args) {
		Matcher matcher = pattern.matcher("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");
		
		while (matcher.find()) {
		System.out.println(matcher.group());
		}
	}
}
