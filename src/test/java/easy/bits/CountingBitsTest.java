package easy.bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingBitsTest {

	private final CountingBits instance = new CountingBits();

	@Test
	void test1() {
		int[] result = instance.countBits(2);

		Assertions.assertArrayEquals(new int[]{0, 1, 1}, result);
	}

	@Test
	void test2() {
		int[] result = instance.countBits(5);

		Assertions.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, result);
	}

}