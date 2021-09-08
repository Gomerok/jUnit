package by.academy.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathTest1 extends Assert {

	private int valueA;
	private int expected;

	public MathTest1(int valueA, int expected) {
		this.valueA = valueA;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sqrtOf({0}/{1})={1}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 2, 4 }, { 9, 3 }, { 16, 4 }, { 25, 5 }, { 36, 6 }, { 49, 7 } });
	}

	@Test
	public void testMathSqrt() {
		assertEquals(expected, Math.sqrt(valueA));
	}

}
