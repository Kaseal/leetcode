package easy.hash_map_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniqueNumberOfOccurrencesTest {

	private UniqueNumberOfOccurrences instance = new UniqueNumberOfOccurrences();

	@Test
	void test1() {
		Assertions.assertTrue(instance.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
	}

	@Test
	void test2() {
		Assertions.assertFalse(instance.uniqueOccurrences(new int[]{1, 2}));
	}

	@Test
	void test3() {
		Assertions.assertTrue(instance.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
	}

}