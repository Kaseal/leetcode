package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleTheArrayTest {

	private final ShuffleTheArray shuffleTheArray = new ShuffleTheArray();

	@Test
	public void test2_5_1_3_4_7__3() {
		int[] nums = {2, 5, 1, 3, 4, 7};
		int[] expectedNums = {2, 3, 5, 4, 1, 7};

		Assertions.assertArrayEquals(expectedNums, shuffleTheArray.shuffle(nums, 3));
	}

	@Test
	public void test1_2_3_4_4_3_2_1__4() {
		int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
		int[] expectedNums = {1, 4, 2, 3, 3, 2, 4, 1};

		Assertions.assertArrayEquals(expectedNums, shuffleTheArray.shuffle(nums, 4));
	}

	@Test
	public void test1_1_2_2__2() {
		int[] nums = {1, 1, 2, 2};
		int[] expectedNums = {1, 2, 1, 2};

		Assertions.assertArrayEquals(expectedNums, shuffleTheArray.shuffle(nums, 2));
	}

}