package by.academy.homework3;

public abstract class Person {
	protected String name;
	protected double money;

	public Person() {
		super();
	}

	public Person(String name, double money) {
		this();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney() {
		this.money = money;
	}
}
