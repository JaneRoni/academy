package by.academy.homework5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

//	на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

	public static HashSet<Object> getCollectionDublicat(Set<Object> set) {
		HashSet<Object> task1 = new HashSet<>(set);
		return task1;
	}

//	метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
	public static void addElement(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
		int elementSum = 10000; // 1_000_000

		for (int i = 0; i < elementSum; i++) {
			arrayList.add((int) (Math.random() * (elementSum - 1)));
			linkedList.add((int) (Math.random() * (elementSum - 1)));
		}

	}

//	 который выбирает из заполненного списка элемент наугад 100000 раз. 
	public static void getElementArray(ArrayList<Integer> arrayList) {

		int x = 1000;// 100000
		int elementSum = 10000; // 1_000_000

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < x; i++) {
			arrayList.get((int) (Math.random() * (elementSum - 1)));
		}

//		System.out.println(arrayList);// проверка
		System.out.println(System.currentTimeMillis() - startTime);

	}

	public static void getElementLinked(LinkedList<Integer> linkedList) {

		int x = 1000;// 100000
		int elementSum = 10000;// 1_000_000

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < x; i++) {
			linkedList.get((int) (Math.random() * (elementSum - 1)));
		}

//		System.out.println(linkedList);// проверка
		System.out.println(System.currentTimeMillis() - startTime);
	}

	public static void main(String... args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		Main.addElement(arrayList, linkedList);
		Main.getElementArray(arrayList);
		Main.getElementLinked(linkedList);

		
//	3 Написать итератор по двумерному массиву. 

//		Integer[][] array = { { 0, 2, 4 }, { 3, 5, 4 } };// i,j
//		CustomIterator iterator = new CustomIterator(array);
//
//		while (iterator.hasNext()) {
//			Object s = iterator.next();
//			System.out.println(s);
//		}
//		System.out.println("закончен");

		
//		4
		ArrayList<Integer> StudentsMarks = new ArrayList<Integer>();

		for (int i = 0; i < 20; i++) {
			StudentsMarks.add((int) (Math.random() * 10));
		}
//		System.out.println("StudentsMarks" + StudentsMarks);// проверка

		java.util.Iterator<Integer> iterStudMar = StudentsMarks.iterator();
		int max = 0;
		int x = 0;// искомый max
		while (iterStudMar.hasNext()) {
			max = iterStudMar.next();

			if (max > x) {
				x = max;
//				System.out.println("присвоено" + x);// проверка
			}

		}

		System.out.println("max: " + x);// max

		
//	5.

		String text = "Можно писать все в main. Не нужно создавать новых классов";

		Map<Character, Integer> symbolMap = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			char symbol = text.charAt(i);
			int counter = 0;

			for (int j = 0; j < text.length(); j++) {
				char symbol1 = text.charAt(j);

				if (symbol == symbol1) {
					counter++;
				}
			}

			symbolMap.put(symbol, counter);
		}
		
		System.out.println(symbolMap);
	}
}
