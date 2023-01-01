package by.academy.homework3;

public class Milk extends Product {

	public Milk() {
		super();
	}

	public Milk(String name, double quantity, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	protected double getDiscount() {
		if (quantity > 10) {
			return 0.95;
		}
		return 1;
	}

	@Override
	protected double getCalcPrice() {
		return quantity * price * getDiscount();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName() {
		this.name = name;
	}

}
