package easy.arrays;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfGoodPairsTest {

	private final NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();

	@Test
	public void test123113() {
		int[] nums = {1, 2, 3, 1, 1, 3};

		Assert.assertEquals(4, numberOfGoodPairs.numIdenticalPairs(nums));
	}

	@Test
	public void test1111() {
		int[] nums = {1, 1, 1, 1};

		Assert.assertEquals(6, numberOfGoodPairs.numIdenticalPairs(nums));
	}

	@Test
	public void test123() {
		int[] nums = {1, 2, 3};

		Assert.assertEquals(0, numberOfGoodPairs.numIdenticalPairs(nums));
	}

}