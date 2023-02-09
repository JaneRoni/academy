package test_final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Авиакомпания

//массив самолетов
//? обьекты в одном массиве разного типа или разные массивы по кат-ям самал

public class Airline {

	public String name;
	public List<AirplaneSuper> airplaneArrList = new ArrayList<AirplaneSuper>();

	public Airline(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void calculateTotalCapacity() {
		int totalCapacity = 0;
		int totalWeight = 0;
		for (int i = 0; i < airplaneArrList.size(); ++i) {
			totalCapacity += airplaneArrList.get(i).getCapacity();
			totalWeight += airplaneArrList.get(i).getWeight();
		}
		
		
	}

	public void addAirplaneSuper(AirplaneSuper airplaneSuper) {
		airplaneSuper.add(airplaneSuper);
	}

	public void sortAirplane() {
		Collections.sort(this.airplaneArrList, new AirplaneComparator());
	}
	
	
	public ArrayList<AirplaneSuper> filterAir(int min, int max, boolean showResult) {
		ArrayList<AirplaneSuper> filterList = new ArrayList<AirplaneSuper>();
		for (int i = 0; i < this.airplaneArrList.size(); ++i) {
			int planeConsumption = airplaneArrList.get(i).getFuelConsumption();
			if (planeConsumption >= min && planeConsumption <= max) {
				filterList.add(airplaneArrList.get(i));
			}
		}
		
		if (showResult == true) {
			showAircraftList(filterList);
		}
		
		return filterList;
	}

//	public static void main(String[] args) {

//		Object[] airplaneArr = new Object[7];

//		MilitaryAircraft military1 = new MilitaryAircraft(11.49, 00.00, 10290, 2000, 960);
//		
//		System.out.println(military1.length);//+
//		
//		MilitaryAircraft military2 = new MilitaryAircraft(11.49, 00.00, 10290, 2000, 960);
//		MilitaryAircraft military3 = new MilitaryAircraft(11.49, 00.00, 10290, 2000, 960);
//
//		CivilAircraft civil1 = new CivilAircraft(11.49, 00.00, 10290, 2000, 960);
//		CivilAircraft civil2 = new CivilAircraft(11.49, 00.00, 10290, 2000, 960);
//		CivilAircraft civil3 = new CivilAircraft(11.49, 00.00, 10290, 2000, 960);
//
//		TrainingAircraft training1 = new TrainingAircraft(11.49, 00.00, 10290, 2000, 960);

//		airplaneArrList.add(military1);
//		airplaneArrList.add(military2);
//		airplaneArrList.add(military3);
//		airplaneArrList.add(civil1);
//		airplaneArrList.add(civil2);
//		airplaneArrList.add(civil3);
//		airplaneArrList.add(training1);
//
//		System.out.println(airplaneArrList.get(0).length);
//		System.out.println(Arrays.toString(airplaneArr));

////		System.out.println(airplaneArr[0]);
//		airplaneArr[0] = military1;
////		System.out.println(airplaneArr[0]);
//		airplaneArr[1] = military2;
//		airplaneArr[2] = military3;
//		airplaneArr[3] = civil1;
//		airplaneArr[4] = civil1;
//		airplaneArr[5] = civil1;
//		airplaneArr[6] = training1;

//		System.out.println(Arrays.toString(airplaneArr));
//		System.out.println(airplaneArr);
//		System.out.println(airplaneArr[0]);

//		public interface Product {/* ... */}
//		public class Picture implements Product { /* ... */ }
//		public class Shoe implements Product { /* ... */ }
//		public class Book implements Product { /* ... */ }
//		public class Toy implements Product { /* ... */ }
//
//		List< Product > products = new ArrayList< Product >();
//
//		products.add(new Picture());
//		products.add(new Shoe());
//		products.add(new Book());
//		products.add(new Toy());

//		Picture picture = new Picture();
//		Shoe shoe = new Shoe();
//		Book book = new Book();
//		Toy toy = new Toy();
//		Product[] products = new Product[]{picture, shoe, book, toy};

//		AirplaneSuper [] airplaneArrList1 = new AirplaneSuper[] {military2,civil1};
//		
//		System.out.println(airplaneArrList1);
//		System.out.println(airplaneArrList1[0].length);

//	}
}
