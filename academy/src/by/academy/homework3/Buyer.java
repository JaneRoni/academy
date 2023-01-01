package by.academy.homework3;

public class Buyer extends Person {

	protected String phone;
	protected String email;
	protected String dateOfBirth;

	public Buyer() {
		super();
	}

	public Buyer(String name, double money, String phone, String email) {
		this();
		this.money = money;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public Buyer(String dateOfBirth) {
		this();
		this.dateOfBirth = dateOfBirth;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone() {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		this.email = email;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth() {
		this.dateOfBirth = dateOfBirth;
	}

}
