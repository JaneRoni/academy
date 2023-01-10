package by.academy.lesson15;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String []args) {
		TreeSet<HeavyBox> treeset = new TreeSet();
	
		treeset.add(new HeavyBox(2,3,5,6));
		treeset.add(new HeavyBox(2,4,5,6));
		treeset.add(new HeavyBox(8,3,6,6));
		treeset.add(new HeavyBox(2,4,5,7));
	}

}
