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
		mapList.stream().peek(e->System.out.print(e*3.14-20))
			.filter(i->i<100).sorted((o1,o2)->o1-o2)
			.skip(3).collect((Collectors.joining(v -> "Number: "+v).toList));
//		forEachOrdered((p)-> p.append(p*3,14-20)).
//		peek((e)-> {((e*3,14)-20)}). 	
	}

	private static List<Long> generateLongList(int seed, int size) {
		return Stream.generate(() -> new Random().nextLong(seed)).limit(size).collect(Collectors.toList());
	}
	
	
//	long count = Stream
//			.generate(() -> new Random().nextInt(255))
//			.limit(100)
//			.filter(intValue -> intValue < 50)
//			.peek(s -> System.out.print(s + " "))
//			.map(intValue -> (char) intValue.intValue())
//			.peek(s -> System.out.print(s + " "))
//			.filter(intValue -> intValue > 50)
//			.map(intValue -> intValue.intValue())
//			.peek(s -> System.out.print(s*1000 + " "))
//			.count();
//
//System.out.println();

}
