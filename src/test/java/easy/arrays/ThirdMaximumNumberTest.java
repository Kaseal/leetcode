package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThirdMaximumNumberTest {

	private final ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

	@Test
	public void test321() {
		Assertions.assertEquals(1, thirdMaximumNumber.thirdMax(new int[]{3, 2, 1}));
	}

	@Test
	public void test12() {
		Assertions.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 2}));
	}

	@Test
	public void test2231() {
		Assertions.assertEquals(1, thirdMaximumNumber.thirdMax(new int[]{2, 2, 3, 1}));
	}

	@Test
	public void test112() {
		Assertions.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 1, 2}));
	}

	@Test
	public void test122() {
		Assertions.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 2, 2}));
	}

	@Test
	public void test122535() {
		Assertions.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 2, 2, 5, 3, 5}));
	}

}