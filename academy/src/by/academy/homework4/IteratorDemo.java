package by.academy.homework4;

import java.util.Scanner;

public class IteratorDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Введите индекс: ");
		CustomIterator.count = scan.nextInt();
		System.out.println("Введите значение для удаления: ");
		CustomIterator.x = scan.nextInt();
		scan.close();

		Integer[] array = { 3, 5, 7, 4 };

		CustomIterator<Integer> iterator = new CustomIterator<>(array);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		while (iterator.hasNext()) {
			iterator.remove();
		}

	}

}
