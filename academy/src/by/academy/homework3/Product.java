package by.academy.homework3;

public abstract class Product {

	protected String name;
	protected double quantity;
	protected double price;

	int discount = 0;

	public Product() {
		super();
	}

	public Product(String name, double quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	protected double getDiscount() {
		return 1;
	}

//	{
//		if (quantity>=5) {
//			return discount = 1;
//		}else if(quantity>5 && quantity>=10) {
//			discount = 2;
//		}else if(quantity>10) {
//			discount = 3;
//		}else{
//			discount = 0;
//		} 
//		return 1;
//	}

	public double CalcPrice() {
		return quantity * price * getDiscount();
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

}
