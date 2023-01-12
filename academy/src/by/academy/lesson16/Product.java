package by.academy.lesson16;

//8.	+�������� HashMap, ���������� ���� ��������  - ��� ������� � ������ ������� (����� Product).
//��������� � ����������� ���� �������� - entrySet().
//��������� � ����������� ����� �� ���� ���������  - keySet().
//��������� � ����������� �������� ��������� - values().
//��� ������� �������� ������� ���� �����.

public class Product implements Comparable<Product>{

	String name;

	public Product() {
		super();
	}

	public Product(String name) {
		this();
		this.name = name;
	}

//	Product toy = new Product("�������");

	@Override
	public int compareTo (Product o) {
		
		return name.compareTo(o.getName());
	}
	
	public final String getName() {
		return name;
	}
	
	

}
