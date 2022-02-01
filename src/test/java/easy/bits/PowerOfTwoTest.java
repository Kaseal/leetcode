package easy.bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

	private final PowerOfTwo powerOfTwo = new PowerOfTwo();

	@Test
	public void test1() {
		Assertions.assertTrue(powerOfTwo.isPowerOfTwo(1));
	}

	@Test
	public void test2() {
		Assertions.assertTrue(powerOfTwo.isPowerOfTwo(16));
	}

	@Test
	public void test3() {
		Assertions.assertFalse(powerOfTwo.isPowerOfTwo(3));
	}

	@Test
	public void test4() {
		Assertions.assertTrue(powerOfTwo.isPowerOfTwo(4));
	}

	@Test
	public void test5() {
		Assertions.assertFalse(powerOfTwo.isPowerOfTwo(5));
	}

}