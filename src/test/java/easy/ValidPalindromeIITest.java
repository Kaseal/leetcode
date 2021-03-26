package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeIITest {

	private final ValidPalindromeII validPalindromeII = new ValidPalindromeII();

	@Test
	void test_aba() {
		Assertions.assertTrue(validPalindromeII.validPalindrome("aba"));
	}

	@Test
	void test_abca() {
		Assertions.assertTrue(validPalindromeII.validPalindrome("abca"));
	}

	@Test
	void test_eccer() {
		Assertions.assertTrue(validPalindromeII.validPalindrome("eccer"));
	}

	@Test
	void test_abc() {
		Assertions.assertFalse(validPalindromeII.validPalindrome("abc"));
	}

	@Test
	void test_eddze() {
		Assertions.assertTrue(validPalindromeII.validPalindrome("eddze"));
	}

	@Test
	void test_eeccccbebaeeabebccceea() {
		Assertions.assertFalse(validPalindromeII.validPalindrome("eeccccbebaeeabebccceea"));
	}

	@Test
	void test_deeee() {
		Assertions.assertTrue(validPalindromeII.validPalindrome("deeee"));
	}

}