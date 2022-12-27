package by.academy.homework3;

public abstract class Product {

	protected String name;
	protected double quantity;
	protected double price;
	protected double discount = 0;

	
	//конструкторы
	public Product() {
		super();
	}

	public Product(String name, double quantity, double price,int discount) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}

	//get-set
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
	
	
	protected double getDiscount() { //возрат скидки
		return 1;
	}

	public double CalcPrice() {
		return quantity * price * getDiscount();
	}

	String Product[] = new String[5];

}
