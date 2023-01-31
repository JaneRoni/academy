package by.academy.lesson21;

public class Cat {

	public String name;
	private int old;
	protected String breed;

	public Cat() {
		super();
	}

	public Cat(String name, int old, String breed) {
		this();
		this.old = old;
		this.breed = breed;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getOld() {
		return old;
	}

	public String getBreed() {
		return breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void sleep() {
		System.out.println("ZZZ, zzz");
	}

	protected void eat() {
		System.out.println("mmm...");
	}

	private void awake() {
		System.out.println("hello, new day!");
	}

}
