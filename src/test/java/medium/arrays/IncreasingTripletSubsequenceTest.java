package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IncreasingTripletSubsequenceTest {

	private final IncreasingTripletSubsequence instance = new IncreasingTripletSubsequence();

	@Test
	void test1() {
		Assertions.assertTrue(instance.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
	}

	@Test
	void test2() {
		Assertions.assertFalse(instance.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
	}

	@Test
	void test3() {
		Assertions.assertTrue(instance.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
	}

	@Test
	void test4() {
		Assertions.assertTrue(instance.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
	}

	@Test
	void test5() {
		Assertions.assertFalse(instance.increasingTriplet(new int[]{2, 4, -2, -3}));
	}

	@Test
	void test6() {
		Assertions.assertTrue(instance.increasingTriplet(new int[]{4, 5, 2147483647, 1, 2}));
	}

}