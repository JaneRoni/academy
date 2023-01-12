package by.academy.lesson16;

public class Cat extends Pet{
	
String name;
	
	public Cat() {
		super();
	}
	
	public Cat(String name) {
		this();
		this.name = name;
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	void setName(String name) {
		this.name = name;
	
	}
	
} 