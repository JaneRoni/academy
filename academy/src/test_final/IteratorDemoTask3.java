package test_final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorDemoTask3 {

	public static void main(String[] args) {
		
		List<String> arrayList0 = new ArrayList<>();
		arrayList0.add("C");
		arrayList0.add("A");
		arrayList0.add("E");
		arrayList0.add("E");
		
		
		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("C");
		arrayList1.add("A");
		arrayList1.add("E");
		arrayList1.add("E");
		
		List<String> arrayList2 = new ArrayList<>();
		arrayList2.add("C");
		arrayList2.add("A");
		arrayList2.add("E");
		arrayList1.add("E");
		
		CustomIteratorTask3<String> iterator0 = (CustomIteratorTask3<String>) arrayList0.iterator();
		CustomIteratorTask3<String> iterator1 = (CustomIteratorTask3<String>) arrayList1.iterator();
		CustomIteratorTask3<String> iterator2 = (CustomIteratorTask3<String>) arrayList2.iterator();
		
		while (iterator0.hasNext()) {
			String element = iterator0.next();
			System.out.print(element + " ");
		}
		
//		//создаем массив итераторов, длина массива число с клав
//				CustomIteratorTask3 [] arrOfIterators = new CustomIteratorTask3[3];
//		
//		//генерім случ чісла
////		for, array1 -i
//		
//		//создаем массивы (генерим) случ числа на введенное колич-во итер-ов
//		Integer[] array0 = {  0, 2, 4 };
//		System.out.println(Arrays.toString(array0));
//		Integer[] array1 = {  3, 4, 5 };
//		System.out.println(Arrays.toString(array1));
//		Integer[] array2 = {  1, 7, 8 };
//		System.out.println(Arrays.toString(array2));
//		
//		
////		//созд-ем итераторы на основании массивов
////		CustomIteratorTask3 iterator0 = new CustomIteratorTask3(array0);
//////		System.out.println(Arrays.toString(iterator0));
////		CustomIteratorTask3 iterator1 = new CustomIteratorTask3(array1);
////		CustomIteratorTask3 iterator2 = new CustomIteratorTask3(array2);
//		
////		CustomIteratorTask3 [] arrOfItAdd = new CustomIteratorTask3[3];
//		
//		String addItter = "iterator0"+","+"iterator1"+","+"iterator2"+",";
//		
//		//создаем массив итераторов, длина массива число с клав
//		CustomIteratorTask3 [] arrOfIterators = new CustomIteratorTask3[3];
////		CustomIteratorTask3 [] arrOfIterators = {addItter};
//		
////		for(int i=0;i<arrOfIterators.length;i++) {
//////			arrOfIterators.
//////			arrOfIterators[i]=iterator0;
////			String arrayName = "array" + i;
////			arrOfIterators[i]=new CustomIteratorTask3(array0);
////			
////			arrOfIterators[i]=iterator1;
////			arrOfIterators[i]=iterator2;
////			
////		}
//		arrOfIterators.
////		arrOfIterators[0]=new CustomIteratorTask3("iterator0",array0);
//		
////		if(iterator0.hasNext()) {
////		System.out.println("+");
////	}
//		
//		arrOfIterators[1]=new CustomIteratorTask3("iterator1",array1);
//		arrOfIterators[2]=new CustomIteratorTask3("iterator2",array2);
//		
//		System.out.println(arrOfIterators[0]);
//		System.out.println(Arrays.toString(arrOfIterators));
//		
////		if(iterator0.hasNext()) {
////			System.out.println("+");
////		}
//		
//		//создаем супер-итератор, принимает массив из итераторов
//		SuperIteratorT3<CustomIteratorTask3> superIterator = new SuperIteratorT3<CustomIteratorTask3>(arrOfIterators);
//		System.out.println("создан суперитератор");
//		
//		if(superIterator.hasNext()) {
//			System.out.println("+");
//		}
//		
////		for (int i=0;i<arrOfIterators.length;i++) {
////			String numberItConstr = "iterator"+i;
////			arrOfIterators[i] = ("iterator"+i);
//////					numberItConstr;
////			
////		}
//		int count = 0;
//		while(superIterator.hasNext()) {
//			System.out.println("в суперитераторе");
//			Object s = superIterator.next();
//			
////			arrOfIterators[count] = Object s;
//			
////			System.out.println(Arrays.toString(s));
//			System.out.println(s);
//			count++;
//		}
//		
//
//
//		while(superIterator.hasNext()) {
//			Object s = superIterator.next();
////			System.out.println(Arrays.toString(s));
//			System.out.println(s);
//		}
//		
	}
	
	//генерім случ чісла

}
