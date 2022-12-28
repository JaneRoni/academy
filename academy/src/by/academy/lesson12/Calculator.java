package by.academy.lesson12;

//9.	Написать класс Калькулятор (необобщенный), который содержит обобщенные статические 
//методы - sum, multiply, divide, subtraction. Параметры этих методов  - два числа разного типа, 
//над которыми должна быть произведена операция.

public class Calculator {

	public static <T extends Number, V extends Number> double Sum(T a, V b) {
		return a.doubleValue() + b.doubleValue();
	}

	public static <T extends Number, V extends Number> double multiply(T a, V b) {
		return a.doubleValue() * b.doubleValue();
	}

	public static <T extends Number, V extends Number> double divide(T a, V b) {
		return a.doubleValue() / b.doubleValue();
	}

	public static <T extends Number, V extends Number> double subtraction(T a, V b) {
		return a.doubleValue() - b.doubleValue();
	}
}
