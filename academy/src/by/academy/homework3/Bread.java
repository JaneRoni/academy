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
	
	@Override
	public double getDiscount() {
		if (quantity>3) {
			return 0.99;
		}
		return 1;
	}
	

	@Override
	protected double getCalcPrice() {
		return quantity * price * getDiscount();
	}
	
//	public static void main(String ...args) {
//	Bread bread[] = new Bread[5]; 
//	bread[0]="Бородинский";
//	bread[1]="Столичный";
//	bread[2]="Венский";
//	bread[3]="Восточный";
//	bread[4]="Купеческий";
	
	
//	}

}
