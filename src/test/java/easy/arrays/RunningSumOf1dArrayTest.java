package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningSumOf1dArrayTest {

	private final RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();

	@Test
	public void test1_2_3_4() {
		int[] nums = {1, 2, 3, 4};
		int[] expectedNums = {1, 3, 6, 10};

		Assertions.assertArrayEquals(expectedNums, runningSumOf1dArray.runningSum(nums));
	}

	@Test
	public void test1_1_1_1_1() {
		int[] nums = {1, 1, 1, 1, 1};
		int[] expectedNums = {1, 2, 3, 4, 5};

		Assertions.assertArrayEquals(expectedNums, runningSumOf1dArray.runningSum(nums));
	}

	@Test
	public void test3_1_2_10_1() {
		int[] nums = {3, 1, 2, 10, 1};
		int[] expectedNums = {3, 4, 6, 16, 17};

		Assertions.assertArrayEquals(expectedNums, runningSumOf1dArray.runningSum(nums));
	}

}