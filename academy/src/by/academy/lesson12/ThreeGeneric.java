package by.academy.lesson12;

import java.io.Serializable;

import by.academy.homework3.Product;

////6.	�) ������� ���������� ����� � ����� ����������� (T, V, K). 
//����� �������� ��� ���������� ���� (T, V, K), �����������, ����������� �� ���� ��������� ���� 
//(T, V, K), ������ ������������ �������� ���� ����������. ������� �����, ��������� �� ������� ����� ������� 
//��� ���� ���������� ������.
////�) �������� ����������� �� ��������� ����: T ������ ����������� ��������� Comparable 
//(������-��������, String), V ������ ����������� ��������� Serializable � ��������� ����� Animal, 
//K ������ ��������� ����� Number.

public class ThreeGeneric<T extends Comparable, V extends Product & Serializable, K extends Number> {

	private T t;
	private V v;
	private K k;

	public ThreeGeneric(T t, V v, K k) {
		super();
		this.k = k;
		this.t = t;
		this.v = v;
	}

	public T getT(T t) {
		return t;
	}

	public void setT() {
		this.t = t;
	}

	public V getV(V v) {
		return v;
	}

	public void setV() {
		this.v = v;
	}

	public K getK(K k) {
		return k;
	}

	public void setK() {
		this.k = k;
	}

	public void Name() {
		System.out.println(t.getClass());
		System.out.println(v.getClass());
		System.out.println(k.getClass());
	}
}
