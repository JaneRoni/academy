package by.academy.lesson7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

/*1. Ќайти в строке не только зап€тые, но и другие знаки препинани€. ѕодсчитать
общее их количество*/


public class L7RegTask1 {
	
	String p="";
	static Pattern pattern = Pattern.compile("[!\\.,;:]");
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Matcher matcher = pattern.matcher(sc.nextLine());
		
		int counter = 0;
		while (matcher.find()) {
			System.out.println(matcher.group());
			counter++;
		}
		System.out.println(counter);
		sc.close();
		
	}

}
