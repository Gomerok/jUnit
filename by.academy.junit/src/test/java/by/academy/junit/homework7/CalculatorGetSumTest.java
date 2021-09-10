package by.academy.junit.homework7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(value = Parameterized.class)
public class CalculatorGetSumTest extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public CalculatorGetSumTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 3, 4 }, { 1, 1, 2 }, { 2, 6, 8 }, { 18, 2, 20 }, { 13, 15, 28 } });
	}

	@Test
	public void testGetSum() {
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}

}
