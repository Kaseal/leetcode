package easy.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumAverageSubarrayITest {

	private final MaximumAverageSubarrayI instance = new MaximumAverageSubarrayI();

	@Test
	void test1() {
		Assertions.assertEquals(12.75000d, instance.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
	}

	@Test
	void test2() {
		Assertions.assertEquals(5.00000d, instance.findMaxAverage(new int[]{5}, 1));
	}

	@Test
	void test3() {
		Assertions.assertEquals(2.00000d, instance.findMaxAverage(new int[]{0, 1, 1, 3, 3}, 4));
	}

	@Test
	void test4() {
		int[] ints = {8860, -853, 6534, 4477, -4589, 8646, -6155, -5577, -1656, -5779, -2619, -8604, -1358, -8009, 4983, 7063, 3104, -1560,
				4080, 2763, 5616, -2375, 2848, 1394, -7173, -5225, -8244, -809, 8025, -4072, -4391, -9579, 1407, 6700, 2421, -6685, 5481,
				-1732, -8892, -6645, 3077, 3287, -4149, 8701, -4393, -9070, -1777, 2237, -3253, -506, -4931, -7366, -8132, 5406, -6300,
				-275, -1908, 67, 3569, 1433, -7262, -437, 8303, 4498, -379, 3054, -6285, 4203, 6908, 4433, 3077, 2288, 9733, -8067, 3007,
				9725, 9669, 1362, -2561, -4225, 5442, -9006, -429, 160, -9234, -4444, 3586, -5711, -9506, -79, -4418, -4348, -5891};

		Assertions.assertEquals(-594.58065d, instance.findMaxAverage(ints, 93));
	}

}