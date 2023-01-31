package by.academy.lesson21;

public class Tiger extends Cat{
	
	public String type;
	private String food;
	protected String region;
	
	public Tiger() {
		super();
	}
	
	public Tiger(String type,String food, String region) {
		this();
		this.type = type;
		this.food = food;
		this.region = region;
	}
	
	public String getType() {
		return type;
	}
	
	public String getFood() {
		return food;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void sleep2() {
		System.out.println("ZZZ, zzz");
	}

	protected void eat2() {
		System.out.println("mmm...");
	}

	private void awake2() {
		System.out.println("hello, new day!");
	}
	

}
