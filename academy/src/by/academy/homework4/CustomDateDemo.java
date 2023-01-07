package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import by.academy.homework4.CustomDate.Day;
import by.academy.homework4.CustomDate.Month;
import by.academy.homework4.CustomDate.ValidCustomDate;
import by.academy.homework4.CustomDate.Year;

public class CustomDateDemo {
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in); // задать дату

		CustomDate customDate = new CustomDate();

		CustomDate.Day day = customDate.new Day();// день
		System.out.println("Введите день: ");

		int dayAdd = scan.nextInt();
		CustomDate.dayCD = dayAdd;

		CustomDate.Month month = customDate.new Month();// месяц

		System.out.println("Введите месяц: ");

		int monthAdd = scan.nextInt();
		CustomDate.monthCD = monthAdd;

		CustomDate.Year year = customDate.new Year();// год
		System.out.println("Введите год: ");
		int yearAdd = scan.nextInt();
		CustomDate.yearCD = yearAdd;

		customDate.createCustomDateStr(yearAdd, monthAdd, dayAdd);// констр строки

		CustomDate.ValidCustomDate validCustomDate = customDate.new ValidCustomDate();
		validCustomDate.validate();

		if (validCustomDate.counterError == 1) {
			day.createDay();
			day.setDay(dayAdd);

			month.createMonth();
			month.setMonth(monthAdd);

			year.createYear();
			year.setYear(yearAdd);

			customDate.createCustomDate();
		}

		LocalDate today = LocalDate.now();
		LocalDate customDateLD = LocalDate.of(Year.year, Month.month, Day.day);

		DayOfWeek dayOfWeek = customDateLD.getDayOfWeek();
		System.out.println(dayOfWeek); // вывести на консоль день недели по заданной дате.
		System.out.println(Period.between(today, customDateLD));// количество дней

		scan.close();
	}

}
