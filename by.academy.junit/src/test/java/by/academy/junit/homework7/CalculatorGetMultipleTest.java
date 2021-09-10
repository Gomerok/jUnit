package by.academy.junit.homework7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(value = Parameterized.class)
public class CalculatorGetMultipleTest extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public CalculatorGetMultipleTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:multOf({0}*{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 1 }, { 2, 2, 4 }, { 3, 3, 9 }, { 4, 4, 16 }, { 11, 11, 121 } });
	}

	@Test
	public void testGetDivide() {
		assertEquals(expected, Calculator.getMultiple(valueA, valueB));
	}

}
