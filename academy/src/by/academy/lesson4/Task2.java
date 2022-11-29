package by.academy.lesson4;

public class Task2 {
	public static void main (String [] args) {
		int sum = 0;
		int i = 0;
		while (i<20) {
			if (1%2 == 0) {
				sum +=1;
			}
			i++;
		}
		System.out.print ("sum = " + sum);
	}
}
