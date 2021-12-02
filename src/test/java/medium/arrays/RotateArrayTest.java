package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

	private final RotateArray rotateArray = new RotateArray();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		rotateArray.rotate(nums, 3);

		Assertions.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
	}

	@Test
	public void test2() {
		int[] nums = {-1, -100, 3, 99};
		rotateArray.rotate(nums, 2);

		Assertions.assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
	}

	@Test
	public void test3() {
		int[] nums = {-1};
		rotateArray.rotate(nums, 2);

		Assertions.assertArrayEquals(new int[]{-1}, nums);
	}

	@Test
	public void test4() {
		int[] nums = {1, 2};
		rotateArray.rotate(nums, 3);

		Assertions.assertArrayEquals(new int[]{2, 1}, nums);
	}

	@Test
	public void test5() {
		int[] nums = {1, 2, 3};
		rotateArray.rotate(nums, 4);

		Assertions.assertArrayEquals(new int[]{3, 1, 2}, nums);
	}

}