package easy;

//733. Flood Fill (Easy)
public class FloodFill {

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];

		if (color != newColor) {
			fill(image, sr, sc, color, newColor);
		}

		return image;
	}

	private void fill(int[][] image, int i, int j, int color, int newColor) {
		if (image[i][j] == color) {
			image[i][j] = newColor;
			if (i >= 1) {
				fill(image, i - 1, j, color, newColor);
			}
			if (j >= 1) {
				fill(image, i, j - 1, color, newColor);
			}
			if (i + 1 < image.length) {
				fill(image, i + 1, j, color, newColor);
			}
			if (j + 1 < image[i].length) {
				fill(image, i, j + 1, color, newColor);
			}
		}
	}

}
