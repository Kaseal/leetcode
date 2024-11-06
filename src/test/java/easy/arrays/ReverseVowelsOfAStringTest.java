package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseVowelsOfAStringTest {
	private final ReverseVowelsOfAString instance = new ReverseVowelsOfAString();

	@Test
	void test1() {
		Assertions.assertEquals("AceCreIm", instance.reverseVowels("IceCreAm"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("leetcode", instance.reverseVowels("leotcede"));
	}

}