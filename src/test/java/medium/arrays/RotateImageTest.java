package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateImageTest {
	private final RotateImage rotateImage = new RotateImage();

	@Test
	void test1() {
		int[][] input = new int[3][3];
		input[0] = new int[]{1, 2, 3};
		input[1] = new int[]{4, 5, 6};
		input[2] = new int[]{7, 8, 9};

		rotateImage.rotate(input);

		Assertions.assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, input);
	}

	@Test
	void test2() {
		int[][] input = new int[4][4];
		input[0] = new int[]{5, 1, 9, 11};
		input[1] = new int[]{2, 4, 8, 10};
		input[2] = new int[]{13, 3, 6, 7};
		input[3] = new int[]{15, 14, 12, 16};

		rotateImage.rotate(input);

		Assertions.assertArrayEquals(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}, input);
	}

}