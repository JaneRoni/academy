package by.academy.lesson14;

import java.util.ArrayList;

public class HeavyBoxDemo {

	public static void main (String [] args) {
		
		//�) ������� ������������ ������, ���������� ������� ������ HeavyBox. 
		//�) ����������� ��� ���������� ��������� for each. 
		//�) �������� ��� ������� ����� �� 1. 
		//�) ������� ��������� ����. 
		//�) �������� ������ ���������� ����� �� ��������� ����� ��������� � ������� �� �������. 
		//�) ������� ��� �����.
		
		ArrayList <HeavyBox> list = new ArrayList<>();
		
		HeavyBox hb1 = new HeavyBox(2,3,4,5);
		HeavyBox hb2 = new HeavyBox(1,3,4,5);
		HeavyBox hb3 = new HeavyBox(5,3,4,5);
		HeavyBox hb4 = new HeavyBox(8,3,4,5);
		
		
		list.add(hb1);
		list.add(hb2);
		list.add(hb3);
		list.add(hb4);
		
		for (HeavyBox p:list) {
			System.out.println(p);
		}
		
		
		System.out.println("0 " + list.get(0));
		//list.set(0, hb1.weight = 1);
		//list.set(0, hb4);
		 
	}

}
