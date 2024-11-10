package medium.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {
	private final MaximumNumberOfVowelsInASubstringOfGivenLength instance = new MaximumNumberOfVowelsInASubstringOfGivenLength();

	@Test
	void test1() {
		Assertions.assertEquals(3, instance.maxVowels("abciiidef", 3));
	}

	@Test
	void test2() {
		Assertions.assertEquals(2, instance.maxVowels("aeiou", 2));
	}

	@Test
	void test3() {
		Assertions.assertEquals(2, instance.maxVowels("leetcode", 3));
	}

}