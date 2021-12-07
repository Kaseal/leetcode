package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {

	private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

	@Test
	public void testHelloWorld() {
		Assertions.assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
	}

	@Test
	public void testSpace() {
		Assertions.assertEquals(0, lengthOfLastWord.lengthOfLastWord(" "));
	}

	@Test
	public void testA() {
		Assertions.assertEquals(1, lengthOfLastWord.lengthOfLastWord("a"));
	}

	@Test
	public void testASpace() {
		Assertions.assertEquals(1, lengthOfLastWord.lengthOfLastWord("a "));
	}

}