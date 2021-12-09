package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Matrix_01Test {

	private final Matrix_01 matrix_01 = new Matrix_01();

	@Test
	public void test1() {
		Assertions.assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}},
				matrix_01.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
	}

	@Test
	public void test2() {
		Assertions.assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}},
				matrix_01.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}));
	}

	@Test
	public void test3() {
		Assertions.assertArrayEquals(new int[][]{{0, 1, 0, 1, 2}, {1, 1, 0, 0, 1}, {0, 0, 0, 1, 0}, {1, 0, 1, 1, 1}, {1, 0, 0, 0, 1}},
				matrix_01.updateMatrix(new int[][]{{0, 1, 0, 1, 1}, {1, 1, 0, 0, 1}, {0, 0, 0, 1, 0}, {1, 0, 1, 1, 1}, {1, 0, 0, 0, 1}}));
	}

}