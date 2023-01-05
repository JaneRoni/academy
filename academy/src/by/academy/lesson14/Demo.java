package by.academy.lesson14;

public class Demo {
	
	public static void main (String [] args) {
		main<String> list = new main<>();
		list.print();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.remove("Test3");
		list.print();
	}

}
