package by.academy.lesson16;

import java.util.HashMap;
import java.util.Map;

//10.+	�������� ����� Pet � ��� ����������� Cat, Dog, Parrot. 
//�������� ����������� �� �������� ��������, ��� � �������� ����� ��������� ��� ���������, 
//� � �������� �������� ����� Pet. �������� � ����������� ������ ��������. 
//�������� ����� ��������� �� ������� ��� ����� �����������.

public class PetDemo {
	
	public static void main(String... args) {

		Map<String, Pet> map = new HashMap<>();
		Cat cat = new Cat("������");
//		map.put(new Cat("������"), "cat");
		
		map.put("������", cat);
		
		System.out.println(cat);
		
	}
		
		public static void printKey(Map<String, Pet> map) {//vozvrat kluch
			for (String key : map.keySet()) {
				System.out.println(key);
			}
		}
		
		
		
	}


