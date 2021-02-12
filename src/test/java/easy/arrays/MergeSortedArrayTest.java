package easy.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

	private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

	@Test
	public void test123000__3_256__3() {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] expectedArray = {1, 2, 2, 3, 5, 6};

		mergeSortedArray.merge(nums1, 3, new int[]{2, 5, 6}, 3);

		Assert.assertArrayEquals(expectedArray, nums1);
	}

	@Test
	public void test1__1_emtpy__0() {
		int[] nums1 = {1};
		int[] expectedArray = {1};

		mergeSortedArray.merge(nums1, 1, new int[]{}, 0);

		Assert.assertArrayEquals(expectedArray, nums1);
	}

	@Test
	public void test123000__3_456__3() {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] expectedArray = {1, 2, 3, 4, 5, 6};

		mergeSortedArray.merge(nums1, 3, new int[]{4, 5, 6}, 3);

		Assert.assertArrayEquals(expectedArray, nums1);
	}

}