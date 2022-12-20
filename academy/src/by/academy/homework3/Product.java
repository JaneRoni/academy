package by.academy.homework3;

public abstract class Product {
	
	protected String name;
	protected double quantity;
	protected double price;
	
	int discount = 0;
	
//	public Product() {
//		super();
//	}
	
	public Product(String name, double quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	
	protected abstract double getDiscount();
	
	
	
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

	public void CalcPrice() {
		return quantity*price*getDiscount;
	}
	
	
	
	
}
