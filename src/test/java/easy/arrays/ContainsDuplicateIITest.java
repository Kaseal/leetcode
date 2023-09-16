package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {

	private final ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();

	@Test
	void test1() {
		int [] nums = {1, 2, 3, 1};

		Assertions.assertTrue(containsDuplicateII.containsNearbyDuplicate(nums, 3));
	}

	@Test
	void test2() {
		int [] nums = {1, 0, 1, 1};

		Assertions.assertTrue(containsDuplicateII.containsNearbyDuplicate(nums, 1));
	}

	@Test
	void test3() {
		int [] nums = {1, 2, 3, 1, 2, 3};

		Assertions.assertFalse(containsDuplicateII.containsNearbyDuplicate(nums, 2));
	}

}