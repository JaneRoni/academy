package by.academy.homework3;

public abstract class Product {

	protected String name;
	protected double quantity;
	protected double price;

	public Product() {
		super();
	}

	public Product(String name, double quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity() {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice() {
		this.price = price;
	}

	protected abstract double getDiscount();

	protected abstract double getCalcPrice();

}
