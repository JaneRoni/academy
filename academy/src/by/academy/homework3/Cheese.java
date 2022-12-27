package by.academy.homework3;

public class Cheese extends Product {
	private int old;

	public Cheese() {
		super();
	}

	public Cheese(String name, double quantity, double price) {
		super(name, quantity, price);
		this.old = old;
	}

	
	
	public int getOld() {
		return old;
	}
	
	public void setOld() {
		this.old = old;
	}

	@Override
	protected double getDiscount() {
		if (quantity > 5) {
			return 0.9;//10% от 5 штук
		}
		return 1;
	}
}
