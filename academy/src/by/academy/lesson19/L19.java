package by.academy.lesson19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import by.academy.lesson14.HeavyBox;

//1.	Ќаписать л€мбда выражение дл€ интерфейса Printable, который содержит один метод void print().
//2.	—оздать л€мбда выражение, которое возвращает значение true, если строка не null, использу€ функциональный интерфейс Predicate.
//3.	—оздать л€мбда выражение, которое провер€ет, что строка не пуста, использу€ функциональный интерфейс Predicate.
//4.	Ќаписать программу провер€ющую, что строка не null и не пуста, использу€ метод and() функционального интерфейса Predicate.
//5.	Ќаписать программу, котора€ провер€ет, что строка начинаетс€ буквой УJФили УNФ и заканчиваетс€ УAФ. »спользуем функциональный интерфейс Predicate.
//6.	Ќаписать л€мбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение Уќтгрузили €щик с весом nФ.
//Уќтправл€ем €щик с весом nФ »спользуем функциональный интерфейс Consumer и метод по умолчанию andThen.

public class L19 {

	public static void main(String... args) {
//		p -> System.out.println("hello");
//		Printable p1 = p -> p.print();

		// 1. Ќаписать л€мбда выражение дл€ интерфейса Printable, который содержит один
		// метод void print().
		Printable p1 = () -> System.out.println("hello");
		p1.print();

		// 2. —оздать л€мбда выражение, которое возвращает значение true, если строка не
		// null, использу€ функциональный интерфейс Predicate.
		String str = "—оздать л€мбда выражение, которое возвращает значение true, если строка не null, использу€ функциональный интерфейс Predicate.";
		Predicate<String> consNull = s -> s != null;
		System.out.println(consNull.test(str));

		// 3. —оздать л€мбда выражение, которое провер€ет, что строка не пуста,
		// использу€ функциональный интерфейс Predicate.
		Predicate<String> consEmpty = x -> x.isEmpty();
		System.out.println(consEmpty.test(str));

		// 4. Ќаписать программу провер€ющую, что строка не null и не пуста, использу€
		// метод and() функционального интерфейса Predicate.
		System.out.println(consNull.and(consEmpty).test(str));

		// 5. Ќаписать программу, котора€ провер€ет, что строка начинаетс€ буквой УJФили
		// УNФ и заканчиваетс€ УAФ. »спользуем функциональный интерфейс Predicate.

		Predicate<String> startJ = q -> q.startsWith("J");
		Predicate<String> startN = q -> q.startsWith("N");
		Predicate<String> endA = q -> q.endsWith("A");

		System.out.println(startJ.or(startN).and(endA).test("NfgjfjghfjA"));

		// 6. Ќаписать л€мбда выражение, которое принимает на вход объект типа HeavyBox
		// и выводит на консоль сообщение Уќтгрузили €щик с весом nФ.
		// Уќтправл€ем €щик с весом nФ »спользуем функциональный интерфейс Consumer и
		// метод по умолчанию andThen.

		HeavyBox heavyBox = new HeavyBox(1, 5, 7, 4);
		Consumer<HeavyBox> printHeavyBox = l -> System.out.println(l.toString("ќтгрузили €щик с весом n"));
		Consumer<HeavyBox> printHeavyBox2 = l -> System.out.println("ќтправл€ем €щик с весом n");

		System.out.println(printHeavyBox.andThen(printHeavyBox2));
		
		//9.	ѕеределать класс использующий Printable использу€ ссылку на статический метод.
		
//		System.out.println(Math.abs(-1));
		Function <Double,Double> test = v -> Math.abs(v);
		System.out.println(test.apply(-1.0));
		
		Function <Double,Double> test1 = Math::abs;
		System.out.println(test1.apply(-120.0));
		
		
		

	}
}
