package by.academy.junit.homework7.listener;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import by.academy.junit.Calculator;

@RunWith(TestRunner.class)
public class CalculatorTest extends Assert {

	@Test
	public void testGetSum() throws Exception {
		assertEquals(14, Calculator.getSum(7, 8));
	}

	@Test
	public void testGetDivide() throws Exception {
		assertEquals(20, Calculator.getDivide(100, 5));
	}

	@Test
	public void testFail() {
		fail();
	}

	@Test
	public void testGetMultiple() throws Exception {

	}

	@Test(expected = ArithmeticException.class)
	public void divisionWithException() {
		Calculator.getDivide(15, 0);
	}

}