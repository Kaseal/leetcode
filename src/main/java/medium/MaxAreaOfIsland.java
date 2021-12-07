package medium;

//695. Max Area of Island (Medium)
public class MaxAreaOfIsland {

	public int maxAreaOfIsland(int[][] grid) {
		int maxArea = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					maxArea = Math.max(maxArea, defineIsland(grid, i, j));
				}
			}
		}

		return maxArea;
	}

	private int defineIsland(int[][] grid, int i, int j) {
		int maxArea = 0;
		if (grid[i][j] == 1) {
			grid[i][j] = 0;
			maxArea++;
			if (i >= 1) {
				maxArea += defineIsland(grid, i - 1, j);
			}
			if (i + 1 < grid.length) {
				maxArea += defineIsland(grid, i + 1, j);
			}
			if (j + 1 < grid[i].length) {
				maxArea += defineIsland(grid, i, j + 1);
			}
			if (j >= 1) {
				maxArea += defineIsland(grid, i, j - 1);
			}
		}
		return maxArea;
	}

}
