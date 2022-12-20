package by.academy.lesson9;

public class Product {

	public double price;
	public String name;
	public double quantity;

	public Product() {
		super();
	}

	public Product(double price, String name, double quantity) {
		this();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double calcPrice() {
		return (price * quantity);
	}

	public double discont() {

		return 1;
	}
}
