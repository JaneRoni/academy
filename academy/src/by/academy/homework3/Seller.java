package by.academy.homework3;

public class Seller extends Person {

	public Seller() {
		super();
	}

	public Seller(String name, double money) {
		this();
		this.money = money;
		this.name = name;
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
	public double getMoney() {
		return money;
	}

	@Override
	public void setMoney() {
		this.money = money;
	}

}
