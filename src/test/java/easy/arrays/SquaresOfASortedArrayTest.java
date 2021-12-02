package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquaresOfASortedArrayTest {

	private final SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

	@Test
	void name1() {
		Assertions.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, squaresOfASortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
	}

	@Test
	void test2() {
		Assertions.assertArrayEquals(new int[]{4, 9, 9, 49, 121}, squaresOfASortedArray.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
	}

}