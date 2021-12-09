package medium.arrays;

import java.util.LinkedList;

//@Hard
//542. 01 Matrix (Medium)
public class Matrix_01 {

	public int[][] updateMatrix(int[][] mat) {
		int rows = mat.length;
		if (rows == 0) {
			return mat;
		}
		int cols = mat[0].length;

		int[][] dist = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				dist[i][j] = Integer.MAX_VALUE - 100000;
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] == 0) {
					dist[i][j] = 0;
				} else {
					if (i > 0) {
						dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
					}
					if (j > 0) {
						dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
					}
				}
			}
		}

		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 0; j--) {
				if (i < rows - 1) {
					dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1);
				}
				if (j < cols - 1) {
					dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
				}
			}
		}
		return dist;
	}

	public int[][] _updateMatrix(int[][] mat) {
		int rows = mat.length;
		if (rows == 0) {
			return mat;
		}
		int cols = mat[0].length;

		int[][] dist = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				dist[i][j] = Integer.MAX_VALUE;
			}
		}

		LinkedList<int[][]> queue = new LinkedList<>();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] == 0) {
					dist[i][j] = 0;
					queue.push(new int[][]{{i, j}});
				}
			}
		}

		int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		while (!queue.isEmpty()) {
			int[][] curr = queue.pollFirst();

			for (int i = 0; i < 4; i++) {
				int newR = curr[0][0] + dir[i][0];
				int newC = curr[0][1] + dir[i][1];

				if (newR >= 0 && newC >= 0 && newR < rows && newC < cols) {
					if (dist[newR][newC] > dist[curr[0][0]][curr[0][1]] + 1) {
						dist[newR][newC] = dist[curr[0][0]][curr[0][1]] + 1;
						queue.push(new int[][]{{newR, newC}});
					}
				}
			}
		}
		return dist;
	}

}
