package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import by.academy.homework4.CustomDate.Day;
import by.academy.homework4.CustomDate.Month;
import by.academy.homework4.CustomDate.Year;

public class CustomDateDemo {
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in); // задать дату

		CustomDate customDate = new CustomDate();

		CustomDate.Day day = customDate.new Day();// день
		System.out.println("Введите день: ");

		int dayAdd = scan.nextInt();
		day.createDay();
//		System.out.println("проверка1 "+Day.day);//проверка
		day.setDay(dayAdd);
//		System.out.println("проверка2 "+Day.day);//проверка

		CustomDate.Month month = customDate.new Month();// месяц

		System.out.println("Введите месяц: ");

		int monthAdd = scan.nextInt();
		month.createMonth();
		month.setMonth(monthAdd);
//		System.out.println("проверка2 "+Month.month);//проверка

		CustomDate.Year year = customDate.new Year();// год

		System.out.println("Введите год: ");
		int yearAdd = scan.nextInt();
		year.createYear();
		year.setYear(yearAdd);
//		System.out.println("проверка2 "+Year.year);//проверка

		customDate.createCustomDate();// +

//		System.out.println(CustomDate.year);//+
//		System.out.println(customDate.getCustomDateStr());

		LocalDate today = LocalDate.now();
		LocalDate customDateLD = LocalDate.of(Year.year, Month.month, Day.day);

		DayOfWeek dayOfWeek = customDateLD.getDayOfWeek();
		System.out.println(dayOfWeek); // вывести на консоль день недели по заданной дате.
		System.out.println(Period.between(today, customDateLD));// количество дней

		scan.close();
	}

}
