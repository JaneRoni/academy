package by.academy.lesson7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*������� 10. (lesson 6)

���� ������ �Versions: Java  5, Java 6, Java   7, Java 8, Java 12.�  
����� ��� ��������� "Java <X>" � ����������� ��.*/

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
