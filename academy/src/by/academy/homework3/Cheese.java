package by.academy.homework3;

public class Cheese extends Product {
	private int age;

	public Cheese() {
		super();
	}

	public Cheese(String name, double quantity, double price, int age) {
		super(name, quantity, price);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		this.age = age;
	}

	
	@Override
	protected double getDiscount() {
		if (quantity > 5) {
			return 0.9;// 10% от 5 штук
		}
		return 1;
	}

	@Override
	protected double getCalcPrice() {
		return quantity * price * getDiscount();
	}
	
	
}
