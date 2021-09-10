package by.academy.junit.homework7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathMaxTest extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public MathMaxTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:maxOf({0}/{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 2, 1, 2 }, { 3, 1, 3 }, { 25, 5, 25 }, { 18, 2, 18 }, { 15, 0, 15 } });
	}

	@Test
	public void testMathMax() {
		assertEquals(expected, Math.max(valueA, valueB));
	}
}
