package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

	private final IntegerToRoman integerToRoman = new IntegerToRoman();

	@Test
	public void test3() {
		Assertions.assertEquals("III", integerToRoman.intToRoman(3));
	}

	@Test
	public void test4() {
		Assertions.assertEquals("IV", integerToRoman.intToRoman(4));
	}

	@Test
	public void test9() {
		Assertions.assertEquals("IX", integerToRoman.intToRoman(9));
	}

	@Test
	public void test58() {
		Assertions.assertEquals("LVIII", integerToRoman.intToRoman(58));
	}

	@Test
	public void test1994() {
		Assertions.assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
	}

}