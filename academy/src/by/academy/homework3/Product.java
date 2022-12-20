package by.academy.homework3;

public class Product {
	String name;
	int quantity;
	double price;
	
	int discount = 0;
	
	public Product() {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	
	public double Discount() {
		if (quantity>=5) {
			discount = 1;
		}else if(quantity>5 && quantity>=10) {
			discount = 2;
		}else if(quantity>10) {
			discount = 3;
		}else{
			discount = 0;
		} 
		return 1;
	}
	
	public void CalcPrice() {
		quantity*price*Discount;
	}
	
	
	
	
}
