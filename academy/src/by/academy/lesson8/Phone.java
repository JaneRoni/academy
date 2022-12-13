package by.academy.lesson8;

public class Phone {
	long number;
	String model;
	double weight;
	String name;

	public static void receiveCall(String name) {
		System.out.println("Звонит " + name);
	}

	public long getNumber() {
		return number;
	}

	public Phone(long number, String model, double weight) {
		this.number = number;
		this.model = model;
		this.weight = weight;
	}

	public Phone(long number, String model) {
		this.number = number;
		this.model = model;
	}

	public Phone() {
		super();
	}
}
