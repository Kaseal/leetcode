package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

	private final MaximumSubarray maximumSubarray = new MaximumSubarray();

	@Test
	void test1() {
		Assertions.assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

	@Test
	void test2() {
		Assertions.assertEquals(1, maximumSubarray.maxSubArray(new int[]{1}));
	}

	@Test
	void test3() {
		Assertions.assertEquals(23, maximumSubarray.maxSubArray(new int[]{5, 4, -1, 7, 8}));
	}

}