package test_final;

public class AirlineDemo {
	
	public static void main(String[] args) {
		
	MilitaryAircraft military1 = new MilitaryAircraft(null, 11.49, 00.00, 10290, 2000, 960);
		
//		System.out.println(military1.length);//+
		
		MilitaryAircraft military2 = new MilitaryAircraft(null, 11.49, 00.00, 10290, 2000, 960);
		MilitaryAircraft military3 = new MilitaryAircraft(null, 11.49, 00.00, 10290, 2000, 960);

		CivilAircraft civil1 = new CivilAircraft(null, 11.49, 00.00, 10290, 2000, 960);
		CivilAircraft civil2 = new CivilAircraft(null, 11.49, 00.00, 10290, 2000, 960);
		CivilAircraft civil3 = new CivilAircraft(null, 11.49, 00.00, 10290, 2000, 960);

		TrainingAircraft training1 = new TrainingAircraft(null, 11.49, 00.00, 10290, 2000, 960);
		
		Airline airline1 = new Airline("airline1");
		
		airline1.addAirplaneSuper(military1);
		airline1.addAirplaneSuper(military2);
		airline1.addAirplaneSuper(military3);
		airline1.addAirplaneSuper(civil1);
		airline1.addAirplaneSuper(civil2);
		airline1.addAirplaneSuper(civil3);
		airline1.addAirplaneSuper(training1);
		
		System.out.println(airline1.airplaneArrList);
		
		airline1.sortAirplane();
		System.out.println(airline1.airplaneArrList);
		
//
//		ukraineInternationalAirline.filterAircraftsByFuelConsumption(2000, 3000, true);
//		System.out.println();
//		
//		ukraineInternationalAirline.calculateTotalCargoPassengerCapacity();
		
	}

}
