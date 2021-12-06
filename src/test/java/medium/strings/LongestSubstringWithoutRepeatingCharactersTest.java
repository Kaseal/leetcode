package medium.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

	private final LongestSubstringWithoutRepeatingCharacters instance = new LongestSubstringWithoutRepeatingCharacters();

	@Test
	public void test1() {
		Assertions.assertEquals(3, instance.lengthOfLongestSubstring("abcabcbb"));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(1, instance.lengthOfLongestSubstring("bbbbb"));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(3, instance.lengthOfLongestSubstring("pwwkew"));
	}

	@Test
	public void test4() {
		Assertions.assertEquals(0, instance.lengthOfLongestSubstring(""));
	}

}