package hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerToEnglishWordsTest {

	private final IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();

	@Test
	public void test123() {
		Assertions.assertEquals("One Hundred Twenty Three", integerToEnglishWords.numberToWords(123));
	}

	@Test
	public void test12345() {
		Assertions.assertEquals("Twelve Thousand Three Hundred Forty Five", integerToEnglishWords.numberToWords(12345));
	}

	@Test
	public void test1234567() {
		Assertions.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
				integerToEnglishWords.numberToWords(1234567));
	}

	@Test
	public void test1234567891() {
		Assertions.assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty " +
				"Seven Thousand Eight Hundred Ninety One", integerToEnglishWords.numberToWords(1234567891));
	}

	@Test
	public void test0() {
		Assertions.assertEquals("Zero", integerToEnglishWords.numberToWords(0));
	}

	@Test
	public void test100() {
		Assertions.assertEquals("One Hundred", integerToEnglishWords.numberToWords(100));
	}

	@Test
	public void test1000() {
		Assertions.assertEquals("One Thousand", integerToEnglishWords.numberToWords(1000));
	}

	@Test
	public void test1000000() {
		Assertions.assertEquals("One Million", integerToEnglishWords.numberToWords(1000000));
	}

	@Test
	public void test1000000000() {
		Assertions.assertEquals("One Billion", integerToEnglishWords.numberToWords(1000000000));
	}

}