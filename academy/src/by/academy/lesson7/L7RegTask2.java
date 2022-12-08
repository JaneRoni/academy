package by.academy.lesson7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*2. »меетс€ строка с текстом. ѕодсчитать количество слов в тексте. ∆елательно
учесть, что слова могут раздел€тьс€ несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

public class L7RegTask2 {
	String str = "";
	static Pattern pattern = Pattern.compile("[A-Za-z]+"); //каждые вхождени€ 

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Matcher matcher = pattern.matcher(sc.nextLine().trim()); //убирает пробельные символы
		
		int counter = 0;
		while (matcher.find()) {
			System.out.println(matcher.group());
			counter++;
		}
		System.out.println(counter);
		sc.close();
	}
}
