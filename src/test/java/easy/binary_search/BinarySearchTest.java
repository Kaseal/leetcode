package easy.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

	private final BinarySearch binarySearch = new BinarySearch();

	@Test
	void test1() {
		Assertions.assertEquals(4, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
	}

	@Test
	void test2() {
		Assertions.assertEquals(-1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
	}

}