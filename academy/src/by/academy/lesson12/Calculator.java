package by.academy.lesson12;

//9.	�������� ����� ����������� (������������), ������� �������� ���������� ����������� 
//������ - sum, multiply, divide, subtraction. ��������� ���� �������  - ��� ����� ������� ����, 
//��� �������� ������ ���� ����������� ��������.

public class Calculator {
	
	
	
	public static <T extends Number,V extends Number> double Sum(T a, V b) {
		return a.doubleValue()+b.doubleValue();
	}
	
	public static <T extends Number,V extends Number> double multiply(T a, V b) {
		return a.doubleValue()*b.doubleValue();
	}

	public static <T extends Number,V extends Number> double divide(T a, V b) {
		return a.doubleValue()/b.doubleValue();
	}
	
	public static <T extends Number,V extends Number> double subtraction(T a, V b) {
		return a.doubleValue()-b.doubleValue();
	}
}
