package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

	private final ProductOfArrayExceptSelf instance = new ProductOfArrayExceptSelf();

	@Test
	void test1() {
		Assertions.assertArrayEquals(new int[]{24, 12, 8, 6}, instance.productExceptSelf(new int[]{1, 2, 3, 4}));
	}

	@Test
	void test2() {
		Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, instance.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
	}

}