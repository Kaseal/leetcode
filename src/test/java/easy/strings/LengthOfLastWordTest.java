package easy.strings;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

	private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

	@Test
	public void testHelloWorld() {
		Assert.assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
	}

	@Test
	public void testSpace() {
		Assert.assertEquals(0, lengthOfLastWord.lengthOfLastWord(" "));
	}

	@Test
	public void testA() {
		Assert.assertEquals(1, lengthOfLastWord.lengthOfLastWord("a"));
	}

	@Test
	public void testASpace() {
		Assert.assertEquals(1, lengthOfLastWord.lengthOfLastWord("a "));
	}

}