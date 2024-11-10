package medium.hash_map_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DetermineIfTwoStringsAreCloseTest {

	private final DetermineIfTwoStringsAreClose instance = new DetermineIfTwoStringsAreClose();

	@Test
	void test1() {
		Assertions.assertTrue(instance.closeStrings("abc", "bca"));
	}

	@Test
	void test2() {
		Assertions.assertFalse(instance.closeStrings("a", "aa"));
	}

	@Test
	void test3() {
		Assertions.assertTrue(instance.closeStrings("cabbba", "abbccc"));
	}

	@Test
	void test4() {
		Assertions.assertFalse(instance.closeStrings("abbzzca", "babzzcz"));
	}

	@Test
	void test5() {
		Assertions.assertFalse(instance.closeStrings("uau", "ssx"));
	}

}