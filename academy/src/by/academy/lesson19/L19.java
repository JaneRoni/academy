package by.academy.lesson19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import by.academy.lesson14.HeavyBox;

//1.	Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
//2.	Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.
//3.	Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
//4.	Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального интерфейса Predicate.
//5.	Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. Используем функциональный интерфейс Predicate.
//6.	Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение “Отгрузили ящик с весом n”. “Отправляем 
//ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen.

public class L19 {

	public static void main(String... args) {
//		p -> System.out.println("hello");
//		Printable p1 = p -> p.print();

		// Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
		Printable p1 = () -> System.out.println("hello");
		p1.print();

		// Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.
		String str = "Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.";
		Predicate<String> consNull = s -> s != null;
		System.out.println(consNull.test(str));

		// Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
		Predicate<String> consEmpty = x -> x.isEmpty();
		System.out.println(consEmpty.test(str));

		// Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального интерфейса Predicate.
		System.out.println(consNull.and(consEmpty).test(str));

		// Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. 
		//Используем функциональный интерфейс Predicate.
		Predicate<String> startJ = q -> q.startsWith("J");
		Predicate<String> startN = q -> q.startsWith("N");
		Predicate<String> endA = q -> q.endsWith("A");

		System.out.println(startJ.or(startN).and(endA).test("NfgjfjghfjA"));

		// Написать лямбда выражение, которое принимает на вход объект типа HeavyBox 
		//и выводит на консоль сообщение “Отгрузили ящик с весом n”. “Отправляем 
		//ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen.

		HeavyBox heavyBox = new HeavyBox(1, 5, 7, 4);
		Consumer<HeavyBox> printHeavyBox = l -> System.out.println(l.toString("Отгрузили ящик с весом n));
		Consumer<HeavyBox> printHeavyBox2 = l -> System.out.println("Отправляем ящик с весом n");

		System.out.println(printHeavyBox.andThen(printHeavyBox2));
		
		//9.	Переделать класс использующий Printable используя ссылку на статический метод.
		
//		System.out.println(Math.abs(-1));
		Function <Double,Double> test = v -> Math.abs(v);
		System.out.println(test.apply(-1.0));
		
		Function <Double,Double> test1 = Math::abs;
		System.out.println(test1.apply(-120.0));
		
		
		

	}
}
