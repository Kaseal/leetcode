package medium.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordSearchTest {

	private final WordSearch wordSearch = new WordSearch();

	@Test
	void test1() {
		Assertions.assertTrue(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
	}

	@Test
	void test2() {
		Assertions.assertTrue(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'},
				{'#', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
	}

	@Test
	void test3() {
		Assertions.assertFalse(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
	}

	@Test
	void test4() {
		Assertions.assertTrue(wordSearch.exist(new char[][]{{'A', 'B'}}, "BA"));
	}

	@Test
	void test5() {
		Assertions.assertTrue(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'},
				{'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCESEEEFS"));
	}

}