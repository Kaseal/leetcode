package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxNumberOfKSumPairsTest {

	private final MaxNumberOfKSumPairs instance = new MaxNumberOfKSumPairs();

	@Test
	void test1() {
		Assertions.assertEquals(2, instance.maxOperations(new int[]{1, 2, 3, 4}, 5));
	}

	@Test
	void test2() {
		Assertions.assertEquals(1, instance.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
	}

}