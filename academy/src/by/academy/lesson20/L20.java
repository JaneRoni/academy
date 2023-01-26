package by.academy.lesson20;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L20 {
	public static void main(String... args) {

		List<Integer> mapList = generateIntegerList(1000, 1000);
		mapList.stream().skip(100).filter(i -> (i % 2) >= 1).sorted((o1, o2) -> o2 - o1).distinct()
				.map(v -> "Строка с номером: " + v).limit(350).toList();

		System.out.println(mapList.stream().min((s1, s2) -> s1.compareTo(s2)));
		System.out.println(mapList.stream().min((s1, s2) -> -s1.compareTo(s2)));
		System.out.println(mapList.stream().anyMatch(s -> "Строка с номером: 501".equals(s)));

	}

	private static List<Integer> generateIntegerList(Integer seed, Integer size) {
		return Stream.generate(() -> new Random().nextInt(seed)).limit(size).collect(Collectors.toList());
	}
}
