package by.academy.lesson16;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//8.	Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.

public class ProductDemo {
	public static void main(String... args) {

		Map<String, Product> map = new HashMap<>();
		Product toy = new Product("�������");
		Product box = new Product("�����");

		map.put("�������", toy);
		map.put("�����", box);

//		System.out.println(map);
//		System.out.println(map.get(toy));

	}

//	public static void printSet(Map<String, Product> map) {// vozvrat pary kluch, znachenie
//		for (String value : map.entrySet()) {
//			System.out.println(value);
//		}
//	}

	public void printKey(Map<String, Product> map) {// vozvrat kluch
		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}

	public void printValue(Map<String, Product> map) {// vozvrat znachenie
		for (Product value : map.values()) {
			System.out.println(value);
		}
	}

}
