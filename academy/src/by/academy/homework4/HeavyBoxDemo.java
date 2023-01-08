package by.academy.homework4;

import java.util.ArrayList;

public class HeavyBoxDemo {

	public static void main(String[] args) {

		ArrayList<HeavyBox> list = new ArrayList<>();

		HeavyBox hb1 = new HeavyBox(2, 3, 4, 5);
		HeavyBox hb2 = new HeavyBox(1, 3, 4, 5);
		HeavyBox hb3 = new HeavyBox(5, 3, 4, 5);
		HeavyBox hb4 = new HeavyBox(8, 3, 4, 5);

		list.add(hb1);
		list.add(hb2);
		list.add(hb3);
		list.add(hb4);

		for (HeavyBox p : list) {
			System.out.println(p);
		}

	}

}
