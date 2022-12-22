package by.academy.homework3;

public class Bread extends Product {
	
	public Bread () {
		super();
	}
	
	public Bread(String name, double quantity, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	protected double getDiscount() {
		
		return 1;
	}
	
	public double CalcPrice() {
		return quantity * price * getDiscount();
	}

}
