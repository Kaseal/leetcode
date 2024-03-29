package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

	private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

	@Test
	public void test1356_5() {
		int[] nums = {1, 3, 5, 6};

		Assertions.assertEquals(2, searchInsertPosition.searchInsert(nums, 5));
	}

	@Test
	public void test1356_2() {
		int[] nums = {1, 3, 5, 6};

		Assertions.assertEquals(1, searchInsertPosition.searchInsert(nums, 2));
	}

	@Test
	public void test1356_7() {
		int[] nums = {1, 3, 5, 6};

		Assertions.assertEquals(4, searchInsertPosition.searchInsert(nums, 7));
	}

	@Test
	public void test1356_0() {
		int[] nums = {1, 3, 5, 6};

		Assertions.assertEquals(0, searchInsertPosition.searchInsert(nums, 0));
	}

	@Test
	public void test1_0() {
		int[] nums = {1};

		Assertions.assertEquals(0, searchInsertPosition.searchInsert(nums, 0));
	}

	@Test
	public void test234789_11() {
		int[] nums = {2, 3, 4, 7, 8, 9};

		Assertions.assertEquals(6, searchInsertPosition.searchInsert(nums, 11));
	}

	@Test
	public void test234810_0() {
		int[] nums = {2, 3, 4, 8, 10};

		Assertions.assertEquals(0, searchInsertPosition.searchInsert(nums, 0));
	}

	@Test
	public void test1234510_2() {
		Assertions.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 2, 3, 4, 5, 10}, 2));
	}

}