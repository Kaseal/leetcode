package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

	private final ValidPalindrome validPalindrome = new ValidPalindrome();

	@Test
	void test_A_man_a_plan_a_canal_Panama() {
		Assertions.assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
	}

	@Test
	void test_race_a_car() {
		Assertions.assertFalse(validPalindrome.isPalindrome("race a car"));
	}

}