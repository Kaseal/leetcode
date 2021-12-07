package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

	private final RomanToInteger romanToInteger = new RomanToInteger();

	@Test
	public void testIII() {
		Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
	}

	@Test
	public void testIV() {
		Assertions.assertEquals(4, romanToInteger.romanToInt("IV"));
	}

	@Test
	public void testIX() {
		Assertions.assertEquals(9, romanToInteger.romanToInt("IX"));
	}

	@Test
	public void testLVIII() {
		Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
	}

	@Test
	public void testMCMXCIV() {
		Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
	}

}