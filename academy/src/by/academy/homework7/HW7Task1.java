package by.academy.homework7;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных 
//Long чисел в диапазоне от 0 до 100. Каждое число умножить на PI и 
//отнять 20. +Отфильтровать, оставив числа меньшие 100. Отсортировать по 
//возрастанию. Пропустив первые 3 числа произвести следующие операции:
//Преобразовать лист чисел в Map (операция collect), где ключем является 
//само число а значением строка: ("Number: " + value).

public class HW7Task1 {

	public static void main(String... args) {
		
		List <Long> mapList = generateLongList(100,100);
		
		mapList.stream()
		.map(i->i.intValue())
		.peek(e->System.out.print(e*3.14-20))
		.filter(i->i<100)
		.sorted((o1,o2)->o1-o2)
		.skip(3)
		.map((v)->v+"Number:")
		.collect(Collectors.toList());
		
//	System.out.println(mapList);
	}

	private static List<Long> generateLongList(int seed, int size) {
		return Stream.generate(() -> new Random().nextLong(seed)).limit(size).collect(Collectors.toList());
	}

}
