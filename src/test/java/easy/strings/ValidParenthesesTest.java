package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

	private final ValidParentheses validParentheses = new ValidParentheses();

	@Test
	public void test1() {
		Assertions.assertTrue(validParentheses.isValid("()"));
	}

	@Test
	public void test2() {
		Assertions.assertTrue(validParentheses.isValid("()[]{}"));
	}

	@Test
	public void test3() {
		Assertions.assertFalse(validParentheses.isValid("(]"));
	}

	@Test
	public void test4() {
		Assertions.assertFalse(validParentheses.isValid("([)]"));
	}

	@Test
	public void test5() {
		Assertions.assertTrue(validParentheses.isValid("{[]}"));
	}

	@Test
	public void test6() {
		Assertions.assertFalse(validParentheses.isValid("(){}}{"));
	}

	@Test
	public void test7() {
		Assertions.assertFalse(validParentheses.isValid("({{{{}}}))"));
	}

	@Test
	public void test8() {
		Assertions.assertFalse(validParentheses.isValid("({[)"));
	}

	@Test
	public void test9() {
		Assertions.assertFalse(validParentheses.isValid("]"));
	}

	@Test
	public void test10() {
		Assertions.assertFalse(validParentheses.isValid(")(){}"));
	}

	@Test
	public void test11() {
		Assertions.assertFalse(validParentheses.isValid("(])"));
	}

}