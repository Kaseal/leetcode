package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CanPlaceFlowersTest {

	private final CanPlaceFlowers instance = new CanPlaceFlowers();

	@Test
	void test1() {
		Assertions.assertTrue(instance.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
	}

	@Test
	void test2() {
		Assertions.assertFalse(instance.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
	}

	@Test
	void test3() {
		Assertions.assertTrue(instance.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));
	}

	@Test
	void test4() {
		Assertions.assertTrue(instance.canPlaceFlowers(new int[]{0}, 1));
	}

	@Test
	void test5() {
		Assertions.assertFalse(instance.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 4));
	}

}