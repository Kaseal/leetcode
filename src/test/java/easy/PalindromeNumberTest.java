package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

	private final PalindromeNumber palindromeNumber = new PalindromeNumber();

	@Test
	public void test121() {
		Assertions.assertTrue(palindromeNumber.isPalindrome(121));
	}

	@Test
	public void testMinus121() {
		Assertions.assertFalse(palindromeNumber.isPalindrome(-121));
	}

	@Test
	public void test10() {
		Assertions.assertFalse(palindromeNumber.isPalindrome(10));
	}

	@Test
	public void testMinus101() {
		Assertions.assertFalse(palindromeNumber.isPalindrome(-101));
	}

}