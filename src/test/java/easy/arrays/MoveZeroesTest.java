package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

	private final MoveZeroes moveZeroes = new MoveZeroes();

	@Test
	public void test1() {
		int[] nums = {0, 1, 0, 3, 12};
		moveZeroes.moveZeroes(nums);

		Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
	}

	@Test
	public void test2() {
		int[] nums = {0};
		moveZeroes.moveZeroes(nums);

		Assertions.assertArrayEquals(new int[]{0}, nums);
	}

	@Test
	public void test3() {
		int[] nums = {1, 0, 0};
		moveZeroes.moveZeroes(nums);

		Assertions.assertArrayEquals(new int[]{1, 0, 0}, nums);
	}

	@Test
	public void test4() {
		int[] nums = {1};
		moveZeroes.moveZeroes(nums);

		Assertions.assertArrayEquals(new int[]{1}, nums);
	}

	@Test
	public void test5() {
		int[] nums = {1, 0};
		moveZeroes.moveZeroes(nums);

		Assertions.assertArrayEquals(new int[]{1, 0}, nums);
	}

	@Test
	public void test6() {
		int[] nums = {2, 1};
		moveZeroes.moveZeroes(nums);

		Assertions.assertArrayEquals(new int[]{2, 1}, nums);
	}

	@Test
	public void test7() {
		int[] nums = {1, 0, 0};
		moveZeroes.moveZeroes(nums);

		Assertions.assertArrayEquals(new int[]{1, 0, 0}, nums);
	}

}