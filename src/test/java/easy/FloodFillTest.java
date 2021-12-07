package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FloodFillTest {

	private final FloodFill floodFill = new FloodFill();

	@Test
	public void test1() {
		Assertions.assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}},
				floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
	}

	@Test
	public void test2() {
		Assertions.assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}},
				floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
	}

}