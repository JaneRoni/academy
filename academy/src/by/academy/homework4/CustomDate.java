package by.academy.homework4;

//Задание 1.
//+Создать класс CustomDate, используя вложенные классы Год, Месяц, День. 
//+Методы: задать дату, вывести на консоль день недели по заданной дате. 
//+День недели представить в виде перечисления. 
//+Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class CustomDate {

	class Year {
		public static int year;

		public Year() {
			super();
		}

		public Year(int year) {
			this();
			this.year = year;
		}

		public void createYear() {
			Year year = new Year();
//			System.out.println("Проверка созд Year " + year);// тест
		}

		public void setYear(int year) {
			this.year = year;
		}

	}

	class Month {
		public static int month;

		public Month() {
			super();
		}

		public Month(int month) {
			this();
			this.month = month;
		}

		public void createMonth() {
			Month month = new Month();
//			System.out.println("Проверка созд Month " + month);// тест
		}

		public void setMonth(int month) {
			this.month = month;
		}

	}

	class Day {
		public static int day;

		public Day() {
			super();
		}

		public Day(int day) {
			this();
			this.day = day;
		}

		public void createDay() {
			Day day = new Day();
//			System.out.println("Проверка созд " + day);// тест
		}

		public void setDay(int day) {
			this.day = day;
		}
	}

	public static String customDateStr;
	public static int year;
	public static int month;
	public static int day;

	public CustomDate() {
		super();
	}

	public CustomDate(int year, int month, int day) {
		this();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void createCustomDate() {
		CustomDate customDate = new CustomDate();
		customDate.year = Year.year;
		customDate.month = Month.month;
		customDate.day = Day.day;
//		System.out.println("Проверка созд CustomDate "+customDate);// тест
		CustomDate.customDateStr = customDate.day + "-" + customDate.month + "-" + customDate.year;
	}

	public String getCustomDateStr() {
		return customDateStr;
	}

}
