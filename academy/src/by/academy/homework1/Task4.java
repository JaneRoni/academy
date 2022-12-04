package by.academy.homework1;

/*Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000. */

public class Task4 {
	public static void main(String[] args) {
		int x = 0;
		
		for (int i=1;x<1_000_000;i++) {
			x = 2*i;
			System.out.println(i);
		}	
	}
}
