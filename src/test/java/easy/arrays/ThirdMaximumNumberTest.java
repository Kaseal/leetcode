package easy.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ThirdMaximumNumberTest {

	private final ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

	@Test
	public void test321() {
		Assert.assertEquals(1, thirdMaximumNumber.thirdMax(new int[]{3, 2, 1}));
	}

	@Test
	public void test12() {
		Assert.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 2}));
	}

	@Test
	public void test2231() {
		Assert.assertEquals(1, thirdMaximumNumber.thirdMax(new int[]{2, 2, 3, 1}));
	}

	@Test
	public void test112() {
		Assert.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 1, 2}));
	}

	@Test
	public void test122() {
		Assert.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 2, 2}));
	}

	@Test
	public void test122535() {
		Assert.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 2, 2, 5, 3, 5}));
	}

}