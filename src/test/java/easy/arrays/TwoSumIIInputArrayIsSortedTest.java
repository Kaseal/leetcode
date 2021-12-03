package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumIIInputArrayIsSortedTest {

	private final TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted();

	@Test
	public void test1() {
		Assertions.assertArrayEquals(new int[]{1, 2}, twoSumIIInputArrayIsSorted.twoSum(new int[]{2, 7, 11, 15}, 9));
	}

	@Test
	public void test2() {
		Assertions.assertArrayEquals(new int[]{1, 3}, twoSumIIInputArrayIsSorted.twoSum(new int[]{2, 3, 4}, 6));
	}

	@Test
	public void test3() {
		Assertions.assertArrayEquals(new int[]{1, 2}, twoSumIIInputArrayIsSorted.twoSum(new int[]{-1, 0}, -1));
	}

	@Test
	public void test4() {
		Assertions.assertArrayEquals(new int[]{1, 2}, twoSumIIInputArrayIsSorted.twoSum(new int[]{-3, 3, 4, 90}, 0));
	}

}