package medium.search;

//79. Word Search (Medium)
public class WordSearch {

	public boolean exist(char[][] board, String word) {
		int rows = board.length;
		int cols = board[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				boolean[][] visited = new boolean[rows][cols];

				if (board[i][j] == word.charAt(0) && search(board, i, j, word, 0, visited)) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean search(char[][] board, int i, int j, String word, int index, boolean[][] visited) {
		visited[i][j] = true;

		if (++index == word.length()) {
			return true;
		}

		boolean directionUp = false;
		boolean directionLeft = false;
		boolean directionDown = false;
		boolean directionRight = false;

		if (i - 1 >= 0 && !visited[i - 1][j] && board[i - 1][j] == word.charAt(index)) {
			directionUp = search(board, i - 1, j, word, index, visited);
		}

		if (j - 1 >= 0 && !visited[i][j - 1] && board[i][j - 1] == word.charAt(index)) {
			directionLeft = search(board, i, j - 1, word, index, visited);
		}

		if (i + 1 < board.length && !visited[i + 1][j] && board[i + 1][j] == word.charAt(index)) {
			directionDown = search(board, i + 1, j, word, index, visited);
		}

		if (j + 1 < board[0].length && !visited[i][j + 1] && board[i][j + 1] == word.charAt(index)) {
			directionRight = search(board, i, j + 1, word, index, visited);
		}

		visited[i][j] = directionUp || directionLeft || directionDown || directionRight;

		return visited[i][j];
	}

}
