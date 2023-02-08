package junit;

import java.util.Arrays;

import org.junit.Assert;

public class CalculatorTest1 extends Assert{
	
	private int valueA;
	private int valueB;
	private int expected;
	
	
	public CalculatorTest1(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}
	
	@Parameterized.Parameters(name="{index}: sum{0} and {1}={2}")
	public static Iterable<Integer[]> dataForTest(){
		return Arrays.asList(
				new Integer[][] {
					{1,2,3},
					{1,3,3},
					{2,6,8},
					{18,2,20},
					{13,15,28},
					{1,5,6}});
	}
	
	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}

}
