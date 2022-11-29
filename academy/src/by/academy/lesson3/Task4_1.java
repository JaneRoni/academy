package by.academy.lesson3;

public class Task4_1 {
	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		int sut;
		int w;
		int week;
		
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		sut = h % 24;
		w = (h - sut)/24;
		week = sut % 7;

		System.out.println(week + " недель "+sut + " суток " + h + " часов " + min + " минут " + sec + " секунд");
		
		// Продолжить пример, добавить расчет и вывод суток и недель. (месяц по желанию)
			
	}

}
