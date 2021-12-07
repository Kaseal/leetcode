package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxAreaOfIslandTest {

	private final MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();

	@Test
	public void test1() {
		int[][] arr = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
				{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
				{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

		Assertions.assertEquals(6, maxAreaOfIsland.maxAreaOfIsland(arr));
	}

	@Test
	public void test2() {
		int[][] arr = {{0, 0, 0, 0, 0, 0, 0, 0}};

		Assertions.assertEquals(0, maxAreaOfIsland.maxAreaOfIsland(arr));
	}

	@Test
	public void test3() {
		int[][] arr = {{1, 1, 0, 0, 0},
				{1, 1, 0, 0, 0},
				{0, 0, 0, 1, 1},
				{0, 0, 0, 1, 1}};

		Assertions.assertEquals(4, maxAreaOfIsland.maxAreaOfIsland(arr));
	}

}