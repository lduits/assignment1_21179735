package test.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		int a = 5;
		int b = 4;
		int actual = calculator.add(a, b);
		int expected = 10;
		assertEquals(expected, actual, "Sum is not correct");
	}

	@Test
	void testSubtract() {
		Calculator calculator = new Calculator();
		int a = 5;
		int b = 4;
		int actual = calculator.subtract(a, b);
		int expected = 1;
		assertEquals(expected, actual, "Sum is not correct");
	}

}
