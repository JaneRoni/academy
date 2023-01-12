package by.academy.lesson16;

//10.+	�������� ����� Pet � ��� ����������� Cat, Dog, Parrot. 
//�������� ����������� �� �������� ��������, ��� � �������� ����� ��������� ��� ���������, 
//� � �������� �������� ����� Pet. �������� � ����������� ������ ��������. 
//�������� ����� ��������� �� ������� ��� ����� �����������.

public abstract class Pet {
	
	String name;
	
	public Pet() {
		super();
	}
	
	public Pet(String name) {
		this();
		this.name = name;
	}
	
	abstract String getName();
	
	abstract void setName(String name);
	

}


