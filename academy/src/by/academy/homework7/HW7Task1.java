package by.academy.homework7;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW7Task1 {

	public static void main(String... args) {

		List<Long> mapList = generateLongList(100, 100);

		mapList.stream().map(i -> i.intValue()).peek(e -> System.out.print(e * Math.PI - 20)).filter(i -> i < 100)
				.sorted((o1, o2) -> o1 - o2).skip(3).map((v) -> "Number: " + v).collect(Collectors.toList()).toString();

	}

	private static List<Long> generateLongList(int seed, int size) {
		return Stream.generate(() -> new Random().nextLong(seed)).limit(size).collect(Collectors.toList());
	}

}
