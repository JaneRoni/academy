package by.academy.lesson20;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Промежуточные операции:
//
//1. Сгенерировать 1000 чисел в диапазоне от 500 до 1500 используя Stream API. 
//2. Нужно пропустить первые 100 элементов.
//3. Оставить только нечетные числа.
//4. Отсортировать числа.
//5. Оставить только уникальные значения.
//6. Преобразовать с помощью map числа в строки в формате: "Строка с номером: " + n
//7. Органичить количество элементов 350.
//8. Сгенерировать List (.collect(Collectors.toList())
//
//Терминальные операции:
//
//1. Найти min/max с помощью Stream API.
//2. Проверить, есть ли в коллекции строка, которая equals строке "Число 500"

public class L20 {
	public static void main(String... args) {

		List<Integer> mapList = generateIntegerList(1000, 1000);
		mapList.stream().skip(100).filter(i -> (i % 2) >= 1).sorted((o1, o2) -> o2 - o1).distinct()
				.map(v -> "������ � �������: " + v).limit(350).toList();

		System.out.println(mapList.stream().min((s1, s2) -> s1.compareTo(s2)));
		System.out.println(mapList.stream().min((s1, s2) -> -s1.compareTo(s2)));
		System.out.println(mapList.stream().anyMatch(s -> "������ � �������: 501".equals(s)));

	}

	private static List<Integer> generateIntegerList(Integer seed, Integer size) {
		return Stream.generate(() -> new Random().nextInt(seed)).limit(size).collect(Collectors.toList());
	}
}
