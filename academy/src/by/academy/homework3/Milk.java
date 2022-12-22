package by.academy.homework3;

public class Milk extends Product {
	
	public Milk () {
		super();
	}
	
	public Milk(String name, double quantity, double price) {
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
