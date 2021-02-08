package hard;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToEnglishWordsTest {

	private final IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();

	@Test
	public void test123() {
		Assert.assertEquals("One Hundred Twenty Three", integerToEnglishWords.numberToWords(123));
	}

	@Test
	public void test12345() {
		Assert.assertEquals("Twelve Thousand Three Hundred Forty Five", integerToEnglishWords.numberToWords(12345));
	}

	@Test
	public void test1234567() {
		Assert.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
				integerToEnglishWords.numberToWords(1234567));
	}

	@Test
	public void test1234567891() {
		Assert.assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty " +
				"Seven Thousand Eight Hundred Ninety One", integerToEnglishWords.numberToWords(1234567891));
	}

	@Test
	public void test0() {
		Assert.assertEquals("Zero", integerToEnglishWords.numberToWords(0));
	}

	@Test
	public void test100() {
		Assert.assertEquals("One Hundred", integerToEnglishWords.numberToWords(100));
	}

	@Test
	public void test1000() {
		Assert.assertEquals("One Thousand", integerToEnglishWords.numberToWords(1000));
	}

	@Test
	public void test1000000() {
		Assert.assertEquals("One Million", integerToEnglishWords.numberToWords(1000000));
	}

	@Test
	public void test1000000000() {
		Assert.assertEquals("One Billion", integerToEnglishWords.numberToWords(1000000000));
	}

}