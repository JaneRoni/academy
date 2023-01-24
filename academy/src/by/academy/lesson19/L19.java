package by.academy.lesson19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import by.academy.lesson14.HeavyBox;

//1.	�������� ������ ��������� ��� ���������� Printable, ������� �������� ���� ����� void print().
//2.	������� ������ ���������, ������� ���������� �������� true, ���� ������ �� null, ��������� �������������� ��������� Predicate.
//3.	������� ������ ���������, ������� ���������, ��� ������ �� �����, ��������� �������������� ��������� Predicate.
//4.	�������� ��������� �����������, ��� ������ �� null � �� �����, ��������� ����� and() ��������������� ���������� Predicate.
//5.	�������� ���������, ������� ���������, ��� ������ ���������� ������ �J���� �N� � ������������� �A�. ���������� �������������� ��������� Predicate.
//6.	�������� ������ ���������, ������� ��������� �� ���� ������ ���� HeavyBox � ������� �� ������� ��������� ���������� ���� � ����� n�.
//����������� ���� � ����� n� ���������� �������������� ��������� Consumer � ����� �� ��������� andThen.

public class L19 {

	public static void main(String... args) {
//		p -> System.out.println("hello");
//		Printable p1 = p -> p.print();

		// 1. �������� ������ ��������� ��� ���������� Printable, ������� �������� ����
		// ����� void print().
		Printable p1 = () -> System.out.println("hello");
		p1.print();

		// 2. ������� ������ ���������, ������� ���������� �������� true, ���� ������ ��
		// null, ��������� �������������� ��������� Predicate.
		String str = "������� ������ ���������, ������� ���������� �������� true, ���� ������ �� null, ��������� �������������� ��������� Predicate.";
		Predicate<String> consNull = s -> s != null;
		System.out.println(consNull.test(str));

		// 3. ������� ������ ���������, ������� ���������, ��� ������ �� �����,
		// ��������� �������������� ��������� Predicate.
		Predicate<String> consEmpty = x -> x.isEmpty();
		System.out.println(consEmpty.test(str));

		// 4. �������� ��������� �����������, ��� ������ �� null � �� �����, ���������
		// ����� and() ��������������� ���������� Predicate.
		System.out.println(consNull.and(consEmpty).test(str));

		// 5. �������� ���������, ������� ���������, ��� ������ ���������� ������ �J����
		// �N� � ������������� �A�. ���������� �������������� ��������� Predicate.

		Predicate<String> startJ = q -> q.startsWith("J");
		Predicate<String> startN = q -> q.startsWith("N");
		Predicate<String> endA = q -> q.endsWith("A");

		System.out.println(startJ.or(startN).and(endA).test("NfgjfjghfjA"));

		// 6. �������� ������ ���������, ������� ��������� �� ���� ������ ���� HeavyBox
		// � ������� �� ������� ��������� ���������� ���� � ����� n�.
		// ����������� ���� � ����� n� ���������� �������������� ��������� Consumer �
		// ����� �� ��������� andThen.

		HeavyBox heavyBox = new HeavyBox(1, 5, 7, 4);
		Consumer<HeavyBox> printHeavyBox = l -> System.out.println(l.toString("��������� ���� � ����� n"));
		Consumer<HeavyBox> printHeavyBox2 = l -> System.out.println("���������� ���� � ����� n");

		System.out.println(printHeavyBox.andThen(printHeavyBox2));
		
		//9.	���������� ����� ������������ Printable ��������� ������ �� ����������� �����.
		
//		System.out.println(Math.abs(-1));
		Function <Double,Double> test = v -> Math.abs(v);
		System.out.println(test.apply(-1.0));
		
		Function <Double,Double> test1 = Math::abs;
		System.out.println(test1.apply(-120.0));
		
		
		

	}
}
