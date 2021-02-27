package easy.arrays;

import org.junit.Assert;
import org.junit.Test;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

	private final HowManyNumbersAreSmallerThanTheCurrentNumber instance = new HowManyNumbersAreSmallerThanTheCurrentNumber();

	@Test
	public void test8_1_2_2_3() {
		Assert.assertArrayEquals(new int[]{4, 0, 1, 1, 3}, instance.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
	}

	@Test
	public void test6_5_4_8() {
		Assert.assertArrayEquals(new int[]{2, 1, 0, 3}, instance.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}));
	}

	@Test
	public void test7_7_7_7() {
		Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, instance.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}));
	}

}