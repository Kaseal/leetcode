package easy.arrays;

import common.helper_classes.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

	private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

	@Test
	public void test112() {
		int[] nums = {1, 1, 2};
		int[] expectedNums = {1, 2};

		Assertions.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(nums));
		Assertions.assertTrue(Utils.compareFirstExpectedNumsLengthDigits(expectedNums, nums));
	}

	@Test
	public void test0011122334() {
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int[] expectedNums = {0, 1, 2, 3, 4};

		Assertions.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(nums));
		Assertions.assertTrue(Utils.compareFirstExpectedNumsLengthDigits(expectedNums, nums));
	}

}