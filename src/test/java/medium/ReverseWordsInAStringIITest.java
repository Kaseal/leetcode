package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseWordsInAStringIITest {

	private final ReverseWordsInAStringII reverseWordsInAStringII = new ReverseWordsInAStringII();

	@Test
	void test1() {
		char[] s = {'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
		char[] expected = {'b', 'l', 'u', 'e', ' ', 'i', 's', ' ', 's', 'k', 'y', ' ', 't', 'h', 'e'};

		reverseWordsInAStringII.reverseWords(s);

		Assertions.assertArrayEquals(expected, s);
	}

	@Test
	void test2() {
		char[] s = {'a'};
		char[] expected = {'a'};

		reverseWordsInAStringII.reverseWords(s);

		Assertions.assertArrayEquals(expected, s);
	}

}