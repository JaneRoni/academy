package by.academy.lesson16;

//10.+	Создайте класс Pet и его наследников Cat, Dog, Parrot. 
//Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, 
//а в качестве значения класс Pet. Добавьте в отображение разных животных. 
//Создайте метод выводящий на консоль все ключи отображения.

public abstract class Pet {
	
	String name;
	
	public Pet() {
		super();
	}
	
	public Pet(String name) {
		this();
		this.name = name;
	}
	
	abstract String getName();
	
	abstract void setName(String name);
	

}


