import org.junit.Assert;
import org.junit.Test;

public class IntegerToEnglishWordsTest {

	private final IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();

	@Test
	public void test123() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(123), "One Hundred Twenty Three");
	}

	@Test
	public void test12345() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(12345), "Twelve Thousand Three Hundred Forty Five");
	}

	@Test
	public void test1234567() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(1234567),
				"One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven");
	}

	@Test
	public void test1234567891() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(1234567891),
				"One Billion Two Hundred Thirty Four Million Five Hundred Sixty " +
						"Seven Thousand Eight Hundred Ninety One");
	}

	@Test
	public void test0() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(0), "Zero");
	}

	@Test
	public void test100() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(100), "One Hundred");
	}

	@Test
	public void test1000() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(1000), "One Thousand");
	}

	@Test
	public void test1000000() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(1000000), "One Million");
	}

	@Test
	public void test1000000000() {
		Assert.assertEquals(integerToEnglishWords.numberToWords(1000000000), "One Billion");
	}

}