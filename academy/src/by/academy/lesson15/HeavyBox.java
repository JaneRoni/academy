package by.academy.lesson15;

import by.academy.lesson15.LinkedListCustom.Node;

//public class TreeSet {
//	
//	private Node head;
//	private Node tail;
//	public int size = 0;
//	
////	3.	Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable. 
////	Распечатать содержимое с помощью for each.
//	
	public class HeavyBox implements Comparable<HeavyBox>{
		
		int weight;
		int width;
		int height;
		int depth;

		HeavyBox (int w, int h, int d, int m){
			width = w;
			height = h;
			depth = d;
			weight = m;
		}
		


		@Override
		public int compareTo(HeavyBox ob) {
//			weight.compareTo
			return this.height+o.;
		}
		
//	}

//	public void add(int weight) {
//		Node newNode = new Node(weight);
//		if (head == null) {
//			tail = newNode;
//			head = newNode;
//		} else {
//			tail.next = newNode;
//			newNode.prev = tail;
//			tail = newNode;
//		}
//		size++;
	}
		
//	}	
//}
