package test_final;

import java.util.Comparator;

public class AirplaneComparator implements Comparator<AirplaneSuper> {

	@Override
	public int compare(AirplaneSuper o1, AirplaneSuper o2) {
		// TODO Auto-generated method stub
		return Integer(o1.getDistance()).compareTo(o2.getDistance());
	}


}
