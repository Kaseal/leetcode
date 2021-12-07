package easy.arrays;

import common.helper_classes.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

	private final RemoveElement removeElement = new RemoveElement();

	@Test
	public void test3223_3() {
		int[] nums = {3, 2, 2, 3};
		int[] expectedNums = {2, 2};

		Assertions.assertEquals(2, removeElement.removeElement(nums, 3));
		Assertions.assertTrue(Utils.compareFirstExpectedNumsLengthDigits(expectedNums, nums));
	}

	@Test
	public void test01223042_2() {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		int[] expectedNums = {0, 1, 3, 0, 4};

		Assertions.assertEquals(5, removeElement.removeElement(nums, 2));
		Assertions.assertTrue(Utils.compareFirstExpectedNumsLengthDigits(expectedNums, nums));
	}

}