package medium.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationInStringTest {

	private final PermutationInString permutationInString = new PermutationInString();

	@Test
	void test1() {
		Assertions.assertTrue(permutationInString.checkInclusion("ab", "eidbaooo"));
	}

	@Test
	void test2() {
		Assertions.assertFalse(permutationInString.checkInclusion("ab", "eidboaoo"));
	}

	@Test
	void test3() {
		Assertions.assertTrue(permutationInString.checkInclusion("ab", "ab"));
	}

	@Test
	void test4() {
		Assertions.assertTrue(permutationInString.checkInclusion("abc", "bbbca"));
	}

	@Test
	void test5() {
		Assertions.assertTrue(permutationInString.checkInclusion("adc", "dcda"));
	}

	@Test
	void test6() {
		Assertions.assertFalse(permutationInString.checkInclusion("hello", "ooolleoooleh"));
	}

	@Test
	void test7() {
		Assertions.assertFalse(permutationInString.checkInclusion("ab", "a"));
	}

}