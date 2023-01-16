package by.academy.homework5;

//import java.util.Arrays;

public class CatchTask6 {
	public static void main(String[] args) {

		try {
			int[] task6 = new int[8];
//			System.out.println(Arrays.toString(task6));
			task6[0] = 1;
			task6[1] = 1;
			task6[2] = 1;
			task6[3] = 1;
			task6[4] = 1;
			task6[5] = 1;
			task6[6] = 1;
			task6[7] = 1;
			task6[8] = 1;
			task6[9] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array. " + e);
		}
	}
}
