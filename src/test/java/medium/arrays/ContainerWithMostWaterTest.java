package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

	private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

	@Test
	void test1() {
		Assertions.assertEquals(49, containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
	}

	@Test
	void test2() {
		Assertions.assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 1}));
	}

	@Test
	void test3() {
		Assertions.assertEquals(16, containerWithMostWater.maxArea(new int[]{4, 3, 2, 1, 4}));
	}

	@Test
	void test4() {
		Assertions.assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 2}));
	}

}