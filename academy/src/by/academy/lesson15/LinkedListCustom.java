package by.academy.lesson15;

public class LinkedListCustom<T> {

	private Node head;
	private Node tail;
	public int size = 0;

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
			if (head == null) {
				tail = newNode;
				head = newNode;
			} else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
			}
			size++;
		}

		public void print() {
			Node currentNode = head;
			while (currentNode != null) {
				System.out.println(currentNode.value);
				currentNode = currentNode.next;
			}
		}

		public T get(int index) {// "search element"
			if (index >= size || index < 0) {
				// error

				return null;
			}

			int counter = 0;
			Node currentNode = head;
			while (counter < index) {
				currentNode = currentNode.next;
				counter++;
			}
			return currentNode.value;
		}

		
		
		private Node getNote(int index) {// "search node"
			if (index >= size || index < 0) {
				// error
				return null;
			}

			int counter = 0;
			Node currentNode = head;
			while (counter < index) {
				currentNode = currentNode.next;
				counter++;
			}
			return currentNode;
		}
		
		
		
		Node newNode = new Node(value); 
			if (index ==0) {
				newNode.prev = head;
				head.prev = newNode;
				head = newNode;
				size++;
				return;
			}
			
			if (index ==size) {
				newNode.prev = tail;
				tail.prev = newNode;
				tail = newNode;
				size++;
				return;
			}
		
		
		
		Node nextNode = getNode(index);
		Node prevNode = nextNode.prev;
		
		prevNode.next = newNode;
		prevNode.prev = newNode;
		
	}
}
