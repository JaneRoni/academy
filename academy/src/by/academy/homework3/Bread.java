package by.academy.homework3;

public class Bread extends Product {

	public Bread() {
		super();
	}

	public Bread(String name, double quantity, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public double getDiscount() {
		if (quantity > 3) {
			return 0.99;
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

	@Override
	public double getQuantity() {
		return quantity;
	}

	@Override
	public void setQuantity() {
		this.quantity = quantity;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice() {
		this.price = price;
	}

	Bread bread[] = new Bread[10];

//	public Bread[] getField() {
//		return null;
//	}

}
