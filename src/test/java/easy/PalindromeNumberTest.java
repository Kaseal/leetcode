package easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

	private final PalindromeNumber palindromeNumber = new PalindromeNumber();

	@Test
	public void test121() {
		Assert.assertTrue(palindromeNumber.isPalindrome(121));
	}

	@Test
	public void testMinus121() {
		Assert.assertFalse(palindromeNumber.isPalindrome(-121));
	}

	@Test
	public void test10() {
		Assert.assertFalse(palindromeNumber.isPalindrome(10));
	}

	@Test
	public void testMinus101() {
		Assert.assertFalse(palindromeNumber.isPalindrome(-101));
	}

}