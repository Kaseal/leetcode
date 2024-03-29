package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

	private final TwoSum twoSum = new TwoSum();

	@Test
	public void test2_7_11_15__9() {
		Assertions.assertArrayEquals(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
	}

	@Test
	public void test3_2_4__6() {
		Assertions.assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
	}

	@Test
	public void test3_3__6() {
		Assertions.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3, 3}, 6));
	}

	@Test
	public void test3_2_3__6() {
		Assertions.assertArrayEquals(new int[]{0, 2}, twoSum.twoSum(new int[]{3, 2, 3}, 6));
	}

	@Test
	public void test2_5_5_11__10() {
		Assertions.assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{2, 5, 5, 11}, 10));
	}

}