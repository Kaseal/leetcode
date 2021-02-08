package medium;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {

	private final IntegerToRoman integerToRoman = new IntegerToRoman();

	@Test
	public void test3() {
		Assert.assertEquals("III", integerToRoman.intToRoman(3));
	}

	@Test
	public void test4() {
		Assert.assertEquals("IV", integerToRoman.intToRoman(4));
	}

	@Test
	public void test9() {
		Assert.assertEquals("IX", integerToRoman.intToRoman(9));
	}

	@Test
	public void test58() {
		Assert.assertEquals("LVIII", integerToRoman.intToRoman(58));
	}

	@Test
	public void test1994() {
		Assert.assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
	}

}