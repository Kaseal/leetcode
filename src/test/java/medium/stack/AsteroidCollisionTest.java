package medium.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AsteroidCollisionTest {

	private final AsteroidCollision instance = new AsteroidCollision();

	@Test
	void test1() {
		Assertions.assertArrayEquals(new int[]{5, 10}, instance.asteroidCollision(new int[]{5, 10, -5}));
	}

	@Test
	void test2() {
		Assertions.assertArrayEquals(new int[]{}, instance.asteroidCollision(new int[]{8, -8}));
	}

	@Test
	void test3() {
		Assertions.assertArrayEquals(new int[]{10}, instance.asteroidCollision(new int[]{10, 2, -5}));
	}

	@Test
	void test4() {
		Assertions.assertArrayEquals(new int[]{-2, -1, 1, 2}, instance.asteroidCollision(new int[]{-2, -1, 1, 2}));
	}

	@Test
	void test5() {
		Assertions.assertArrayEquals(new int[]{-2, -2, -2}, instance.asteroidCollision(new int[]{-2, -2, 1, -2}));
	}

	@Test
	void test6() {
		Assertions.assertArrayEquals(new int[]{-2, -2, -2}, instance.asteroidCollision(new int[]{1, -2, -2, -2}));
	}

}