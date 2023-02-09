package test_final;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemoT3 {

	public static void main(String[] args) {
		List <String> arrayList0 = Arrays.asList("A", "B", "C", "D"); //закидываем строки через лист
		List <String> arrayList1 = Arrays.asList("2", "3", "8", "5"); //закидываем строки через лист
		List <String> arrayList2 = Arrays.asList("qw", "as", "zx", "bn"); //закидываем строки через лист
		
		System.out.println(arrayList0);
		System.out.println(arrayList1);
		System.out.println(arrayList2);
		
		ListIterator<String> listIterator0 = arrayList0.listIterator();
		ListIterator<String> listIterator1 = arrayList1.listIterator();
		ListIterator<String> listIterator2 = arrayList2.listIterator();
		
		System.out.println("Итератор по массиву строк");
		System.out.println("\nмассив 0");
		while (listIterator0.hasNext()) {
			String element = listIterator0.next();
			System.out.print(element + " ");
		}

		System.out.println("\nмассив 1");
		while (listIterator1.hasNext()) {
			String element = listIterator1.next();
			System.out.print(element + " ");
		}
		
		System.out.println("\nмассив 2");
		while (listIterator2.hasNext()) {
			String element = listIterator2.next();
			System.out.print(element + " ");
		}
		
		System.out.println("\nМассив из итераторов");
		
		List<ListIterator<String>> arrOfIterators = Arrays.asList(listIterator0, listIterator1, listIterator2);
		System.out.println(arrOfIterators);
		
		//@SuppressWarnings("unchecked")
//		SuperIteratorT3<String> superIterator = (SuperIteratorT3<String>) Arrays.asList(arrOfIterators);
		
		SuperIteratorT3<String> superIterator = new SuperIteratorT3<String>(arrOfIterators);
		System.out.println("\nСуперИтератор по массиву итераторов создан");
		
		System.out.println(superIterator.hasNext());
		
		while (superIterator.hasNext()) {
			System.out.println("\nработает суперитератор");
			String element = superIterator.next();
			System.out.print(element + " ");
		}
	}

}
