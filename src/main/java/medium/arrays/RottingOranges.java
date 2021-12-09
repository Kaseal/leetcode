package medium.arrays;

import java.util.LinkedList;
import java.util.Queue;

//994. Rotting Oranges (Medium)
public class RottingOranges {

	public int orangesRotting(int[][] grid) {
		int minutes = 0;
		int cellCount = grid.length * grid[0].length;

		Queue<int[]> queue = new LinkedList<>();

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 2) {
					queue.add(new int[]{i, j});
					cellCount--;
				} else if (grid[i][j] == 0) {
					cellCount--;
				}
			}
		}

		if (queue.isEmpty()) {
			return cellCount > 0 ? -1 : 0;
		}

		while (!queue.isEmpty() && cellCount > 0) {
			int size = queue.size();
			minutes++;

			for (int k = 0; k < size; k++) {
				int[] cell = queue.poll();

				int i = cell[0];
				int j = cell[1];

				if (i >= 1) {
					if (grid[i - 1][j] == 1) {
						grid[i - 1][j] = 2;
						queue.add(new int[]{i - 1, j});
						cellCount--;
					}
				}
				if (j >= 1) {
					if (grid[i][j - 1] == 1) {
						grid[i][j - 1] = 2;
						queue.add(new int[]{i, j - 1});
						cellCount--;
					}
				}
				if (i < grid.length - 1) {
					if (grid[i + 1][j] == 1) {
						grid[i + 1][j] = 2;
						queue.add(new int[]{i + 1, j});
						cellCount--;
					}
				}
				if (j < grid[0].length - 1) {
					if (grid[i][j + 1] == 1) {
						grid[i][j + 1] = 2;
						queue.add(new int[]{i, j + 1});
						cellCount--;
					}
				}
			}
		}

		return cellCount == 0 ? minutes : -1;
	}

}
