package by.academy.lesson16;

//8.	+Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.

public class Product implements Comparable<Product>{

	String name;

	public Product() {
		super();
	}

	public Product(String name) {
		this();
		this.name = name;
	}

//	Product toy = new Product("Машинка");

	@Override
	public int compareTo (Product o) {
		
		return name.compareTo(o.getName());
	}
	
	public final String getName() {
		return name;
	}
	
	

}
