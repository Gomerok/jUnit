package by.academy.junit.homework7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathSqrtTest extends Assert {

	private int value;
	private int expected;

	public MathSqrtTest(int value, int expected) {
		this.value = value;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sqrtOf{0}={1}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 4, 2 }, { 9, 3 }, { 49, 7 }, { 25, 5 }, { 36, 6 } });
	}

	@Test
	public void testMathSqrt() {

		assertEquals(expected, Math.sqrt(value), 0);
	}
}
