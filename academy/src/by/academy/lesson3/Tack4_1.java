package by.academy.lesson3;

public class Tack4_1 {
	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		sec = s % 60;
		m = (s-sec)/60;
		min = m % 60;
		h = (m-min)/60;
		System.out.print(h+"часов "+min+" минут");
	}

}
