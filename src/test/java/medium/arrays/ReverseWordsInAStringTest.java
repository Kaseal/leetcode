package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseWordsInAStringTest {

	private final ReverseWordsInAString instance = new ReverseWordsInAString();

	@Test
	void test1() {
		Assertions.assertEquals("blue is sky the", instance.reverseWords("the sky is blue"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("world hello", instance.reverseWords("  hello world  "));
	}

	@Test
	void test3() {
		Assertions.assertEquals("example good a", instance.reverseWords("a good   example"));
	}

}