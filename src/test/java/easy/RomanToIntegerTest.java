package easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

	private final RomanToInteger romanToInteger = new RomanToInteger();

	@Test
	public void testIII() {
		Assert.assertEquals(3, romanToInteger.romanToInt("III"));
	}

	@Test
	public void testIV() {
		Assert.assertEquals(4, romanToInteger.romanToInt("IV"));
	}

	@Test
	public void testIX() {
		Assert.assertEquals(9, romanToInteger.romanToInt("IX"));
	}

	@Test
	public void testLVIII() {
		Assert.assertEquals(58, romanToInteger.romanToInt("LVIII"));
	}

	@Test
	public void testMCMXCIV() {
		Assert.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
	}

}