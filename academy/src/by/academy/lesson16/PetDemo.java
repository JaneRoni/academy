package by.academy.lesson16;

import java.util.HashMap;
import java.util.Map;

//10.+	Создайте класс Pet и его наследников Cat, Dog, Parrot. 
//Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, 
//а в качестве значения класс Pet. Добавьте в отображение разных животных. 
//Создайте метод выводящий на консоль все ключи отображения.

public class PetDemo {
	
	public static void main(String... args) {

		Map<String, Pet> map = new HashMap<>();
		Cat cat = new Cat("Васька");
//		map.put(new Cat("Васька"), "cat");
		
		map.put("Васька", cat);
		
		System.out.println(cat);
		
	}
		
		public static void printKey(Map<String, Pet> map) {//vozvrat kluch
			for (String key : map.keySet()) {
				System.out.println(key);
			}
		}
		
		
		
	}


