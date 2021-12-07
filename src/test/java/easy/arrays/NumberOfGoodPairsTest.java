package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfGoodPairsTest {

	private final NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();

	@Test
	public void test123113() {
		int[] nums = {1, 2, 3, 1, 1, 3};

		Assertions.assertEquals(4, numberOfGoodPairs.numIdenticalPairs(nums));
	}

	@Test
	public void test1111() {
		int[] nums = {1, 1, 1, 1};

		Assertions.assertEquals(6, numberOfGoodPairs.numIdenticalPairs(nums));
	}

	@Test
	public void test123() {
		int[] nums = {1, 2, 3};

		Assertions.assertEquals(0, numberOfGoodPairs.numIdenticalPairs(nums));
	}

}