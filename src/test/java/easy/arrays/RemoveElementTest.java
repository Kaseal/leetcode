package easy.arrays;

import common.helper_classes.Utils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

	private final RemoveElement removeElement = new RemoveElement();

	@Test
	public void test3223_3() {
		int[] nums = {3, 2, 2, 3};
		int[] expectedNums = {2, 2};

		Assert.assertEquals(2, removeElement.removeElement(nums, 3));
		Assert.assertTrue(Utils.compareFirstExpectedNumsLengthDigits(expectedNums, nums));
	}

	@Test
	public void test01223042_2() {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		int[] expectedNums = {0, 1, 3, 0, 4};

		Assert.assertEquals(5, removeElement.removeElement(nums, 2));
		Assert.assertTrue(Utils.compareFirstExpectedNumsLengthDigits(expectedNums, nums));
	}

}