package by.academy.junit.homework7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(value = Parameterized.class)
public class CalculatorGetDivideTest extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public CalculatorGetDivideTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:divOf({0}/{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 1 }, { 3, 1, 3 }, { 25, 5, 5 }, { 18, 2, 9 }, { 15, 15, 1 } });
	}

	@Test
	public void testGetDivide() throws Exception {
		assertEquals(expected, Calculator.getDivide(valueA, valueB));
	}

}
