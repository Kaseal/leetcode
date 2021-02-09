package easy;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

	private final PlusOne plusOne = new PlusOne();

	@Test
	public void test123() {
		int[] digits = {1, 2, 3};
		int[] expectedDigits = {1, 2, 4};

		Assert.assertArrayEquals(expectedDigits, plusOne.plusOne(digits));
	}

	@Test
	public void test4321() {
		int[] digits = {4, 3, 2, 1};
		int[] expectedDigits = {4, 3, 2, 2};

		Assert.assertArrayEquals(expectedDigits, plusOne.plusOne(digits));
	}

	@Test
	public void test0() {
		int[] digits = {0};
		int[] expectedDigits = {1};

		Assert.assertArrayEquals(expectedDigits, plusOne.plusOne(digits));
	}

	@Test
	public void test9876543210() {
		int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] expectedDigits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 1};

		Assert.assertArrayEquals(expectedDigits, plusOne.plusOne(digits));
	}

	@Test
	public void test00() {
		int[] digits = {0, 0};
		int[] expectedDigits = {0, 1};

		Assert.assertArrayEquals(expectedDigits, plusOne.plusOne(digits));
	}

	@Test
	public void test000() {
		int[] digits = {0, 0, 0};
		int[] expectedDigits = {0, 0, 1};

		Assert.assertArrayEquals(expectedDigits, plusOne.plusOne(digits));
	}

	@Test
	public void test9() {
		int[] digits = {9};
		int[] expectedDigits = {1, 0};

		Assert.assertArrayEquals(expectedDigits, plusOne.plusOne(digits));
	}

	@Test
	public void test99() {
		int[] digits = {9, 9};
		int[] expectedDigits = {1, 0, 0};

		Assert.assertArrayEquals(expectedDigits, plusOne.plusOne(digits));
	}

}