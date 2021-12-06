package easy.strings;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

	private final ValidParentheses validParentheses = new ValidParentheses();

	@Test
	public void test1() {
		Assert.assertTrue(validParentheses.isValid("()"));
	}

	@Test
	public void test2() {
		Assert.assertTrue(validParentheses.isValid("()[]{}"));
	}

	@Test
	public void test3() {
		Assert.assertFalse(validParentheses.isValid("(]"));
	}

	@Test
	public void test4() {
		Assert.assertFalse(validParentheses.isValid("([)]"));
	}

	@Test
	public void test5() {
		Assert.assertTrue(validParentheses.isValid("{[]}"));
	}

	@Test
	public void test6() {
		Assert.assertFalse(validParentheses.isValid("(){}}{"));
	}

	@Test
	public void test7() {
		Assert.assertFalse(validParentheses.isValid("({{{{}}}))"));
	}

	@Test
	public void test8() {
		Assert.assertFalse(validParentheses.isValid("({[)"));
	}

	@Test
	public void test9() {
		Assert.assertFalse(validParentheses.isValid("]"));
	}

	@Test
	public void test10() {
		Assert.assertFalse(validParentheses.isValid(")(){}"));
	}

	@Test
	public void test11() {
		Assert.assertFalse(validParentheses.isValid("(])"));
	}

}