package by.academy.lesson15;

public class LinkedListCustom<T> {

	private Node head;
	private Node tail;
	private int size = 0;

	class Node {
		T value;
		Node prev;
		Node next;

		public Node(T value) {
			super();
			this.value = value;
		}
		
		public void add(T value) {
			Node newNode = new Node(value);
			if(head == null) {
				tail = newNode;
				head = newNode;
			}else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
			}
			size++;
		}
		
		public void print() {
			Node currentNode = head;
			while(currentNode !=null) {
				System.out.println(currentNode.value);
				currentNode = currentNode.next;
			}
		}
		
		
		
		public T get(int index) {//поиск элемента
			if (index >=size || index<0) {
				//error
			
				return null;
				}
			
			int counter = 0;
			Node currentNode = head;
			while(counter < index) {
				currentNode = currentNode.next;
				counter++;
		}
		return currentNode.value;
	}

}
