package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsSubsequenceTest {

	private final IsSubsequence instance = new IsSubsequence();

	@Test
	void test1() {
		Assertions.assertTrue(instance.isSubsequence("abc", "ahbgdc"));
	}

	@Test
	void test2() {
		Assertions.assertFalse(instance.isSubsequence("axc", "ahbgdc"));
	}

}