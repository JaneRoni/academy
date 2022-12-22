package by.academy.lesson11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class L11T1 {
	public static void main(String[] args) {
		LocalDate todayHB = LocalDate.of(1993, 11, 27);

		int year = todayHB.getYear();
		Month month = todayHB.getMonth();

		int dayOfYear = todayHB.getDayOfYear();
		DayOfWeek dayOfWeek = todayHB.getDayOfWeek();

		System.out.println(year);
		System.out.println(month);
		System.out.println(dayOfYear);
		System.out.println(dayOfWeek);

		LocalDate today = LocalDate.now();
		boolean q = today.isAfter(todayHB);
		boolean w = today.isBefore(todayHB);

		System.out.println("isAfter " + q);
		System.out.println("isBefore " + w);
		
		String todayHB1 = todayHB.toString();

		
		boolean e = todayHB1.is 
		//System.out.println(dayOfYear.)
	}
}
